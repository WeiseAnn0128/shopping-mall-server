-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客服电话', '3', '1', 'servicephonenum', 'system/servicephonenum/index', 1, 0, 'C', '0', '0', 'system:servicephonenum:list', '#', 'admin', sysdate(), '', null, '客服电话菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客服电话查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:servicephonenum:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客服电话新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:servicephonenum:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客服电话修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:servicephonenum:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客服电话删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:servicephonenum:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客服电话导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:servicephonenum:export',       '#', 'admin', sysdate(), '', null, '');