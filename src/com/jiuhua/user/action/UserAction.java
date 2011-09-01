package com.jiuhua.user.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jiuhua.comm.Page;
import com.jiuhua.user.entity.User;
import com.jiuhua.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    UserService service;

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
     * 分页查询用户列表
     */
    @RequestMapping(value = "/queryAllUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> queryUserList(Page<User> page, User user) {
        return service.queryUserList(page, user);
    }

    /**
     * 保存用户
     */
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> saveUser(User user) {
        return service.saveUser(user);
    }

    /**
     * 删除用户
     */
    @RequestMapping(value = "/delUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> delUser(int id) {
        return service.delUser(id);
    }

}
