package com.lyh.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyh.gmall.bean.pojo.PmsBaseSaleAttr;
import com.lyh.gmall.bean.pojo.PmsProductInfo;
import com.lyh.gmall.bean.service.PmsProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/12 21:35
 * @Description: spu控制层
 */
@RestController
@CrossOrigin
public class ProductController {


    @Reference
    private PmsProductService pmsProductService;


    /**
     * 描述: 根据三级分类的id获取商品的属性
     * @param catalog3Id:
     * @return java.util.List<com.lyh.gmall.bean.pojo.PmsProductInfo>
     * @author  liyunhe
     * @Datetime  2020/2/12 21:59
     */
    @RequestMapping(value = "/spuList", method = RequestMethod.GET)
    public List<PmsProductInfo> spuList(String catalog3Id) {
        List<PmsProductInfo> spuList = pmsProductService.spuList(catalog3Id);
        return spuList;
    }

    /**
     * 描述:  查询基本销售属性清单
     * @return java.util.List<com.lyh.gmall.bean.pojo.PmsBaseSaleAttr>
     * @author  liyunhe
     * @Datetime  2020/2/12 22:06
     */
    @RequestMapping(value = "/baseSaleAttrList", method = RequestMethod.POST)
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        List<PmsBaseSaleAttr> pmsBaseSaleAttrList = pmsProductService.baseSaleAttrList();
        return pmsBaseSaleAttrList;
    }


    /**
     * 描述: 添加商品
     * @param pmsProductInfo:
     * @return java.lang.String
     * @author  liyunhe
     * @Datetime  2020/2/12 22:50
     */
    @RequestMapping(value = "/saveSpuInfo")
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo) {

        //TODO 添加商品
        return "success";
    }


}
