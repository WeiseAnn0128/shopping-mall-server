package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 消息列表对象 user_msg
 * 
 * @author ruoyi
 * @date 2021-05-10
 */
public class UserMsg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private Long userId;

    /** 发送给用户的消息 */
    @Excel(name = "发送给用户的消息")
    private String userMsg;

    /** 发送消息的时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发送消息的时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 消息标题 */
    @Excel(name = "消息标题")
    private String title;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserMsg(String userMsg) 
    {
        this.userMsg = userMsg;
    }

    public String getUserMsg() 
    {
        return userMsg;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("userMsg", getUserMsg())
            .append("time", getTime())
            .append("title", getTitle())
            .toString();
    }
}
