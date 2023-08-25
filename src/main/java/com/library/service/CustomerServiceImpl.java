package com.library.service;

import com.library.dao.CustomerDao;
import com.library.domain.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public CustomerDto readByCustNo(int cust_no) throws Exception{
        return customerDao.selectByCustNo(cust_no)  ;
    }

    @Override
    public List<CustomerDto> readAll() throws Exception{
        return customerDao.selectAll();
    }

    @Override
    public int register(CustomerDto customerDto) throws Exception{
        return customerDao.insert(customerDto);
    }

    @Override
    public int remove(int cust_no, String cust_name) throws Exception{
        return customerDao.delete(cust_no, cust_name);
    }
    @Override
    public int removeAll() throws Exception{
        return customerDao.deleteAll();
    }
    @Override
    public int modify(CustomerDto customerDto) throws Exception{
        return customerDao.update(customerDto);
    }
}
