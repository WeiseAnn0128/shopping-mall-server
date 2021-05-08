import request from '@/utils/request'

// 查询客服电话列表
export function listServicephonenum(query) {
  return request({
    url: '/system/servicephonenum/list',
    method: 'get',
    params: query
  })
}

// 查询客服电话详细
export function getServicephonenum(id) {
  return request({
    url: '/system/servicephonenum/' + id,
    method: 'get'
  })
}

// 新增客服电话
export function addServicephonenum(data) {
  return request({
    url: '/system/servicephonenum',
    method: 'post',
    data: data
  })
}

// 修改客服电话
export function updateServicephonenum(data) {
  return request({
    url: '/system/servicephonenum',
    method: 'put',
    data: data
  })
}

// 删除客服电话
export function delServicephonenum(id) {
  return request({
    url: '/system/servicephonenum/' + id,
    method: 'delete'
  })
}

// 导出客服电话
export function exportServicephonenum(query) {
  return request({
    url: '/system/servicephonenum/export',
    method: 'get',
    params: query
  })
}