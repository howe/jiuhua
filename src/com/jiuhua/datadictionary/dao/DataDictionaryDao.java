package com.jiuhua.datadictionary.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.jiuhua.comm.MyHibernateDaoSupport;
import com.jiuhua.datadictionary.entity.DataDictionaryType;

@Repository
public class DataDictionaryDao extends MyHibernateDaoSupport {

    /**
     * 保存数据字典类型
     */
    public boolean saveDataDictionaryTpye(DataDictionaryType dataDictionaryType) {
        if (dataDictionaryType != null) {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            session.saveOrUpdate(dataDictionaryType);
            ts.commit();
            return true;
        }
        return false;
    }

    /**
     * 查询所有数据字典类型 返回easyui Json非异步树
     */
    @SuppressWarnings("unchecked")
    public List<DataDictionaryType> queryAllDataDictionaryType() {
        return getSession().createCriteria(DataDictionaryType.class).list();
    }

    /**
     * 通过数据字典类型主键删除数据字典类型
     */
    public boolean delDataDictionaryTpye(String ids) {
        if (ids != null && !ids.trim().equalsIgnoreCase("")) {
            Session session = getSession();
            String[] tmp = ids.split(",");
            Transaction ts = session.beginTransaction();
            for (String s : tmp) {
                DataDictionaryType dataDictionaryTpye = (DataDictionaryType) session.get(DataDictionaryType.class,
                        Integer.valueOf(s));
                if (dataDictionaryTpye != null) {
                    session.delete(dataDictionaryTpye);
                }
            }
            ts.commit();
            return true;
        }
        return false;
    }

    /**
     * 通过数据字典类型主键查询数据字典类型
     */
    public DataDictionaryType queryDataDictionaryTypeById(int id) {
        Criteria criteria = getSession().createCriteria(DataDictionaryType.class);
        criteria.add(Restrictions.eq("id", id));
        return (DataDictionaryType) criteria.uniqueResult();
    }
}
