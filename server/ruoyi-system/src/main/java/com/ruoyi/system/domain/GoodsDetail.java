package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品详情对象 goods_detail
 * 
 * @author ruoyi
 * @date 2021-05-06
 */
public class GoodsDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 商品id */
    @Excel(name = "商品id")
    private Long goodsId;

    /** 商品名字 */
    @Excel(name = "商品名字")
    private String goodsName;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private String goodsPrice;

    /** 顶部图片（“，”分隔） */
    @Excel(name = "顶部图片", readConverterExp = "“=，”分隔")
    private String topImg;

    /** 商品详情图（“，”分隔） */
    @Excel(name = "商品详情图", readConverterExp = "“=，”分隔")
    private String detailImg;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
    }
    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }
    public void setGoodsPrice(String goodsPrice) 
    {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsPrice() 
    {
        return goodsPrice;
    }
    public void setTopImg(String topImg) 
    {
        this.topImg = topImg;
    }

    public String getTopImg() 
    {
        return topImg;
    }
    public void setDetailImg(String detailImg) 
    {
        this.detailImg = detailImg;
    }

    public String getDetailImg() 
    {
        return detailImg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("goodsPrice", getGoodsPrice())
            .append("topImg", getTopImg())
            .append("detailImg", getDetailImg())
            .toString();
    }
}
