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
        //        select SQL_CALC_FOUND_ROWS * from tb_user LIMIT 0,2;
        //        select FOUND_ROWS();

        StringBuilder sb = new StringBuilder("select * from user where 1=1 ");
        int start = datagrid.getRows() * (datagrid.getPage() - 1);
        int end = start + datagrid.getRows();
        sb.append("limit ").append(start).append(",").append(end);

    }

}
