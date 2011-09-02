package com.jiuhua.user.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiuhua.comm.Page;
import com.jiuhua.user.dao.UserDao;
import com.jiuhua.user.entity.User;

@Service
@Transactional
public class UserService {
    @Resource(name = "userDao")
    private UserDao dao;

    /**
     * 分页查询用户列表
     * 
     * @param page
     * @param user
     * @return
     */
    public Map<String, Object> queryUserList(Page<User> page, User user) {
        page = dao.queryUserList(page, user);
        Map<String, Object> map = new HashMap<String, Object>();
        if (!page.getResult().isEmpty()) {
            map.put("total", page.getTotalCount());
            map.put("rows", page.getResult());
            return map;
        }
        map.put("total", "");
        map.put("rows", "");
        return map;
    }

    /**
     * 保存用户
     */
    public Map<String, Object> saveUser(User user) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (dao.saveUser(user)) {
            map.put("success", "true");
            return map;
        }
        map.put("success", "false");
        return map;
    }

    /**
     * 删除用户
     */
    public Map<String, Object> delUser(String ids) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (dao.delUser(ids)) {
            map.put("success", "true");
            return map;
        }
        map.put("success", "false");
        return map;
    }
}
