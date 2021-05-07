package com.ruoyi.wechat.category.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 二级类的快捷菜单关联增删查改对象 shortcut_menu
 * 
 * @author ruoyi
 * @date 2021-05-06
 */
public class ShortcutMenu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 快捷菜单ID */
    private Long shortcutMenuId;

    /** 二级类的cate_id */
    @Excel(name = "二级类的cate_id")
    private Secondclass secondclass;

    @Override
    public String toString() {
        return "ShortcutMenu{" +
                "shortcutMenuId=" + shortcutMenuId +
                ", secondclass=" + secondclass +
                '}';
    }

    public void setShortcutMenuId(Long shortcutMenuId)
    {
        this.shortcutMenuId = shortcutMenuId;
    }

    public Long getShortcutMenuId() 
    {
        return shortcutMenuId;
    }

    public Secondclass getSecondclass() {
        return secondclass;
    }

    public void setSecondclass(Secondclass secondclass) {
        this.secondclass = secondclass;
    }
}
