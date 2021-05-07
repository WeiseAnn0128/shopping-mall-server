-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改', '2006', '1', 'shortcut', 'system/shortcut/index', 1, 0, 'C', '0', '0', 'system:shortcut:list', '#', 'admin', sysdate(), '', null, '二级类的快捷菜单关联增删查改菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:shortcut:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:shortcut:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:shortcut:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:shortcut:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:shortcut:export',       '#', 'admin', sysdate(), '', null, '');