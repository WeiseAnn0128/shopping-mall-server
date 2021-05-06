package com.ruoyi.service;

import com.ruoyi.Logistics;

public interface LogisticsService {
    Logistics findByAppcode(String appcode);

    Logistics findByNu(String nu);

    Logistics findCom(String com);
}
