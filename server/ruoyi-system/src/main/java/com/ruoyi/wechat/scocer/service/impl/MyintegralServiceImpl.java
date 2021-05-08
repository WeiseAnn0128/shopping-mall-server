package com.ruoyi.wechat.scocer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.wechat.scocer.mapper.MyintegralMapper;
import com.ruoyi.wechat.scocer.domain.Myintegral;
import com.ruoyi.wechat.scocer.service.IMyintegralService;

/**
 * 积分表Service业务层处理
 * 
 * @author ysq
 * @date 2021-05-08
 */
@Service
public class MyintegralServiceImpl implements IMyintegralService 
{
    @Autowired
    private MyintegralMapper myintegralMapper;

    /**
     * 查询积分表
     * 
     * @param id 积分表ID
     * @return 积分表
     */
    @Override
    public Myintegral selectMyintegralById(Integer id)
    {
        return myintegralMapper.selectMyintegralById(id);
    }

    /**
     * 查询积分表列表
     * 
     * @param myintegral 积分表
     * @return 积分表
     */
    @Override
    public List<Myintegral> selectMyintegralList(Myintegral myintegral)
    {
        return myintegralMapper.selectMyintegralList(myintegral);
    }

    /**
     * 新增积分表
     * 
     * @param myintegral 积分表
     * @return 结果
     */
    @Override
    public int insertMyintegral(Myintegral myintegral)
    {
        return myintegralMapper.insertMyintegral(myintegral);
    }

    /**
     * 修改积分表
     * 
     * @param myintegral 积分表
     * @return 结果
     */
    @Override
    public int updateMyintegral(Myintegral myintegral)
    {
        return myintegralMapper.updateMyintegral(myintegral);
    }

    /**
     * 批量删除积分表
     * 
     * @param ids 需要删除的积分表ID
     * @return 结果
     */
    @Override
    public int deleteMyintegralByIds(Integer[] ids)
    {
        return myintegralMapper.deleteMyintegralByIds(ids);
    }

    /**
     * 删除积分表信息
     * 
     * @param id 积分表ID
     * @return 结果
     */
    @Override
    public int deleteMyintegralById(Integer id)
    {
        return myintegralMapper.deleteMyintegralById(id);
    }
}
