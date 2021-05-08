import request from '@/utils/request'

// 查询二级分类列表
export function listSecondClass() {
  return request({
    url: '/mydemo/secondclass/list',
    method: 'get',
    params: {
        pageNum: 1,
        pageSize: 10000
    }
  })
}

// 查询二级类的快捷菜单关联增删查改列表
export function listShortcut(query) {
  return request({
    url: '/system/shortcut/list',
    method: 'get',
    params: query
  })
}

// 查询二级类的快捷菜单关联增删查改详细
export function getShortcut(shortcutMenuId) {
  return request({
    url: '/system/shortcut/' + shortcutMenuId,
    method: 'get'
  })
}

// 新增二级类的快捷菜单关联增删查改
export function addShortcut(data) {
  return request({
    url: '/system/shortcut',
    method: 'post',
    data: data
  })
}

// 修改二级类的快捷菜单关联增删查改
export function updateShortcut(data) {
  return request({
    url: '/system/shortcut',
    method: 'put',
    data: data
  })
}

// 删除二级类的快捷菜单关联增删查改
export function delShortcut(shortcutMenuId) {
  return request({
    url: '/system/shortcut/' + shortcutMenuId,
    method: 'delete'
  })
}

// 导出二级类的快捷菜单关联增删查改
export function exportShortcut(query) {
  return request({
    url: '/system/shortcut/export',
    method: 'get',
    params: query
  })
}
