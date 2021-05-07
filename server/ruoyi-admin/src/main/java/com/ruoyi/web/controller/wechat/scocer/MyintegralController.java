package com.ruoyi.web.controller.wechat.scocer;

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
import com.ruoyi.wechat.scocer.domain.Myintegral;
import com.ruoyi.wechat.scocer.service.IMyintegralService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * myintegralController
 * 
 * @author ruoyi
 * @date 2021-05-07
 */
@RestController
@RequestMapping("/system/myintegral")
public class MyintegralController extends BaseController
{
    @Autowired
    private IMyintegralService myintegralService;

    /**
     * 查询myintegral列表
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:list')")
    @GetMapping("/list")
    public TableDataInfo list(Myintegral myintegral)
    {
        startPage();
        List<Myintegral> list = myintegralService.selectMyintegralList(myintegral);
        return getDataTable(list);
    }

    /**
     * 导出myintegral列表
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:export')")
    @Log(title = "myintegral", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Myintegral myintegral)
    {
        List<Myintegral> list = myintegralService.selectMyintegralList(myintegral);
        ExcelUtil<Myintegral> util = new ExcelUtil<Myintegral>(Myintegral.class);
        return util.exportExcel(list, "myintegral数据");
    }

    /**
     * 获取myintegral详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:query')")
    @GetMapping(value = "/{userName}")
    public AjaxResult getInfo(@PathVariable("userName") String userName)
    {
        return AjaxResult.success(myintegralService.selectMyintegralById(userName));
    }

    /**
     * 新增myintegral
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:add')")
    @Log(title = "myintegral", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Myintegral myintegral)
    {
        return toAjax(myintegralService.insertMyintegral(myintegral));
    }

    /**
     * 修改myintegral
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:edit')")
    @Log(title = "myintegral", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Myintegral myintegral)
    {
        return toAjax(myintegralService.updateMyintegral(myintegral));
    }

    /**
     * 删除myintegral
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:remove')")
    @Log(title = "myintegral", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userNames}")
    public AjaxResult remove(@PathVariable String[] userNames)
    {
        return toAjax(myintegralService.deleteMyintegralByIds(userNames));
    }
}
