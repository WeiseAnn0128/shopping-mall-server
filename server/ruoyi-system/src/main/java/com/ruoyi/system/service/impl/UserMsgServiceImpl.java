package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserMsgMapper;
import com.ruoyi.system.domain.UserMsg;
import com.ruoyi.system.service.IUserMsgService;

/**
 * 消息列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-10
 */
@Service
public class UserMsgServiceImpl implements IUserMsgService 
{
    @Autowired
    private UserMsgMapper userMsgMapper;

    /**
     * 查询消息列表
     * 
     * @param userId 消息列表ID
     * @return 消息列表
     */
    @Override
    public UserMsg selectUserMsgById(Long userId)
    {
        return userMsgMapper.selectUserMsgById(userId);
    }

    /**
     * 查询消息列表列表
     * 
     * @param userMsg 消息列表
     * @return 消息列表
     */
    @Override
    public List<UserMsg> selectUserMsgList(UserMsg userMsg)
    {
        return userMsgMapper.selectUserMsgList(userMsg);
    }

    /**
     * 新增消息列表
     * 
     * @param userMsg 消息列表
     * @return 结果
     */
    @Override
    public int insertUserMsg(UserMsg userMsg)
    {
        return userMsgMapper.insertUserMsg(userMsg);
    }

    /**
     * 修改消息列表
     * 
     * @param userMsg 消息列表
     * @return 结果
     */
    @Override
    public int updateUserMsg(UserMsg userMsg)
    {
        return userMsgMapper.updateUserMsg(userMsg);
    }

    /**
     * 批量删除消息列表
     * 
     * @param userIds 需要删除的消息列表ID
     * @return 结果
     */
    @Override
    public int deleteUserMsgByIds(Long[] userIds)
    {
        return userMsgMapper.deleteUserMsgByIds(userIds);
    }

    /**
     * 删除消息列表信息
     * 
     * @param userId 消息列表ID
     * @return 结果
     */
    @Override
    public int deleteUserMsgById(Long userId)
    {
        return userMsgMapper.deleteUserMsgById(userId);
    }
}
