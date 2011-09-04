package com.jiuhua.datadictionary.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiuhua.datadictionary.dao.DataDictionaryDao;
import com.jiuhua.datadictionary.entity.DataDictionaryType;

@Service
@Transactional
public class DataDictionaryService {
    @Resource(name = "dataDictionaryDao")
    private DataDictionaryDao dao;

    /**
     * 保存数据字典类型
     */
    public Map<String, Object> saveDataDictionaryTpye(DataDictionaryType dataDictionaryType) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (dao.saveDataDictionaryTpye(dataDictionaryType)) {
            map.put("success", "true");
            return map;
        }
        map.put("success", "false");
        return map;
    }

    /**
     * 查询所有数据字典类型 返回easyui Json非异步树
     */
    public List<DataDictionaryType> queryAllDataDictionaryType() {
        return dao.queryAllDataDictionaryType();
    }

    /**
     * 通过数据字典类型主键删除数据字典类型
     */
    public Map<String, Object> delDataDictionaryTpye(String ids) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (dao.delDataDictionaryTpye(ids)) {
            map.put("success", "true");
            return map;
        }
        map.put("success", "false");
        return map;
    }

    /**
     * 通过数据字典类型主键查询数据字典类型
     */
    public DataDictionaryType queryDataDictionaryTypeById(int id) {
        return dao.queryDataDictionaryTypeById(id);
    }

}
