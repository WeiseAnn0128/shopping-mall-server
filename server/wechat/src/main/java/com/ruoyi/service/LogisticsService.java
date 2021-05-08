package com.ruoyi.service;

import com.ruoyi.domain.Companies;

public interface LogisticsService {


    String findByNu(String nu);//快递单号

    Companies findByCom(String com);//快递公司

}

