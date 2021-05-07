import request from '@/utils/request'

// 查询myintegral列表
export function listMyintegral(query) {
  return request({
    url: '/system/myintegral/list',
    method: 'get',
    params: query
  })
}

// 查询myintegral详细
export function getMyintegral(userName) {
  return request({
    url: '/system/myintegral/' + userName,
    method: 'get'
  })
}

// 新增myintegral
export function addMyintegral(data) {
  return request({
    url: '/system/myintegral',
    method: 'post',
    data: data
  })
}

// 修改myintegral
export function updateMyintegral(data) {
  return request({
    url: '/system/myintegral',
    method: 'put',
    data: data
  })
}

// 删除myintegral
export function delMyintegral(userName) {
  return request({
    url: '/system/myintegral/' + userName,
    method: 'delete'
  })
}

// 导出myintegral
export function exportMyintegral(query) {
  return request({
    url: '/system/myintegral/export',
    method: 'get',
    params: query
  })
}