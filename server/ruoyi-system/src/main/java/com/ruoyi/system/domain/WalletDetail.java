package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 钱包明细对象 wallet_detail
 * 
 * @author ruoyi
 * @date 2021-05-08
 */
public class WalletDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 钱包明细ID */
    private Long walletDetailId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 交易类型（转入为1，支出为0） */
    @Excel(name = "交易类型", readConverterExp = "转=入为1，支出为0")
    private Integer dealType;

    /** 交易明细类型 */
    @Excel(name = "交易明细类型")
    private Integer detailType;

    /** 交易金额 */
    @Excel(name = "交易金额")
    private Long dealMoney;

    /** 交易时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "交易时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    public void setWalletDetailId(Long walletDetailId) 
    {
        this.walletDetailId = walletDetailId;
    }

    public Long getWalletDetailId() 
    {
        return walletDetailId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setDealType(Integer dealType) 
    {
        this.dealType = dealType;
    }

    public Integer getDealType() 
    {
        return dealType;
    }
    public void setDetailType(Integer detailType) 
    {
        this.detailType = detailType;
    }

    public Integer getDetailType() 
    {
        return detailType;
    }
    public void setDealMoney(Long dealMoney) 
    {
        this.dealMoney = dealMoney;
    }

    public Long getDealMoney() 
    {
        return dealMoney;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("walletDetailId", getWalletDetailId())
            .append("userId", getUserId())
            .append("dealType", getDealType())
            .append("detailType", getDetailType())
            .append("dealMoney", getDealMoney())
            .append("time", getTime())
            .toString();
    }
}
