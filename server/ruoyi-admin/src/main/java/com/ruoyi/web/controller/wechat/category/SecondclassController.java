package com.ruoyi.web.controller.wechat.category;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.wechat.category.domain.Secondclass;
import com.ruoyi.wechat.category.service.IFirstclassService;
import com.ruoyi.wechat.category.service.ISecondclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * secondController
 * 
 * @author ruoyi
 * @date 2021-04-25
 */
@RestController
@RequestMapping("/system/secondclass")
public class SecondclassController extends BaseController
{
    @Autowired
    private ISecondclassService secondclassService;

    /**
     * 查询second列表
     */
    @PreAuthorize("@ss.hasPermi('system:secondclass:list') or @ss.hasRole('wechat')")
    @GetMapping("/list")
    public TableDataInfo list(Secondclass secondclass)
    {
        startPage();
        List<Secondclass> list = secondclassService.selectSecondclassList(secondclass);
        return getDataTable(list);
    }
    /**
     * 导出second列表
     */
    @PreAuthorize("@ss.hasPermi('system:secondclass:export')")
    @Log(title = "second", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Secondclass secondclass)
    {
        List<Secondclass> list = secondclassService.selectSecondclassList(secondclass);
        ExcelUtil<Secondclass> util = new ExcelUtil<Secondclass>(Secondclass.class);
        return util.exportExcel(list, "second数据");
    }
    /**
     * 获取second详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:secondclass:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(secondclassService.selectSecondclassById(id));
    }

    /**
     * 新增second
     */
    @PreAuthorize("@ss.hasPermi('system:secondclass:add')")
    @Log(title = "second", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Secondclass secondclass)
    {
        return toAjax(secondclassService.insertSecondclass(secondclass));
    }

    /**
     * 修改second
     */
    @PreAuthorize("@ss.hasPermi('system:secondclass:edit')")
    @Log(title = "second", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Secondclass secondclass)
    {
        return toAjax(secondclassService.updateSecondclass(secondclass));
    }

    /**
     * 删除second
     */
    @PreAuthorize("@ss.hasPermi('system:secondclass:remove')")
    @Log(title = "second", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(secondclassService.deleteSecondclassByIds(ids));
    }

}
