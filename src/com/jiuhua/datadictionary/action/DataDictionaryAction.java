package com.jiuhua.datadictionary.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

}
