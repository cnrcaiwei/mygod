package com.fh.godway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by CaiWei on 2016/9/4.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = "/userLogin",method = RequestMethod.GET)
    public String logout(String userName, String passWord) {

        if (userName.equals("caiwei")&& passWord.equals("123")) {
            return "succ";
        }
        return "redirect:hello";
    }
}
