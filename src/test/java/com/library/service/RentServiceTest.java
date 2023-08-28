package com.library.service;

import com.library.domain.RentDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class RentServiceTest {

    @Autowired
    RentService rentService;
    @Test
    public void readAll() throws Exception {
        List<RentDto> list = rentService.readAll();
        System.out.println(list);
    }
}