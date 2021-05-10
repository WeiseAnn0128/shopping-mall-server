import request from '@/utils/request'

// 查询签到时间列表
export function listTime(query) {
  return request({
    url: '/system/time/list',
    method: 'get',
    params: query
  })
}

// 查询签到时间详细
export function getTime(id) {
  return request({
    url: '/system/time/' + id,
    method: 'get'
  })
}

// 新增签到时间
export function addTime(data) {
  return request({
    url: '/system/time',
    method: 'post',
    data: data
  })
}

// 修改签到时间
export function updateTime(data) {
  return request({
    url: '/system/time',
    method: 'put',
    data: data
  })
}

// 删除签到时间
export function delTime(id) {
  return request({
    url: '/system/time/' + id,
    method: 'delete'
  })
}

// 导出签到时间
export function exportTime(query) {
  return request({
    url: '/system/time/export',
    method: 'get',
    params: query
  })
}