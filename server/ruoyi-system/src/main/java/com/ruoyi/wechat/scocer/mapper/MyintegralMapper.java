package com.ruoyi.wechat.scocer.mapper;

import java.util.List;
import com.ruoyi.wechat.scocer.domain.Myintegral;

/**
 * 积分表Mapper接口
 * 
 * @author ysq
 * @date 2021-05-08
 */
public interface MyintegralMapper 
{
    /**
     * 查询积分表
     * 
     * @param id 积分表ID
     * @return 积分表
     */
    public Myintegral selectMyintegralById(Integer id);

    /**
     * 查询积分表列表
     * 
     * @param myintegral 积分表
     * @return 积分表集合
     */
    public List<Myintegral> selectMyintegralList(Myintegral myintegral);

    /**
     * 新增积分表
     * 
     * @param myintegral 积分表
     * @return 结果
     */
    public int insertMyintegral(Myintegral myintegral);

    /**
     * 修改积分表
     * 
     * @param myintegral 积分表
     * @return 结果
     */
    public int updateMyintegral(Myintegral myintegral);

    /**
     * 删除积分表
     * 
     * @param id 积分表ID
     * @return 结果
     */
    public int deleteMyintegralById(Integer id);

    /**
     * 批量删除积分表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMyintegralByIds(Integer[] ids);
}
