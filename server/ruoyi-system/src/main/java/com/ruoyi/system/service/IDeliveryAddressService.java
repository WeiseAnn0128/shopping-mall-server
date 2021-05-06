package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DeliveryAddress;

/**
 * 增删查改Service接口
 * 
 * @author lslwypjjz
 * @date 2021-05-06
 */
public interface IDeliveryAddressService 
{
    /**
     * 查询增删查改
     * 
     * @param addressId 增删查改ID
     * @return 增删查改
     */
    public DeliveryAddress selectDeliveryAddressById(Long addressId);

    /**
     * 查询增删查改列表
     * 
     * @param deliveryAddress 增删查改
     * @return 增删查改集合
     */
    public List<DeliveryAddress> selectDeliveryAddressList(DeliveryAddress deliveryAddress);

    /**
     * 新增增删查改
     * 
     * @param deliveryAddress 增删查改
     * @return 结果
     */
    public int insertDeliveryAddress(DeliveryAddress deliveryAddress);

    /**
     * 修改增删查改
     * 
     * @param deliveryAddress 增删查改
     * @return 结果
     */
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress);

    /**
     * 批量删除增删查改
     * 
     * @param addressIds 需要删除的增删查改ID
     * @return 结果
     */
    public int deleteDeliveryAddressByIds(Long[] addressIds);

    /**
     * 删除增删查改信息
     * 
     * @param addressId 增删查改ID
     * @return 结果
     */
    public int deleteDeliveryAddressById(Long addressId);
}
