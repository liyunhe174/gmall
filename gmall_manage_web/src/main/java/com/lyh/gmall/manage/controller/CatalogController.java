package com.lyh.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyh.gmall.bean.pojo.PmsBaseCatalog1;
import com.lyh.gmall.bean.pojo.PmsBaseCatalog2;
import com.lyh.gmall.bean.pojo.PmsBaseCatalog3;
import com.lyh.gmall.bean.service.PmsBaseCatalogService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/10 20:01
 * @Description:
 */
@RestController
@CrossOrigin
public class CatalogController {
    @Reference
    private PmsBaseCatalogService pmsBaseCatalogService;

    @RequestMapping(value = "/getCatalog1", method = RequestMethod.POST)
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> catalog1 = pmsBaseCatalogService.getCatalog1();
        return catalog1;
    }

    @RequestMapping(value = "/getCatalog2", method = RequestMethod.POST)
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        List<PmsBaseCatalog2> catalog2 = pmsBaseCatalogService.getCatalog2(catalog1Id);
        return catalog2;
    }

    @RequestMapping(value = "/getCatalog3", method = RequestMethod.POST)
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        List<PmsBaseCatalog3> Catalog3 = pmsBaseCatalogService.getCatalog3(catalog2Id);
        return Catalog3;
    }
}
