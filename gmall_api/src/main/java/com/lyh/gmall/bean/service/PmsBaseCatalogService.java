package com.lyh.gmall.bean.service;

import com.lyh.gmall.bean.pojo.PmsBaseCatalog1;
import com.lyh.gmall.bean.pojo.PmsBaseCatalog2;
import com.lyh.gmall.bean.pojo.PmsBaseCatalog3;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/10 20:15
 * @Description: 类别的服务层
 */

public interface PmsBaseCatalogService {
    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
