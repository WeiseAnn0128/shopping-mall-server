package com.ruoyi.web.controller.wechat;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.DeliveryAddress;
import com.ruoyi.system.service.IDeliveryAddressService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户地址管理Controller
 * 
 * @author lslwypjjz
 * @date 2021-05-06
 */
@RestController
@RequestMapping("/system/address")
public class DeliveryAddressController extends BaseController
{
    @Autowired
    private IDeliveryAddressService deliveryAddressService;

    /**
     * 查询用户地址管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:address:list')")
    @GetMapping("/list")
    public TableDataInfo list(DeliveryAddress deliveryAddress)
    {
        startPage();
        List<DeliveryAddress> list = deliveryAddressService.selectDeliveryAddressList(deliveryAddress);
        return getDataTable(list);
    }

    /**
     * 导出用户地址管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:address:export')")
    @Log(title = "用户地址管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(DeliveryAddress deliveryAddress)
    {
        List<DeliveryAddress> list = deliveryAddressService.selectDeliveryAddressList(deliveryAddress);
        ExcelUtil<DeliveryAddress> util = new ExcelUtil<DeliveryAddress>(DeliveryAddress.class);
        return util.exportExcel(list, "用户地址管理数据");
    }

    /**
     * 获取用户地址管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:address:query')")
    @GetMapping(value = "/{addressId}")
    public AjaxResult getInfo(@PathVariable("addressId") Long addressId)
    {
        return AjaxResult.success(deliveryAddressService.selectDeliveryAddressById(addressId));
    }

    /**
     * 新增用户地址管理
     */
    @PreAuthorize("@ss.hasPermi('system:address:add')")
    @Log(title = "用户地址管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DeliveryAddress deliveryAddress)
    {
        return toAjax(deliveryAddressService.insertDeliveryAddress(deliveryAddress));
    }

    /**
     * 修改用户地址管理
     */
    @PreAuthorize("@ss.hasPermi('system:address:edit')")
    @Log(title = "用户地址管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DeliveryAddress deliveryAddress)
    {
        return toAjax(deliveryAddressService.updateDeliveryAddress(deliveryAddress));
    }

    /**
     * 删除用户地址管理
     */
    @PreAuthorize("@ss.hasPermi('system:address:remove')")
    @Log(title = "用户地址管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{addressIds}")
    public AjaxResult remove(@PathVariable Long[] addressIds)
    {
        return toAjax(deliveryAddressService.deleteDeliveryAddressByIds(addressIds));
    }
}
