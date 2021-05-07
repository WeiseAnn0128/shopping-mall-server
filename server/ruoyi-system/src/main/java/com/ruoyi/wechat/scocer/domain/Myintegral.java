package com.ruoyi.wechat.scocer.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * myintegral对象 myintegral
 * 
 * @author ruoyi
 * @date 2021-05-07
 */
public class Myintegral extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户名称 */
    @Excel(name = "用户名称")
    private String userName;

    /** 改变积分 */
    @Excel(name = "改变积分")
    private Long changeIntegral;

    /** 消费或增加积分的时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "消费或增加积分的时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date changeTime;

    /** 获取积分的方式（0：签到；1：消费；2：购买会员） */
    @Excel(name = "获取积分的方式", readConverterExp = "0=：签到；1：消费；2：购买会员")
    private Integer consumptionType;

    /** 积分是增加还是减少（0:增加；1：减少） */
    @Excel(name = "积分是增加还是减少", readConverterExp = "0=:增加；1：减少")
    private Integer changeType;

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setChangeIntegral(Long changeIntegral) 
    {
        this.changeIntegral = changeIntegral;
    }

    public Long getChangeIntegral() 
    {
        return changeIntegral;
    }
    public void setChangeTime(Date changeTime) 
    {
        this.changeTime = changeTime;
    }

    public Date getChangeTime() 
    {
        return changeTime;
    }
    public void setConsumptionType(Integer consumptionType) 
    {
        this.consumptionType = consumptionType;
    }

    public Integer getConsumptionType() 
    {
        return consumptionType;
    }
    public void setChangeType(Integer changeType) 
    {
        this.changeType = changeType;
    }

    public Integer getChangeType() 
    {
        return changeType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userName", getUserName())
            .append("changeIntegral", getChangeIntegral())
            .append("changeTime", getChangeTime())
            .append("consumptionType", getConsumptionType())
            .append("changeType", getChangeType())
            .toString();
    }
}
