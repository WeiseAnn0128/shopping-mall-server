package com.ruoyi.wechat.category.service.impl;

import java.util.List;
import com.ruoyi.wechat.category.domain.ShortcutMenu;
import com.ruoyi.wechat.category.mapper.ShortcutMenuMapper;
import com.ruoyi.wechat.category.service.IShortcutMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 二级类的快捷菜单关联增删查改Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-06
 */
@Service
public class ShortcutMenuServiceImpl implements IShortcutMenuService
{
    @Autowired
    private ShortcutMenuMapper shortcutMenuMapper;

    /**
     * 查询二级类的快捷菜单关联增删查改
     * 
     * @param shortcutMenuId 二级类的快捷菜单关联增删查改ID
     * @return 二级类的快捷菜单关联增删查改
     */
    @Override
    public ShortcutMenu selectShortcutMenuById(Long shortcutMenuId)
    {
        return shortcutMenuMapper.selectShortcutMenuById(shortcutMenuId);
    }

    /**
     * 查询二级类的快捷菜单关联增删查改列表
     * 
     * @param shortcutMenu 二级类的快捷菜单关联增删查改
     * @return 二级类的快捷菜单关联增删查改
     */
    @Override
    public List<ShortcutMenu> selectShortcutMenuList(ShortcutMenu shortcutMenu)
    {
        return shortcutMenuMapper.selectShortcutMenuList(shortcutMenu);
    }

    /**
     * 新增二级类的快捷菜单关联增删查改
     * 
     * @param shortcutMenu 二级类的快捷菜单关联增删查改
     * @return 结果
     */
    @Override
    public int insertShortcutMenu(ShortcutMenu shortcutMenu)
    {
        return shortcutMenuMapper.insertShortcutMenu(shortcutMenu);
    }

    /**
     * 修改二级类的快捷菜单关联增删查改
     * 
     * @param shortcutMenu 二级类的快捷菜单关联增删查改
     * @return 结果
     */
    @Override
    public int updateShortcutMenu(ShortcutMenu shortcutMenu)
    {
        return shortcutMenuMapper.updateShortcutMenu(shortcutMenu);
    }

    /**
     * 批量删除二级类的快捷菜单关联增删查改
     * 
     * @param shortcutMenuIds 需要删除的二级类的快捷菜单关联增删查改ID
     * @return 结果
     */
    @Override
    public int deleteShortcutMenuByIds(Long[] shortcutMenuIds)
    {
        return shortcutMenuMapper.deleteShortcutMenuByIds(shortcutMenuIds);
    }

    /**
     * 删除二级类的快捷菜单关联增删查改信息
     * 
     * @param shortcutMenuId 二级类的快捷菜单关联增删查改ID
     * @return 结果
     */
    @Override
    public int deleteShortcutMenuById(Long shortcutMenuId)
    {
        return shortcutMenuMapper.deleteShortcutMenuById(shortcutMenuId);
    }
}
