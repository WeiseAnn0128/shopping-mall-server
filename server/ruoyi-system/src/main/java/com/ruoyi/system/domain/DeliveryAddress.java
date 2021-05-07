package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户地址管理对象 delivery_address
 * 
 * @author lslwypjjz
 * @date 2021-05-06
 */
public class DeliveryAddress extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 地址ID */
    private Long addressId;

    /** 收货人姓名 */
    private String userName;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String userPhone;

    /** 省份 */
    @Excel(name = "省份")
    private String province;

    /** 城市 */
    @Excel(name = "城市")
    private String city;

    /** 区 */
    @Excel(name = "区")
    private String district;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String userAddress;

    /** 是否是默认地址 1是 0否 默认否 */
    @Excel(name = "是否是默认地址 1是 0否 默认否")
    private Integer isdefault;

    public void setAddressId(Long addressId) 
    {
        this.addressId = addressId;
    }

    public Long getAddressId() 
    {
        return addressId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setUserPhone(String userPhone) 
    {
        this.userPhone = userPhone;
    }

    public String getUserPhone() 
    {
        return userPhone;
    }
    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getDistrict() 
    {
        return district;
    }
    public void setUserAddress(String userAddress) 
    {
        this.userAddress = userAddress;
    }

    public String getUserAddress() 
    {
        return userAddress;
    }
    public void setIsdefault(Integer isdefault) 
    {
        this.isdefault = isdefault;
    }

    public Integer getIsdefault() 
    {
        return isdefault;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("addressId", getAddressId())
            .append("userName", getUserName())
            .append("userPhone", getUserPhone())
            .append("province", getProvince())
            .append("city", getCity())
            .append("district", getDistrict())
            .append("userAddress", getUserAddress())
            .append("isdefault", getIsdefault())
            .append("createTime", getCreateTime())
            .toString();
    }
}
