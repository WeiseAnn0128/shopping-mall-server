package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WalletDetailMapper;
import com.ruoyi.system.domain.WalletDetail;
import com.ruoyi.system.service.IWalletDetailService;

/**
 * 钱包明细Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-08
 */
@Service
public class WalletDetailServiceImpl implements IWalletDetailService 
{
    @Autowired
    private WalletDetailMapper walletDetailMapper;

    /**
     * 查询钱包明细
     * 
     * @param walletDetailId 钱包明细ID
     * @return 钱包明细
     */
    @Override
    public WalletDetail selectWalletDetailById(Long walletDetailId)
    {
        return walletDetailMapper.selectWalletDetailById(walletDetailId);
    }

    /**
     * 查询钱包明细列表
     * 
     * @param walletDetail 钱包明细
     * @return 钱包明细
     */
    @Override
    public List<WalletDetail> selectWalletDetailList(WalletDetail walletDetail)
    {
        return walletDetailMapper.selectWalletDetailList(walletDetail);
    }

    /**
     * 新增钱包明细
     * 
     * @param walletDetail 钱包明细
     * @return 结果
     */
    @Override
    public int insertWalletDetail(WalletDetail walletDetail)
    {
        return walletDetailMapper.insertWalletDetail(walletDetail);
    }

    /**
     * 修改钱包明细
     * 
     * @param walletDetail 钱包明细
     * @return 结果
     */
    @Override
    public int updateWalletDetail(WalletDetail walletDetail)
    {
        return walletDetailMapper.updateWalletDetail(walletDetail);
    }

    /**
     * 批量删除钱包明细
     * 
     * @param walletDetailIds 需要删除的钱包明细ID
     * @return 结果
     */
    @Override
    public int deleteWalletDetailByIds(Long[] walletDetailIds)
    {
        return walletDetailMapper.deleteWalletDetailByIds(walletDetailIds);
    }

    /**
     * 删除钱包明细信息
     * 
     * @param walletDetailId 钱包明细ID
     * @return 结果
     */
    @Override
    public int deleteWalletDetailById(Long walletDetailId)
    {
        return walletDetailMapper.deleteWalletDetailById(walletDetailId);
    }
}
