package com.ruoyi.system.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.WalletDetail;
import com.ruoyi.system.service.IWalletDetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 钱包明细Controller
 * 
 * @author ruoyi
 * @date 2021-05-08
 */
@RestController
@RequestMapping("/system/wallet_detail")
public class WalletDetailController extends BaseController
{
    @Autowired
    private IWalletDetailService walletDetailService;

    /**
     * 查询钱包明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:wallet_detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(WalletDetail walletDetail)
    {
        startPage();
        List<WalletDetail> list = walletDetailService.selectWalletDetailList(walletDetail);
        return getDataTable(list);
    }

    /**
     * 导出钱包明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:wallet_detail:export')")
    @Log(title = "钱包明细", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WalletDetail walletDetail)
    {
        List<WalletDetail> list = walletDetailService.selectWalletDetailList(walletDetail);
        ExcelUtil<WalletDetail> util = new ExcelUtil<WalletDetail>(WalletDetail.class);
        return util.exportExcel(list, "钱包明细数据");
    }

    /**
     * 获取钱包明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:wallet_detail:query')")
    @GetMapping(value = "/{walletDetailId}")
    public AjaxResult getInfo(@PathVariable("walletDetailId") Long walletDetailId)
    {
        return AjaxResult.success(walletDetailService.selectWalletDetailById(walletDetailId));
    }

    /**
     * 新增钱包明细
     */
    @PreAuthorize("@ss.hasPermi('system:wallet_detail:add')")
    @Log(title = "钱包明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WalletDetail walletDetail)
    {
        return toAjax(walletDetailService.insertWalletDetail(walletDetail));
    }

    /**
     * 修改钱包明细
     */
    @PreAuthorize("@ss.hasPermi('system:wallet_detail:edit')")
    @Log(title = "钱包明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WalletDetail walletDetail)
    {
        return toAjax(walletDetailService.updateWalletDetail(walletDetail));
    }

    /**
     * 删除钱包明细
     */
    @PreAuthorize("@ss.hasPermi('system:wallet_detail:remove')")
    @Log(title = "钱包明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{walletDetailIds}")
    public AjaxResult remove(@PathVariable Long[] walletDetailIds)
    {
        return toAjax(walletDetailService.deleteWalletDetailByIds(walletDetailIds));
    }
}
