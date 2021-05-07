package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GoodsDetailMapper;
import com.ruoyi.system.domain.GoodsDetail;
import com.ruoyi.system.service.IGoodsDetailService;

/**
 * 商品详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-06
 */
@Service
public class GoodsDetailServiceImpl implements IGoodsDetailService 
{
    @Autowired
    private GoodsDetailMapper goodsDetailMapper;

    /**
     * 查询商品详情
     * 
     * @param id 商品详情ID
     * @return 商品详情
     */
    @Override
    public GoodsDetail selectGoodsDetailById(Long id)
    {
        return goodsDetailMapper.selectGoodsDetailById(id);
    }

    /**
     * 查询商品详情列表
     * 
     * @param goodsDetail 商品详情
     * @return 商品详情
     */
    @Override
    public List<GoodsDetail> selectGoodsDetailList(GoodsDetail goodsDetail)
    {
        return goodsDetailMapper.selectGoodsDetailList(goodsDetail);
    }

    /**
     * 新增商品详情
     * 
     * @param goodsDetail 商品详情
     * @return 结果
     */
    @Override
    public int insertGoodsDetail(GoodsDetail goodsDetail)
    {
        return goodsDetailMapper.insertGoodsDetail(goodsDetail);
    }

    /**
     * 修改商品详情
     * 
     * @param goodsDetail 商品详情
     * @return 结果
     */
    @Override
    public int updateGoodsDetail(GoodsDetail goodsDetail)
    {
        return goodsDetailMapper.updateGoodsDetail(goodsDetail);
    }

    /**
     * 批量删除商品详情
     * 
     * @param ids 需要删除的商品详情ID
     * @return 结果
     */
    @Override
    public int deleteGoodsDetailByIds(Long[] ids)
    {
        return goodsDetailMapper.deleteGoodsDetailByIds(ids);
    }

    /**
     * 删除商品详情信息
     * 
     * @param id 商品详情ID
     * @return 结果
     */
    @Override
    public int deleteGoodsDetailById(Long id)
    {
        return goodsDetailMapper.deleteGoodsDetailById(id);
    }
}
