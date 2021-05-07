import request from '@/utils/request'

// 查询一级分类列表
export function listFirstclass(query) {
  return request({
    url: '/system/firstclass/list',
    method: 'get',
    params: query
  })
}

// 查询一级分类详细
export function getFirstclass(cateId) {
  return request({
    url: '/system/firstclass/' + cateId,
    method: 'get'
  })
}

// 新增一级分类
export function addFirstclass(data) {
  return request({
    url: '/system/firstclass',
    method: 'post',
    data: data
  })
}

// 修改一级分类
export function updateFirstclass(data) {
  return request({
    url: '/system/firstclass',
    method: 'put',
    data: data
  })
}

// 删除一级分类
export function delFirstclass(cateId) {
  return request({
    url: '/system/firstclass/' + cateId,
    method: 'delete'
  })
}

// 导出一级分类
export function exportFirstclass(query) {
  return request({
    url: '/system/firstclass/export',
    method: 'get',
    params: query
  })
}