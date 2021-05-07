package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.GoodsDetail;

/**
 * 商品详情Mapper接口
 * 
 * @author ruoyi
 * @date 2021-05-06
 */
public interface GoodsDetailMapper 
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
     * 删除商品详情
     * 
     * @param id 商品详情ID
     * @return 结果
     */
    public int deleteGoodsDetailById(Long id);

    /**
     * 批量删除商品详情
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGoodsDetailByIds(Long[] ids);
}
