package com.lovo.web.controller;

import com.lovo.web.entity.UserEntity;
import com.lovo.web.service.IUserService;
import com.lovo.web.util.StringUtil;
import com.lovo.web.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    @ResponseBody
    public String login(UserVo vo, HttpServletRequest request){
        System.out.println(vo.getUserName()+"/"+vo.getPassword());
        ModelAndView mv = new ModelAndView();
//         查询用户是否存在
        UserEntity user = userService.userInfo(vo.getUserName(),vo.getPassword());
        if (null != user){
//            如果登录成功把user放入到session
            request.getSession().setAttribute("user",user);
            mv.addObject("loginInfo", StringUtil.LOGIN_OK);
        }
        return "ok";
    }
}
