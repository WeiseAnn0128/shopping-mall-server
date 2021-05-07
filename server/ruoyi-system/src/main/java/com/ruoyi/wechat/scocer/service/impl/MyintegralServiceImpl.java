package com.ruoyi.wechat.scocer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.wechat.scocer.service.IMyintegralService;
import com.ruoyi.wechat.scocer.domain.Myintegral;
import com.ruoyi.wechat.scocer.mapper.MyintegralMapper;


/**
 * myintegralService业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-07
 */
@Service
public class MyintegralServiceImpl implements IMyintegralService 
{
    @Autowired
    private MyintegralMapper myintegralMapper;

    /**
     * 查询myintegral
     * 
     * @param userName myintegralID
     * @return myintegral
     */
    @Override
    public Myintegral selectMyintegralById(String userName)
    {
        return myintegralMapper.selectMyintegralById(userName);
    }

    /**
     * 查询myintegral列表
     * 
     * @param myintegral myintegral
     * @return myintegral
     */
    @Override
    public List<Myintegral> selectMyintegralList(Myintegral myintegral)
    {
        return myintegralMapper.selectMyintegralList(myintegral);
    }

    /**
     * 新增myintegral
     * 
     * @param myintegral myintegral
     * @return 结果
     */
    @Override
    public int insertMyintegral(Myintegral myintegral)
    {
        return myintegralMapper.insertMyintegral(myintegral);
    }

    /**
     * 修改myintegral
     * 
     * @param myintegral myintegral
     * @return 结果
     */
    @Override
    public int updateMyintegral(Myintegral myintegral)
    {
        return myintegralMapper.updateMyintegral(myintegral);
    }

    /**
     * 批量删除myintegral
     * 
     * @param userNames 需要删除的myintegralID
     * @return 结果
     */
    @Override
    public int deleteMyintegralByIds(String[] userNames)
    {
        return myintegralMapper.deleteMyintegralByIds(userNames);
    }

    /**
     * 删除myintegral信息
     * 
     * @param userName myintegralID
     * @return 结果
     */
    @Override
    public int deleteMyintegralById(String userName)
    {
        return myintegralMapper.deleteMyintegralById(userName);
    }
}
