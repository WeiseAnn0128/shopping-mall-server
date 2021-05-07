package com.ruoyi.wechat.scocer.service;

import java.util.List;
import com.ruoyi.wechat.scocer.domain.Myintegral;
/**
 * myintegralService接口
 * 
 * @author ruoyi
 * @date 2021-05-07
 */
public interface IMyintegralService 
{
    /**
     * 查询myintegral
     * 
     * @param userName myintegralID
     * @return myintegral
     */
    public Myintegral selectMyintegralById(String userName);

    /**
     * 查询myintegral列表
     * 
     * @param myintegral myintegral
     * @return myintegral集合
     */
    public List<Myintegral> selectMyintegralList(Myintegral myintegral);

    /**
     * 新增myintegral
     * 
     * @param myintegral myintegral
     * @return 结果
     */
    public int insertMyintegral(Myintegral myintegral);

    /**
     * 修改myintegral
     * 
     * @param myintegral myintegral
     * @return 结果
     */
    public int updateMyintegral(Myintegral myintegral);

    /**
     * 批量删除myintegral
     * 
     * @param userNames 需要删除的myintegralID
     * @return 结果
     */
    public int deleteMyintegralByIds(String[] userNames);

    /**
     * 删除myintegral信息
     * 
     * @param userName myintegralID
     * @return 结果
     */
    public int deleteMyintegralById(String userName);
}
