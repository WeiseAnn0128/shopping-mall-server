package com.ruoyi.wechat.category.service;

import com.ruoyi.wechat.category.domain.ShortcutMenu;

import java.util.List;

/**
 * 二级类的快捷菜单关联增删查改Service接口
 * 
 * @author ruoyi
 * @date 2021-05-06
 */
public interface IShortcutMenuService 
{
    /**
     * 查询二级类的快捷菜单关联增删查改
     * 
     * @param shortcutMenuId 二级类的快捷菜单关联增删查改ID
     * @return 二级类的快捷菜单关联增删查改
     */
    public ShortcutMenu selectShortcutMenuById(Long shortcutMenuId);

    /**
     * 查询二级类的快捷菜单关联增删查改列表
     * 
     * @param shortcutMenu 二级类的快捷菜单关联增删查改
     * @return 二级类的快捷菜单关联增删查改集合
     */
    public List<ShortcutMenu> selectShortcutMenuList(ShortcutMenu shortcutMenu);

    /**
     * 新增二级类的快捷菜单关联增删查改
     * 
     * @param shortcutMenu 二级类的快捷菜单关联增删查改
     * @return 结果
     */
    public int insertShortcutMenu(ShortcutMenu shortcutMenu);

    /**
     * 修改二级类的快捷菜单关联增删查改
     * 
     * @param shortcutMenu 二级类的快捷菜单关联增删查改
     * @return 结果
     */
    public int updateShortcutMenu(ShortcutMenu shortcutMenu);

    /**
     * 批量删除二级类的快捷菜单关联增删查改
     * 
     * @param shortcutMenuIds 需要删除的二级类的快捷菜单关联增删查改ID
     * @return 结果
     */
    public int deleteShortcutMenuByIds(Long[] shortcutMenuIds);

    /**
     * 删除二级类的快捷菜单关联增删查改信息
     * 
     * @param shortcutMenuId 二级类的快捷菜单关联增删查改ID
     * @return 结果
     */
    public int deleteShortcutMenuById(Long shortcutMenuId);
}
