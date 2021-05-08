import request from '@/utils/request'

// 查询积分表列表
export function listMyintegral(query) {
  return request({
    url: '/system/myintegral/list',
    method: 'get',
    params: query
  })
}

// 查询积分表详细
export function getMyintegral(id) {
  return request({
    url: '/system/myintegral/' + id,
    method: 'get'
  })
}

// 新增积分表
export function addMyintegral(data) {
  return request({
    url: '/system/myintegral',
    method: 'post',
    data: data
  })
}

// 修改积分表
export function updateMyintegral(data) {
  return request({
    url: '/system/myintegral',
    method: 'put',
    data: data
  })
}

// 删除积分表
export function delMyintegral(id) {
  return request({
    url: '/system/myintegral/' + id,
    method: 'delete'
  })
}

// 导出积分表
export function exportMyintegral(query) {
  return request({
    url: '/system/myintegral/export',
    method: 'get',
    params: query
  })
}