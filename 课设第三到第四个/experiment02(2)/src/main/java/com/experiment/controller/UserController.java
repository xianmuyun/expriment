package com.experiment.controller;
import com.experiment.mapper.UserMapper;
import com.experiment.pojo.User;
import com.experiment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/loginPage")
    public String loginPage() {

        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request,User user) {
        User user1 = userService.findUser(user);
        if (user1 != null) {
            request.setAttribute("wrongIdOrPassword", "");
            User.key = user.getEmail();
            return "redirect:/showAllCourses";
        }
        request.setAttribute("wrongIdOrPassword", "账号或密码错误！请重新输入！");
        return "login";
    }
    @RequestMapping("/goreg")
    public String goreg() {

        return "reg";
    }
    @RequestMapping("/reg")
    public String reg(User user) {
        User u = userService.checkReg(user.getEmail());
        if (u == null) {
            userService.addOne(user);
            return "regok";
        }
        return "regno";
    }
}
