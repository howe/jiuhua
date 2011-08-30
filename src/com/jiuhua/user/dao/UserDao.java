package com.jiuhua.user.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.jiuhua.comm.Page;
import com.jiuhua.user.entity.User;

@Repository
public class UserDao extends HibernateDaoSupport {

    @Autowired
    public void setSessionFactory0(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

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

}
