package com.library.dao;

import com.library.domain.CustomerDto;

import java.util.List;

public interface CustomerDao {
    CustomerDto selectByName(String cust_name) throws Exception;

    List<CustomerDto> selectAll() throws Exception;

    int insert(CustomerDto customerDto) throws Exception;

    int deleteAll() throws Exception;

    int delete(int cust_no, String cust_name) throws Exception;

    int update(CustomerDto customerDto) throws Exception;
}
