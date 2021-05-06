import request from '@/utils/request'

// 查询商品详情列表
export function listDetail(query) {
  return request({
    url: '/system/detail/list',
    method: 'get',
    params: query
  })
}

// 查询商品详情详细
export function getDetail(id) {
  return request({
    url: '/system/detail/' + id,
    method: 'get'
  })
}

// 新增商品详情
export function addDetail(data) {
  return request({
    url: '/system/detail',
    method: 'post',
    data: data
  })
}

// 修改商品详情
export function updateDetail(data) {
  return request({
    url: '/system/detail',
    method: 'put',
    data: data
  })
}

// 删除商品详情
export function delDetail(id) {
  return request({
    url: '/system/detail/' + id,
    method: 'delete'
  })
}

// 导出商品详情
export function exportDetail(query) {
  return request({
    url: '/system/detail/export',
    method: 'get',
    params: query
  })
}