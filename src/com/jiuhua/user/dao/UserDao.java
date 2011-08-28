package com.jiuhua.user.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jiuhua.comm.DataGridModel;
import com.jiuhua.user.entity.User;

@Repository
public class UserDao {
    private SimpleJdbcTemplate simpleJdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
    }

    public void queryList(DataGridModel datagrid, User user) {
        StringBuilder sb = new StringBuilder();

    }

}
