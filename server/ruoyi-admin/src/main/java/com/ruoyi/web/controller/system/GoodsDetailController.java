package com.ruoyi.web.controller.system;

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
import com.ruoyi.system.domain.GoodsDetail;
import com.ruoyi.system.service.IGoodsDetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品详情Controller
 * 
 * @author ruoyi
 * @date 2021-05-06
 */
@RestController
@RequestMapping("/system/detail")
public class GoodsDetailController extends BaseController
{
    @Autowired
    private IGoodsDetailService goodsDetailService;

    /**
     * 查询商品详情列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(GoodsDetail goodsDetail)
    {
        startPage();
        List<GoodsDetail> list = goodsDetailService.selectGoodsDetailList(goodsDetail);
        return getDataTable(list);
    }

    /**
     * 导出商品详情列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:export')")
    @Log(title = "商品详情", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(GoodsDetail goodsDetail)
    {
        List<GoodsDetail> list = goodsDetailService.selectGoodsDetailList(goodsDetail);
        ExcelUtil<GoodsDetail> util = new ExcelUtil<GoodsDetail>(GoodsDetail.class);
        return util.exportExcel(list, "商品详情数据");
    }

    /**
     * 获取商品详情详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:detail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(goodsDetailService.selectGoodsDetailById(id));
    }

    /**
     * 新增商品详情
     */
    @PreAuthorize("@ss.hasPermi('system:detail:add')")
    @Log(title = "商品详情", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GoodsDetail goodsDetail)
    {
        return toAjax(goodsDetailService.insertGoodsDetail(goodsDetail));
    }

    /**
     * 修改商品详情
     */
    @PreAuthorize("@ss.hasPermi('system:detail:edit')")
    @Log(title = "商品详情", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GoodsDetail goodsDetail)
    {
        return toAjax(goodsDetailService.updateGoodsDetail(goodsDetail));
    }

    /**
     * 删除商品详情
     */
    @PreAuthorize("@ss.hasPermi('system:detail:remove')")
    @Log(title = "商品详情", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(goodsDetailService.deleteGoodsDetailByIds(ids));
    }
}
