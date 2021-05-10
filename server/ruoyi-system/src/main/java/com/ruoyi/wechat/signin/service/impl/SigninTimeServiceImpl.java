package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SigninTimeMapper;
import com.ruoyi.system.domain.SigninTime;
import com.ruoyi.system.service.ISigninTimeService;

/**
 * 签到时间Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-10
 */
@Service
public class SigninTimeServiceImpl implements ISigninTimeService 
{
    @Autowired
    private SigninTimeMapper signinTimeMapper;

    /**
     * 查询签到时间
     * 
     * @param id 签到时间ID
     * @return 签到时间
     */
    @Override
    public SigninTime selectSigninTimeById(Long id)
    {
        return signinTimeMapper.selectSigninTimeById(id);
    }

    /**
     * 查询签到时间列表
     * 
     * @param signinTime 签到时间
     * @return 签到时间
     */
    @Override
    public List<SigninTime> selectSigninTimeList(SigninTime signinTime)
    {
        return signinTimeMapper.selectSigninTimeList(signinTime);
    }

    /**
     * 新增签到时间
     * 
     * @param signinTime 签到时间
     * @return 结果
     */
    @Override
    public int insertSigninTime(SigninTime signinTime)
    {
        return signinTimeMapper.insertSigninTime(signinTime);
    }

    /**
     * 修改签到时间
     * 
     * @param signinTime 签到时间
     * @return 结果
     */
    @Override
    public int updateSigninTime(SigninTime signinTime)
    {
        return signinTimeMapper.updateSigninTime(signinTime);
    }

    /**
     * 批量删除签到时间
     * 
     * @param ids 需要删除的签到时间ID
     * @return 结果
     */
    @Override
    public int deleteSigninTimeByIds(Long[] ids)
    {
        return signinTimeMapper.deleteSigninTimeByIds(ids);
    }

    /**
     * 删除签到时间信息
     * 
     * @param id 签到时间ID
     * @return 结果
     */
    @Override
    public int deleteSigninTimeById(Long id)
    {
        return signinTimeMapper.deleteSigninTimeById(id);
    }
}
