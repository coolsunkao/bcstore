package com.twoguys.bcstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: gaojiewang
 * Date: 13-12-2
 * Time: 下午11:21
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/register",method = RequestMethod.POST)
    public void addUser(@RequestParam(value = "username") String userName,
                        @RequestParam(value = "password") String passwd) {

    }
}
