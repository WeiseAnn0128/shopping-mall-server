package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DeliveryAddressMapper;
import com.ruoyi.system.domain.DeliveryAddress;
import com.ruoyi.system.service.IDeliveryAddressService;

/**
 * 用户地址管理Service业务层处理
 * 
 * @author lslwypjjz
 * @date 2021-05-06
 */
@Service
public class DeliveryAddressServiceImpl implements IDeliveryAddressService 
{
    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;

    /**
     * 查询用户地址管理
     * 
     * @param addressId 用户地址管理ID
     * @return 用户地址管理
     */
    @Override
    public DeliveryAddress selectDeliveryAddressById(Long addressId)
    {
        return deliveryAddressMapper.selectDeliveryAddressById(addressId);
    }

    /**
     * 查询用户地址管理列表
     * 
     * @param deliveryAddress 用户地址管理
     * @return 用户地址管理
     */
    @Override
    public List<DeliveryAddress> selectDeliveryAddressList(DeliveryAddress deliveryAddress)
    {
        return deliveryAddressMapper.selectDeliveryAddressList(deliveryAddress);
    }

    /**
     * 新增用户地址管理
     * 
     * @param deliveryAddress 用户地址管理
     * @return 结果
     */
    @Override
    public int insertDeliveryAddress(DeliveryAddress deliveryAddress)
    {
        deliveryAddress.setCreateTime(DateUtils.getNowDate());
        return deliveryAddressMapper.insertDeliveryAddress(deliveryAddress);
    }

    /**
     * 修改用户地址管理
     * 
     * @param deliveryAddress 用户地址管理
     * @return 结果
     */
    @Override
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress)
    {
        return deliveryAddressMapper.updateDeliveryAddress(deliveryAddress);
    }

    /**
     * 批量删除用户地址管理
     * 
     * @param addressIds 需要删除的用户地址管理ID
     * @return 结果
     */
    @Override
    public int deleteDeliveryAddressByIds(Long[] addressIds)
    {
        return deliveryAddressMapper.deleteDeliveryAddressByIds(addressIds);
    }

    /**
     * 删除用户地址管理信息
     * 
     * @param addressId 用户地址管理ID
     * @return 结果
     */
    @Override
    public int deleteDeliveryAddressById(Long addressId)
    {
        return deliveryAddressMapper.deleteDeliveryAddressById(addressId);
    }
}
