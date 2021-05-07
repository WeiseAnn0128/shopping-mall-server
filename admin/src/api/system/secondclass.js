import request from '@/utils/request'

// 查询二级分类列表
export function listSecondclass(query) {
  return request({
    url: '/system/secondclass/list',
    method: 'get',
    params: query
  })
}

// 查询二级分类详细
export function getSecondclass(id) {
  return request({
    url: '/system/secondclass/' + id,
    method: 'get'
  })
}

// 新增二级分类
export function addSecondclass(data) {
  return request({
    url: '/system/secondclass',
    method: 'post',
    data: data
  })
}

// 修改二级分类
export function updateSecondclass(data) {
  return request({
    url: '/system/secondclass',
    method: 'put',
    data: data
  })
}

// 删除二级分类
export function delSecondclass(id) {
  return request({
    url: '/system/secondclass/' + id,
    method: 'delete'
  })
}

// 导出二级分类
export function exportSecondclass(query) {
  return request({
    url: '/system/secondclass/export',
    method: 'get',
    params: query
  })
}