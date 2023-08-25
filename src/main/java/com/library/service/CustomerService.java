package com.library.service;

import com.library.domain.CustomerDto;

import java.util.List;

public interface CustomerService {
    CustomerDto readByCustNo(int cust_no) throws Exception;

    List<CustomerDto> readAll() throws Exception;

    int register(CustomerDto customerDto) throws Exception;

    int remove(int cust_no, String cust_name) throws Exception;

    int removeAll() throws Exception;

    int modify(CustomerDto customerDto) throws Exception;
}
