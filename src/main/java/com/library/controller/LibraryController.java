package com.library.controller;

import com.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    CustomerService customerService;
    @RequestMapping("/list")
    public String showIndexPage() {

        return "index";
    }


}
