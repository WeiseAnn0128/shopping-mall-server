-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表', '2006', '1', 'myintegral', 'system/myintegral/index', 1, 0, 'C', '0', '0', 'system:myintegral:list', '#', 'admin', sysdate(), '', null, '积分表菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:myintegral:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:myintegral:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:myintegral:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:myintegral:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:myintegral:export',       '#', 'admin', sysdate(), '', null, '');