package com.library.dao;

import com.library.domain.RentDto;

import java.util.List;

public interface RentDao {
    List<RentDto> selectAll() throws Exception;

    List<RentDto> selectTotalRentPrice() throws Exception;
}
