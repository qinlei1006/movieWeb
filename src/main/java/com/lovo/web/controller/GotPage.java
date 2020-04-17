package com.lovo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GotPage {

    @RequestMapping("gotoLogin")
    public String gotoLogin(){
        return "login";
    }
}
