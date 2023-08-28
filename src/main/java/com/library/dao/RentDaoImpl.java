package com.library.dao;

import com.library.domain.RentDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RentDaoImpl implements RentDao {
    @Autowired
    private SqlSession session;
    private static String namespace = "com.library.dao.LibraryMapper.";

    @Override
    public List<RentDto> selectAll() throws Exception{
        return session.selectList(namespace+"selectRentAll");
    }

}
