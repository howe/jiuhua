package com.jiuhua.user.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiuhua.comm.DataGridModel;
import com.jiuhua.user.dao.UserDao;
import com.jiuhua.user.entity.User;

@Service
@Transactional
public class UserService {
    @Resource(name = "userDao")
    private UserDao dao;

    /**
     * 分页查询用户
     * 
     * @param datagrid
     * @param user
     * @return
     */
    public Map<String, Object> queryList(DataGridModel datagrid, User user) {
        dao.queryList(datagrid, user);
        return null;
    }
}
