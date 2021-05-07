package com.ruoyi.wechat.scocer.mapper;

import java.util.List;
import com.ruoyi.wechat.scocer.domain.Myintegral;
/**
 * myintegralMapper接口
 * 
 * @author ruoyi
 * @date 2021-05-07
 */
public interface MyintegralMapper 
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
     * 删除myintegral
     * 
     * @param userName myintegralID
     * @return 结果
     */
    public int deleteMyintegralById(String userName);

    /**
     * 批量删除myintegral
     * 
     * @param userNames 需要删除的数据ID
     * @return 结果
     */
    public int deleteMyintegralByIds(String[] userNames);
}
