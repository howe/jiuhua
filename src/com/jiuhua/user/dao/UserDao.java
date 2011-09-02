package com.jiuhua.user.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import com.jiuhua.comm.MyHibernateDaoSupport;
import com.jiuhua.comm.Page;
import com.jiuhua.user.entity.User;

@Repository
public class UserDao extends MyHibernateDaoSupport {

    /**
     * 分页查询用户列表
     * 
     * @param page
     * @param user
     * @return
     */
    @SuppressWarnings("unchecked")
    public Page<User> queryUserList(Page<User> page, User user) {
        Criteria criteria = this.getSession().createCriteria(User.class);

        if (page != null) {// 分页
            int totalRows = ((Long) criteria.setProjection(Projections.rowCount()).uniqueResult()).intValue();
            criteria.setProjection(null);
            criteria.setResultTransformer(CriteriaSpecification.ROOT_ENTITY);

            criteria.setFirstResult(page.getFirst() - 1);
            criteria.setMaxResults(page.getFirst() + page.getPageSize() - 1);
            page.setTotalCount(totalRows);
        } else {// 不分页
            page = new Page<User>();
        }
        criteria.addOrder(Order.asc("username"));// 根据人员姓名降序排序

        List<User> list = criteria.list();
        if (!list.isEmpty()) {
            page.setResult(list);
        }

        return page;
    }

    /**
     * 保存用户
     */
    public boolean saveUser(User user) {
        if (user != null) {
            Session session = this.getSession();
            Transaction ts = session.beginTransaction();
            session.save(user);
            ts.commit();
            return true;
        }
        return false;
    }

    /**
     * 删除用户 为方便测试，暂未作软删除
     */
    public boolean delUser(String ids) {
        if (ids != null && !ids.trim().equalsIgnoreCase("")) {
            Session session = this.getSession();
            String[] tmp = ids.split(",");
            Transaction ts = session.beginTransaction();
            for (String s : tmp) {
                User user = (User) session.get(User.class, Integer.valueOf(s));
                if (user != null) {
                    session.delete(user);
                }
            }
            ts.commit();
            return true;
        }
        return false;
    }

}
