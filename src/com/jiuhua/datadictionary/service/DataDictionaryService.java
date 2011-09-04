package com.jiuhua.datadictionary.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiuhua.datadictionary.dao.DataDictionaryDao;

@Service
@Transactional
public class DataDictionaryService {
    @Resource(name = "dataDictionaryDao")
    private DataDictionaryDao dao;

}
