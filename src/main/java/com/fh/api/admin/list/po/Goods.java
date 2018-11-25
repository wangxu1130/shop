package com.fh.api.admin.list.po;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fh.api.admin.common.BigDecimalJackson;


import java.io.Serializable;
import java.math.BigDecimal;

public class Goods  implements Serializable  {


    private static final long serialVersionUID = 6423709329219018992L;

    private Integer id;

    private String goodsName;

    private String goodsPhoto;
    @JsonSerialize(using = BigDecimalJackson.class)
    private BigDecimal price;
    private  Integer brandId;
    private  Integer category1;
    private  Integer category2;
    private  Integer category3;
    private Integer stock;
    private String cateInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPhoto() {
        return goodsPhoto;
    }

    public void setGoodsPhoto(String goodsPhoto) {
        this.goodsPhoto = goodsPhoto;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategory1() {
        return category1;
    }

    public void setCategory1(Integer category1) {
        this.category1 = category1;
    }

    public Integer getCategory2() {
        return category2;
    }

    public void setCategory2(Integer category2) {
        this.category2 = category2;
    }

    public Integer getCategory3() {
        return category3;
    }

    public void setCategory3(Integer category3) {
        this.category3 = category3;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCateInfo() {
        return cateInfo;
    }

    public void setCateInfo(String cateInfo) {
        this.cateInfo = cateInfo;
    }
}
