package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SigninTime;

/**
 * 签到时间Service接口
 * 
 * @author ruoyi
 * @date 2021-05-10
 */
public interface ISigninTimeService 
{
    /**
     * 查询签到时间
     * 
     * @param id 签到时间ID
     * @return 签到时间
     */
    public SigninTime selectSigninTimeById(Long id);

    /**
     * 查询签到时间列表
     * 
     * @param signinTime 签到时间
     * @return 签到时间集合
     */
    public List<SigninTime> selectSigninTimeList(SigninTime signinTime);

    /**
     * 新增签到时间
     * 
     * @param signinTime 签到时间
     * @return 结果
     */
    public int insertSigninTime(SigninTime signinTime);

    /**
     * 修改签到时间
     * 
     * @param signinTime 签到时间
     * @return 结果
     */
    public int updateSigninTime(SigninTime signinTime);

    /**
     * 批量删除签到时间
     * 
     * @param ids 需要删除的签到时间ID
     * @return 结果
     */
    public int deleteSigninTimeByIds(Long[] ids);

    /**
     * 删除签到时间信息
     * 
     * @param id 签到时间ID
     * @return 结果
     */
    public int deleteSigninTimeById(Long id);
}
