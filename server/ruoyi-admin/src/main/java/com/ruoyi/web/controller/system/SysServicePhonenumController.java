package com.ruoyi.system.controller;

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
import com.ruoyi.system.domain.SysServicePhonenum;
import com.ruoyi.system.service.ISysServicePhonenumService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客服电话Controller
 * 
 * @author ruoyi
 * @date 2021-05-08
 */
@RestController
@RequestMapping("/system/servicephonenum")
public class SysServicePhonenumController extends BaseController
{
    @Autowired
    private ISysServicePhonenumService sysServicePhonenumService;

    /**
     * 查询客服电话列表
     */
    @PreAuthorize("@ss.hasPermi('system:servicephonenum:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysServicePhonenum sysServicePhonenum)
    {
        startPage();
        List<SysServicePhonenum> list = sysServicePhonenumService.selectSysServicePhonenumList(sysServicePhonenum);
        return getDataTable(list);
    }

    /**
     * 导出客服电话列表
     */
    @PreAuthorize("@ss.hasPermi('system:servicephonenum:export')")
    @Log(title = "客服电话", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysServicePhonenum sysServicePhonenum)
    {
        List<SysServicePhonenum> list = sysServicePhonenumService.selectSysServicePhonenumList(sysServicePhonenum);
        ExcelUtil<SysServicePhonenum> util = new ExcelUtil<SysServicePhonenum>(SysServicePhonenum.class);
        return util.exportExcel(list, "客服电话数据");
    }

    /**
     * 获取客服电话详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:servicephonenum:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysServicePhonenumService.selectSysServicePhonenumById(id));
    }

    /**
     * 新增客服电话
     */
    @PreAuthorize("@ss.hasPermi('system:servicephonenum:add')")
    @Log(title = "客服电话", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysServicePhonenum sysServicePhonenum)
    {
        return toAjax(sysServicePhonenumService.insertSysServicePhonenum(sysServicePhonenum));
    }

    /**
     * 修改客服电话
     */
    @PreAuthorize("@ss.hasPermi('system:servicephonenum:edit')")
    @Log(title = "客服电话", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysServicePhonenum sysServicePhonenum)
    {
        return toAjax(sysServicePhonenumService.updateSysServicePhonenum(sysServicePhonenum));
    }

    /**
     * 删除客服电话
     */
    @PreAuthorize("@ss.hasPermi('system:servicephonenum:remove')")
    @Log(title = "客服电话", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysServicePhonenumService.deleteSysServicePhonenumByIds(ids));
    }
}
