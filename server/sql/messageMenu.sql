-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消息列表', '2006', '1', 'message', 'system/message/index', 1, 0, 'C', '0', '0', 'system:message:list', '#', 'admin', sysdate(), '', null, '消息列表菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消息列表查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:message:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消息列表新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:message:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消息列表修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:message:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消息列表删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:message:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消息列表导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:message:export',       '#', 'admin', sysdate(), '', null, '');