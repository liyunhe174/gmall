package com.lyh.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyh.gmall.bean.pojo.PmsBaseAttrInfo;
import com.lyh.gmall.bean.pojo.PmsBaseAttrValue;
import com.lyh.gmall.bean.service.PmsBaseAttrService;
import com.lyh.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.lyh.gmall.manage.mapper.PmsBaseAttrValueMpper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/10 21:11
 * @Description:  参数服务实现类
 */
@Service
public class PmsBaseAttrServiceImpl implements PmsBaseAttrService {

    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    private PmsBaseAttrValueMpper pmsBaseAttrValueMpper;
    @Override
    public List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        return pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(attrId);
        return pmsBaseAttrValueMpper.select(pmsBaseAttrValue) ;
    }
}
