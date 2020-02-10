package com.lyh.gmall.bean.service;

import com.lyh.gmall.bean.pojo.PmsBaseAttrInfo;
import com.lyh.gmall.bean.pojo.PmsBaseAttrValue;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/10 21:10
 * @Description:  参数服务类
 */
public interface PmsBaseAttrService {
    /**
     * 描述: 根据第三种类别获取参数
     * @param catalog3Id:
     * @return java.util.List<com.lyh.gmall.bean.pojo.PmsBaseAttrInfo>
     * @author  liyunhe
     * @Datetime  2020/2/10 21:16
     */
    List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id);

    /**
     * 描述: 根据属性id查询属性对应的值
     * @param attrId:
     * @return java.util.List<com.lyh.gmall.bean.pojo.PmsBaseAttrValue>
     * @author  liyunhe
     * @Datetime  2020/2/10 21:23
     */
    List<PmsBaseAttrValue> getAttrValueList(String attrId);
}
