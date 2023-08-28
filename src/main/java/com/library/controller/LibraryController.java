package com.library.controller;

import com.library.domain.CustomerDto;
import com.library.domain.RentDto;
import com.library.service.CustomerService;
import com.library.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class LibraryController {

    @Autowired
    CustomerService customerService;
    @Autowired
    RentService rentService;

    @GetMapping("modify")
    public String modify(CustomerDto customerDto, Integer cust_no, Model m){
        //수정화면 jsp 파일에서 placeholder와 비슷한 default값을 주기 위해서는 (input 태그에 값이 미리 입력되어 있도록) readByCustid를 해서 값을 넘겨줘야 한다.
        try {
            customerDto = customerService.readByCustNo(cust_no);
            m.addAttribute(customerDto);
            m.addAttribute("cust_no", cust_no);
            m.addAttribute("mode","mod");
        } catch (Exception e) {
            e.printStackTrace();
        }
////        System.out.println(cust_no);
//        m.addAttribute("cust_no", cust_no);
//        m.addAttribute("mode","mod");
        return "customerRegister";
    }

    @PostMapping("modify")
    public String modify(Integer cust_no, CustomerDto customerDto, Model m, RedirectAttributes rattr, HttpServletRequest request)  {
        try {
            customerDto.setCust_no(cust_no);
            System.out.println(customerDto.getCust_no());
            int rowCnt = customerService.modify(customerDto);
            if (rowCnt != 1) throw new Exception("수정이 정상적으로 이루어지지 않았습니다.");

            rattr.addFlashAttribute("msg", "MOD_OK");
        } catch (Exception e) {
            rattr.addFlashAttribute("msg", "MOD_ERR");
        }

        return "redirect:/list";
    }
    @GetMapping("rent-list")
    public String rentList(Model m){
        try {
            List<RentDto> list = rentService.readAll();
            m.addAttribute("list", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "rentList";
    }

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
            m.addAttribute("customerDto", customerDto);

//            m.addAttribute("cust_no", customerDto.getCust_no());
//            m.addAttribute("cust_name", customerDto.getCust_name());
//            m.addAttribute("join_date", customerDto.getJoin_date());
//            m.addAttribute("phone", customerDto.getPhone());
//            m.addAttribute("cust_email", customerDto.getCust_email());
//            m.addAttribute("grade", customerDto.getGrade());


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "customerModify";
    }
    @GetMapping("/write")
    public String write(Model m){
        m.addAttribute("mode", "new");
        return "customerRegister";
    }


    @PostMapping("/write")
    public String write(CustomerDto customerDto, Model m, RedirectAttributes rattr){
        try {
            int rowCnt = customerService.register(customerDto);
            if (rowCnt!=1){
                throw new Exception("등록이 정상적으로 이루어지지 않았습니다.");
            }
            //System.out.println("success");
            rattr.addFlashAttribute("msg", "REG_OK");
            return  "redirect:/list";

        } catch (Exception e) {
            e.printStackTrace();
            m.addAttribute(customerDto);
            rattr.addFlashAttribute("msg", "REG_ERR");
            return "customerRegister";
        }
    }


}
