package com.library.service;

import com.library.dao.RentDao;
import com.library.domain.CustomerDto;
import com.library.domain.RentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentServiceImpl implements RentService {

    @Autowired
    RentDao rentDao;

    @Override
    public List<RentDto> readAll() throws Exception{
        return rentDao.selectAll();
    }
}
