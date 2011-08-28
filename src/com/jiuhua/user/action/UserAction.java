package com.jiuhua.user.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jiuhua.comm.DataGridModel;
import com.jiuhua.user.entity.User;
import com.jiuhua.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    UserService userService;

    /**
     * 后台用户管理界面
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/user");
        return mv;
    }

    /**
     * 分页查询用户
     */
    @RequestMapping(value = "/queryAllUser", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> queryList(DataGridModel datagrid, User user) {
        return userService.queryList(datagrid, user);
    }
}
