package com.library.controller;

import com.library.domain.CustomerDto;
import com.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.util.List;

@Controller
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    CustomerService customerService;
    @GetMapping("/list")
    public String list(Model m) {
        try {
            List<CustomerDto> list = customerService.readAll();
            //System.out.println(list);
            m.addAttribute("list", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "customerList";
    }
    @GetMapping("/read")
    public String read(Integer cust_no, HttpServletRequest request, Model m){
        try {
//            Integer cust_no = request.getParameter(read);
            CustomerDto customerDto = customerService.readByCustNo(cust_no);
            System.out.println(cust_no);
            m.addAttribute("cust_no", customerDto.getCust_no());
            m.addAttribute("cust_name", customerDto.getCust_name());
            m.addAttribute("join_date", customerDto.getJoin_date());
            m.addAttribute("phone", customerDto.getPhone());
            m.addAttribute("cust_email", customerDto.getCust_email());
            m.addAttribute("grade", customerDto.getGrade());


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "customer";

    }


}
