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
 * 积分表Controller
 * 
 * @author ysq
 * @date 2021-05-08
 */
@RestController
@RequestMapping("/system/myintegral")
public class MyintegralController extends BaseController
{
    @Autowired
    private IMyintegralService myintegralService;

    /**
     * 查询积分表列表
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
     * 导出积分表列表
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:export')")
    @Log(title = "积分表", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Myintegral myintegral)
    {
        List<Myintegral> list = myintegralService.selectMyintegralList(myintegral);
        ExcelUtil<Myintegral> util = new ExcelUtil<Myintegral>(Myintegral.class);
        return util.exportExcel(list, "积分表数据");
    }

    /**
     * 获取积分表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(myintegralService.selectMyintegralById(id));
    }

    /**
     * 新增积分表
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:add')")
    @Log(title = "积分表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Myintegral myintegral)
    {
        return toAjax(myintegralService.insertMyintegral(myintegral));
    }

    /**
     * 修改积分表
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:edit')")
    @Log(title = "积分表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Myintegral myintegral)
    {
        return toAjax(myintegralService.updateMyintegral(myintegral));
    }

    /**
     * 删除积分表
     */
    @PreAuthorize("@ss.hasPermi('system:myintegral:remove')")
    @Log(title = "积分表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(myintegralService.deleteMyintegralByIds(ids));
    }
}
