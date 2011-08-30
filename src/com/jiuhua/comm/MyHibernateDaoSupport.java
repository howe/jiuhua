package com.jiuhua.comm;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class MyHibernateDaoSupport extends HibernateDaoSupport {
    /*
     * HibernateDaoSupport提供设置SessionFactory的方法setSessionFactory()。然而，这个方法是终态，
     * 所以你不能覆盖这个方法注入SessionFactory
     * ，但是你可以写一个任意的方法，并在这个方法调用setSessionFactory()方法注入SessionFactory。 2011.8.31
     * (yangq)
     */
    @Autowired
    public void init(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
}
