package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.UserMsg;

/**
 * 消息列表Mapper接口
 * 
 * @author ruoyi
 * @date 2021-05-10
 */
public interface UserMsgMapper 
{
    /**
     * 查询消息列表
     * 
     * @param userId 消息列表ID
     * @return 消息列表
     */
    public UserMsg selectUserMsgById(Long userId);

    /**
     * 查询消息列表列表
     * 
     * @param userMsg 消息列表
     * @return 消息列表集合
     */
    public List<UserMsg> selectUserMsgList(UserMsg userMsg);

    /**
     * 新增消息列表
     * 
     * @param userMsg 消息列表
     * @return 结果
     */
    public int insertUserMsg(UserMsg userMsg);

    /**
     * 修改消息列表
     * 
     * @param userMsg 消息列表
     * @return 结果
     */
    public int updateUserMsg(UserMsg userMsg);

    /**
     * 删除消息列表
     * 
     * @param userId 消息列表ID
     * @return 结果
     */
    public int deleteUserMsgById(Long userId);

    /**
     * 批量删除消息列表
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserMsgByIds(Long[] userIds);
}
