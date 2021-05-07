package com.ruoyi.web.controller.wechat.category;

import java.util.List;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.wechat.category.domain.ShortcutMenu;
import com.ruoyi.wechat.category.service.IShortcutMenuService;
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
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 二级类的快捷菜单关联增删查改Controller
 * 
 * @author ruoyi
 * @date 2021-05-06
 */
@RestController
@RequestMapping("/system/shortcut")
public class ShortcutMenuController extends BaseController
{
    @Autowired
    private IShortcutMenuService shortcutMenuService;

    /**
     * 查询二级类的快捷菜单关联增删查改列表
     */
    @PreAuthorize("@ss.hasPermi('system:shortcut:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShortcutMenu shortcutMenu)
    {
        startPage();
        if (shortcutMenu.getSecondclass() != null && StringUtils.isNotEmpty(shortcutMenu.getSecondclass().getName())) {
            shortcutMenu.getSecondclass().setName("%" + shortcutMenu.getSecondclass().getName() + "%");
        }
        List<ShortcutMenu> list = shortcutMenuService.selectShortcutMenuList(shortcutMenu);
        return getDataTable(list);
    }

    /**
     * 导出二级类的快捷菜单关联增删查改列表
     */
    @PreAuthorize("@ss.hasPermi('system:shortcut:export')")
    @Log(title = "二级类的快捷菜单关联增删查改", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ShortcutMenu shortcutMenu)
    {
        List<ShortcutMenu> list = shortcutMenuService.selectShortcutMenuList(shortcutMenu);
        ExcelUtil<ShortcutMenu> util = new ExcelUtil<ShortcutMenu>(ShortcutMenu.class);
        return util.exportExcel(list, "二级类的快捷菜单关联增删查改数据");
    }

    /**
     * 获取二级类的快捷菜单关联增删查改详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:shortcut:query')")
    @GetMapping(value = "/{shortcutMenuId}")
    public AjaxResult getInfo(@PathVariable("shortcutMenuId") Long shortcutMenuId)
    {
        return AjaxResult.success(shortcutMenuService.selectShortcutMenuById(shortcutMenuId));
    }

    /**
     * 新增二级类的快捷菜单关联增删查改
     */
    @PreAuthorize("@ss.hasPermi('system:shortcut:add')")
    @Log(title = "二级类的快捷菜单关联增删查改", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShortcutMenu shortcutMenu)
    {
        return toAjax(shortcutMenuService.insertShortcutMenu(shortcutMenu));
    }

    /**
     * 修改二级类的快捷菜单关联增删查改
     */
    @PreAuthorize("@ss.hasPermi('system:shortcut:edit')")
    @Log(title = "二级类的快捷菜单关联增删查改", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShortcutMenu shortcutMenu)
    {
        return toAjax(shortcutMenuService.updateShortcutMenu(shortcutMenu));
    }

    /**
     * 删除二级类的快捷菜单关联增删查改
     */
    @PreAuthorize("@ss.hasPermi('system:shortcut:remove')")
    @Log(title = "二级类的快捷菜单关联增删查改", businessType = BusinessType.DELETE)
	@DeleteMapping("/{shortcutMenuIds}")
    public AjaxResult remove(@PathVariable Long[] shortcutMenuIds)
    {
        return toAjax(shortcutMenuService.deleteShortcutMenuByIds(shortcutMenuIds));
    }
}
