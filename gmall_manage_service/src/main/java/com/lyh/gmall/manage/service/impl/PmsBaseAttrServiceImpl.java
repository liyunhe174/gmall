package com.lyh.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyh.gmall.bean.pojo.PmsBaseAttrInfo;
import com.lyh.gmall.bean.pojo.PmsBaseAttrValue;
import com.lyh.gmall.bean.service.PmsBaseAttrService;
import com.lyh.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.lyh.gmall.manage.mapper.PmsBaseAttrValueMpper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/10 21:11
 * @Description: 参数服务实现类
 */
@Service
@SuppressWarnings("all")
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
        return pmsBaseAttrValueMpper.select(pmsBaseAttrValue);
    }

    @Transactional
    @Override
    public int saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        int info = 0;
        //如果平台属性为空的说明是添加操作
        if (StringUtils.isEmpty(pmsBaseAttrInfo.getId())) {
            info = pmsBaseAttrInfoMapper.insetInfo(pmsBaseAttrInfo);
            //判断平台属性中的属性值集合是否为空
            if (!pmsBaseAttrInfo.getAttrValueList().isEmpty()) {
                pmsBaseAttrInfo.getAttrValueList().forEach(item -> item.setAttrId(pmsBaseAttrInfo.getId()));
                pmsBaseAttrValueMpper.insertAttrValueList(pmsBaseAttrInfo.getAttrValueList());
            }
        } else { //否则为修改操作
            info = pmsBaseAttrInfoMapper.updateByPrimaryKey(pmsBaseAttrInfo);
            info = pmsBaseAttrValueMpper.deleteList(pmsBaseAttrInfo.getId());
            if (!pmsBaseAttrInfo.getAttrValueList().isEmpty()) {
                pmsBaseAttrInfo.getAttrValueList().forEach(e -> e.setAttrId(pmsBaseAttrInfo.getId()));
                info = pmsBaseAttrValueMpper.insertAttrValueList(pmsBaseAttrInfo.getAttrValueList());
            }
        }
        return info;
    }
}
