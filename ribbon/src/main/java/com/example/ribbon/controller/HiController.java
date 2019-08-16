package com.example.ribbon.controller;

import com.example.ribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HiController {

    @Autowired
    HiService hiService;

    @ResponseBody
    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return hiService.getHi(name);
    }
}
