import request from '@/utils/request'

// 查询钱包明细列表
export function listWallet_detail(query) {
  return request({
    url: '/system/wallet_detail/list',
    method: 'get',
    params: query
  })
}

// 查询钱包明细详细
export function getWallet_detail(walletDetailId) {
  return request({
    url: '/system/wallet_detail/' + walletDetailId,
    method: 'get'
  })
}

// 新增钱包明细
export function addWallet_detail(data) {
  return request({
    url: '/system/wallet_detail',
    method: 'post',
    data: data
  })
}

// 修改钱包明细
export function updateWallet_detail(data) {
  return request({
    url: '/system/wallet_detail',
    method: 'put',
    data: data
  })
}

// 删除钱包明细
export function delWallet_detail(walletDetailId) {
  return request({
    url: '/system/wallet_detail/' + walletDetailId,
    method: 'delete'
  })
}

// 导出钱包明细
export function exportWallet_detail(query) {
  return request({
    url: '/system/wallet_detail/export',
    method: 'get',
    params: query
  })
}