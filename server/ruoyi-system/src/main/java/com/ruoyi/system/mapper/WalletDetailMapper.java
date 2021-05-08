package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.WalletDetail;

/**
 * 钱包明细Mapper接口
 * 
 * @author ruoyi
 * @date 2021-05-08
 */
public interface WalletDetailMapper 
{
    /**
     * 查询钱包明细
     * 
     * @param walletDetailId 钱包明细ID
     * @return 钱包明细
     */
    public WalletDetail selectWalletDetailById(Long walletDetailId);

    /**
     * 查询钱包明细列表
     * 
     * @param walletDetail 钱包明细
     * @return 钱包明细集合
     */
    public List<WalletDetail> selectWalletDetailList(WalletDetail walletDetail);

    /**
     * 新增钱包明细
     * 
     * @param walletDetail 钱包明细
     * @return 结果
     */
    public int insertWalletDetail(WalletDetail walletDetail);

    /**
     * 修改钱包明细
     * 
     * @param walletDetail 钱包明细
     * @return 结果
     */
    public int updateWalletDetail(WalletDetail walletDetail);

    /**
     * 删除钱包明细
     * 
     * @param walletDetailId 钱包明细ID
     * @return 结果
     */
    public int deleteWalletDetailById(Long walletDetailId);

    /**
     * 批量删除钱包明细
     * 
     * @param walletDetailIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteWalletDetailByIds(Long[] walletDetailIds);
}
