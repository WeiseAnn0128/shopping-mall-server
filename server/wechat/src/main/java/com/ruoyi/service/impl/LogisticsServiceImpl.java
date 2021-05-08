package com.ruoyi.service.impl;

import com.ruoyi.service.LogisticsService;
import com.ruoyi.domain.Companies;

public class LogisticsServiceImpl implements LogisticsService {


    @Override
    public String findByNu(String nu) {
        return nu;
    }

    @Override
    public Companies findByCom(String com) {
        Companies c = new Companies();
        return c;
    }


}
