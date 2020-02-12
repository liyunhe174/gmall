package com.lyh.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyh.gmall.bean.pojo.PmsBaseSaleAttr;
import com.lyh.gmall.bean.pojo.PmsProductInfo;
import com.lyh.gmall.bean.service.PmsProductService;
import com.lyh.gmall.manage.mapper.PmsBaseSaleAttrMapper;
import com.lyh.gmall.manage.mapper.PmsProductInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/12 21:48
 * @Description:
 */
@Service
@SuppressWarnings("all")
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;

    @Autowired
    private PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;
    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        List<PmsProductInfo> pmsProductInfos = pmsProductInfoMapper.selectAll();

        return pmsProductInfos;
    }

    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        List<PmsBaseSaleAttr> pmsBaseSaleAttrList = pmsBaseSaleAttrMapper.selectAll();
        return pmsBaseSaleAttrList;
    }
}
