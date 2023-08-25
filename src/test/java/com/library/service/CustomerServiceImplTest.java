package com.library.service;

import com.library.domain.CustomerDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;

    @Test
    public void readByCustNo() throws Exception{
        int cust_no = customerService.readAll().get(0).getCust_no();
        System.out.println(cust_no);
        CustomerDto customerDto = customerService.readByCustNo(cust_no);
        System.out.println(customerDto);

    }

    @Test
    public void readAll() throws Exception{
        System.out.println(customerService.readAll());
    }

    @Test
    public void register() throws Exception {
        CustomerDto customerDto = new CustomerDto("아이유", "010-1234-1234", "111@naver.com", "P");
        int rowCnt = customerService.register(customerDto);
        assertTrue(rowCnt==1);
    }

    @Test
    public void remove() throws Exception{
        CustomerDto customerDto = customerService.readAll().get(0);
        int rowCnt = customerService.remove(customerDto.getCust_no(), customerDto.getCust_name());
        assertTrue(rowCnt == 1);
    }

    @Test
    public void removeAll() throws Exception{
        customerService.removeAll();
        List<CustomerDto> list = customerService.readAll();
        assertTrue(list.size() == 0);
    }

    @Test
    public void modify() throws Exception {
        customerService.removeAll();

        CustomerDto customerDto = new CustomerDto("qqq", "010-0000-0000", "11111@naver.com", "P");
        int rowCnt = customerService.register(customerDto);
        assertTrue(rowCnt==1);

        System.out.println(customerDto);

        int cust_no = customerService.readAll().get(0).getCust_no();
        customerDto.setCust_no(cust_no);
        customerDto.setPhone("010-2222-2222");
        customerDto.setCust_email("asdfasdf");
        customerDto.setCust_name("dongmin");
        customerDto.setGrade("a");

        int rowCnt2 = customerService.modify(customerDto);
        assertTrue(rowCnt2 == 1);

        System.out.println(customerService.readAll());




    }
}