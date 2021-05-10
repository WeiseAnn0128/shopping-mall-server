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
import com.ruoyi.system.domain.SigninTime;
import com.ruoyi.system.service.ISigninTimeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 签到时间Controller
 * 
 * @author ruoyi
 * @date 2021-05-10
 */
@RestController
@RequestMapping("/system/time")
public class SigninTimeController extends BaseController
{
    @Autowired
    private ISigninTimeService signinTimeService;

    /**
     * 查询签到时间列表
     */
    @PreAuthorize("@ss.hasPermi('system:time:list')")
    @GetMapping("/list")
    public TableDataInfo list(SigninTime signinTime)
    {
        startPage();
        List<SigninTime> list = signinTimeService.selectSigninTimeList(signinTime);
        System.out.println(list);
        return getDataTable(list);
    }

    /**
     * 导出签到时间列表
     */
    @PreAuthorize("@ss.hasPermi('system:time:export')")
    @Log(title = "签到时间", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SigninTime signinTime)
    {
        List<SigninTime> list = signinTimeService.selectSigninTimeList(signinTime);
        ExcelUtil<SigninTime> util = new ExcelUtil<SigninTime>(SigninTime.class);
        return util.exportExcel(list, "签到时间数据");
    }

    /**
     * 获取签到时间详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:time:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(signinTimeService.selectSigninTimeById(id));
    }

    /**
     * 新增签到时间
     */
    @PreAuthorize("@ss.hasPermi('system:time:add')")
    @Log(title = "签到时间", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SigninTime signinTime)
    {
        return toAjax(signinTimeService.insertSigninTime(signinTime));
    }

    /**
     * 修改签到时间
     */
    @PreAuthorize("@ss.hasPermi('system:time:edit')")
    @Log(title = "签到时间", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SigninTime signinTime)
    {
        return toAjax(signinTimeService.updateSigninTime(signinTime));
    }

    /**
     * 删除签到时间
     */
    @PreAuthorize("@ss.hasPermi('system:time:remove')")
    @Log(title = "签到时间", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(signinTimeService.deleteSigninTimeByIds(ids));
    }
}
