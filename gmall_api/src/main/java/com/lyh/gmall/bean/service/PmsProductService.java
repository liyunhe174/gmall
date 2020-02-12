package com.lyh.gmall.bean.service;

import com.lyh.gmall.bean.pojo.PmsBaseSaleAttr;
import com.lyh.gmall.bean.pojo.PmsProductInfo;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/12 21:46
 * @Description:
 */
public interface PmsProductService {
    /**
     * 描述: 根据三级分类id 获取商品属性id
     * @param catalog3Id:
     * @return java.util.List<com.lyh.gmall.bean.pojo.PmsProductInfo>
     * @author  liyunhe
     * @Datetime  2020/2/12 21:47
     */
    List<PmsProductInfo> spuList(String catalog3Id);

    /**
     * 描述:
        查询基本销售属性清单
     * @return java.util.List<com.lyh.gmall.bean.pojo.PmsBaseSaleAttr>
     * @author  liyunhe
     * @Datetime  2020/2/12 22:05
     */
    List<PmsBaseSaleAttr> baseSaleAttrList();
}
