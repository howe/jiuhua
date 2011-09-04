package com.jiuhua.datadictionary.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jiuhua.datadictionary.entity.DataDictionaryType;
import com.jiuhua.datadictionary.service.DataDictionaryService;

@Controller
@RequestMapping("/datadict")
public class DataDictionaryAction {
    @Autowired
    DataDictionaryService service;

    /**
     * 后台数据字典管理界面
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("datadictionary/datadictionary");
        return mv;
    }

    /**
     * 保存数据字典类型
     */
    @RequestMapping(value = "/saveDataDictionaryTpye", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> saveDataDictionaryTpye(DataDictionaryType dataDictionaryType) {
        return service.saveDataDictionaryTpye(dataDictionaryType);
    }

    /**
     * 查询所有数据字典类型 返回easyui Json非异步树
     */
    @RequestMapping(value = "/queryAllDataDictionaryType", method = RequestMethod.POST)
    @ResponseBody
    public List<DataDictionaryType> queryAllDataDictionaryType() {
        return service.queryAllDataDictionaryType();
    }

    /**
     * 通过数据字典类型主键删除数据字典类型
     */
    @RequestMapping(value = "/delDataDictionaryTpye", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> delDataDictionaryTpye(String ids) {
        return service.delDataDictionaryTpye(ids);
    }

    /**
     * 通过数据字典类型主键查询数据字典类型
     */
    @RequestMapping(value = "/queryDataDictionaryTypeById", method = RequestMethod.POST)
    @ResponseBody
    public DataDictionaryType queryDataDictionaryTypeById(int id) {
        return service.queryDataDictionaryTypeById(id);
    }
}
