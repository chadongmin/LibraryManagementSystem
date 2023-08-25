package com.library.dao;

import com.library.domain.CustomerDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class CustomerDaoImpl implements CustomerDao{

    @Autowired
    private SqlSession session;
    private static String namespace = "com.library.dao.LibraryMapper.";

    @Override
    public CustomerDto selectByCustNo(int cust_no) throws Exception{
        return session.selectOne(namespace+"selectByCustNo", cust_no);
    }
    @Override
    public List<CustomerDto> selectAll() throws Exception{
        return session.selectList(namespace+"selectAll");
    }

    @Override
    public int insert(CustomerDto customerDto) throws Exception{
        return session.insert(namespace+"insert", customerDto);
    }

    @Override
    public int deleteAll() throws Exception{
        return session.delete(namespace+"deleteAll");
    }

    @Override
    public int delete(int cust_no, String cust_name) throws Exception{
        Map map = new HashMap<>();
        map.put("cust_no", cust_no);
        map.put("cust_name", cust_name);
        return session.delete(namespace+"delete", map);
    }

    @Override
    public int update(CustomerDto customerDto) throws Exception{
        return session.update(namespace+"update", customerDto);
    }


}
