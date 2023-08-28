package com.library.service;

import com.library.domain.RentDto;

import java.util.List;

public interface RentService {
    List<RentDto> readAll() throws Exception;
}
