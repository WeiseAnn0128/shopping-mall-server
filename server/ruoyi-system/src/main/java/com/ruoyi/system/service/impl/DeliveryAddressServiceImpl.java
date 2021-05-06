package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DeliveryAddressMapper;
import com.ruoyi.system.domain.DeliveryAddress;
import com.ruoyi.system.service.IDeliveryAddressService;

/**
 * 增删查改Service业务层处理
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
     * 查询增删查改
     * 
     * @param addressId 增删查改ID
     * @return 增删查改
     */
    @Override
    public DeliveryAddress selectDeliveryAddressById(Long addressId)
    {
        return deliveryAddressMapper.selectDeliveryAddressById(addressId);
    }

    /**
     * 查询增删查改列表
     * 
     * @param deliveryAddress 增删查改
     * @return 增删查改
     */
    @Override
    public List<DeliveryAddress> selectDeliveryAddressList(DeliveryAddress deliveryAddress)
    {
        return deliveryAddressMapper.selectDeliveryAddressList(deliveryAddress);
    }

    /**
     * 新增增删查改
     * 
     * @param deliveryAddress 增删查改
     * @return 结果
     */
    @Override
    public int insertDeliveryAddress(DeliveryAddress deliveryAddress)
    {
        deliveryAddress.setCreateTime(DateUtils.getNowDate());
        return deliveryAddressMapper.insertDeliveryAddress(deliveryAddress);
    }

    /**
     * 修改增删查改
     * 
     * @param deliveryAddress 增删查改
     * @return 结果
     */
    @Override
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress)
    {
        return deliveryAddressMapper.updateDeliveryAddress(deliveryAddress);
    }

    /**
     * 批量删除增删查改
     * 
     * @param addressIds 需要删除的增删查改ID
     * @return 结果
     */
    @Override
    public int deleteDeliveryAddressByIds(Long[] addressIds)
    {
        return deliveryAddressMapper.deleteDeliveryAddressByIds(addressIds);
    }

    /**
     * 删除增删查改信息
     * 
     * @param addressId 增删查改ID
     * @return 结果
     */
    @Override
    public int deleteDeliveryAddressById(Long addressId)
    {
        return deliveryAddressMapper.deleteDeliveryAddressById(addressId);
    }
}
