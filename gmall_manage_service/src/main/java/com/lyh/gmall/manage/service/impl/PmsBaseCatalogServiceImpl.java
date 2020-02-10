package com.lyh.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyh.gmall.bean.pojo.PmsBaseCatalog1;
import com.lyh.gmall.bean.pojo.PmsBaseCatalog2;
import com.lyh.gmall.bean.pojo.PmsBaseCatalog3;
import com.lyh.gmall.bean.service.PmsBaseCatalogService;
import com.lyh.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.lyh.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.lyh.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/10 20:35
 * @Description:
 */
@Service
public class PmsBaseCatalogServiceImpl implements PmsBaseCatalogService {

    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);

        return pmsBaseCatalog2Mapper.select(pmsBaseCatalog2);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        return pmsBaseCatalog3Mapper.select(pmsBaseCatalog3);
    }
}
