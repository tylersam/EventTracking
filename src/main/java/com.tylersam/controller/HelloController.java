package com.tylersam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tyler on 1/9/2015.
 */

@Controller
public class HelloController {

    @RequestMapping(value="/greeting")
    public String sayHello(Model model){
        model.addAttribute("greeting", "hello world");

        return "hello";
    }

    @RequestMapping(value = "/index")
    public String index(Model model){
        return "forward:index.jsp";
    }
}
