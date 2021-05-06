package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.GoodsDetail;

/**
 * 商品详情Service接口
 * 
 * @author ruoyi
 * @date 2021-05-06
 */
public interface IGoodsDetailService 
{
    /**
     * 查询商品详情
     * 
     * @param id 商品详情ID
     * @return 商品详情
     */
    public GoodsDetail selectGoodsDetailById(Long id);

    /**
     * 查询商品详情列表
     * 
     * @param goodsDetail 商品详情
     * @return 商品详情集合
     */
    public List<GoodsDetail> selectGoodsDetailList(GoodsDetail goodsDetail);

    /**
     * 新增商品详情
     * 
     * @param goodsDetail 商品详情
     * @return 结果
     */
    public int insertGoodsDetail(GoodsDetail goodsDetail);

    /**
     * 修改商品详情
     * 
     * @param goodsDetail 商品详情
     * @return 结果
     */
    public int updateGoodsDetail(GoodsDetail goodsDetail);

    /**
     * 批量删除商品详情
     * 
     * @param ids 需要删除的商品详情ID
     * @return 结果
     */
    public int deleteGoodsDetailByIds(Long[] ids);

    /**
     * 删除商品详情信息
     * 
     * @param id 商品详情ID
     * @return 结果
     */
    public int deleteGoodsDetailById(Long id);
}
