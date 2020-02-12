package com.lyh.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyh.gmall.bean.pojo.PmsBaseAttrInfo;
import com.lyh.gmall.bean.pojo.PmsBaseAttrValue;
import com.lyh.gmall.bean.service.PmsBaseAttrService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/10 21:08
 * @Description:  参数控制器
 */
@RestController
@CrossOrigin
public class AttrController {

    @Reference
    private PmsBaseAttrService pmsBaseAttrService;

    /**
     * 描述: 根据第三类别id获取属性信息
     * @param catalog3Id:
     * @return java.util.List<com.lyh.gmall.bean.pojo.PmsBaseAttrInfo>
     * @author  liyunhe
     * @Datetime  2020/2/10 21:18
     */
    @RequestMapping(value = "/attrInfoList", method = RequestMethod.GET)
    public List<PmsBaseAttrInfo> getAttrList(String catalog3Id) {
        List<PmsBaseAttrInfo> attrInfo = pmsBaseAttrService.getAttrInfo(catalog3Id);
        return attrInfo;
    }


    @RequestMapping(value = "/getAttrValueList", method = RequestMethod.POST)
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        List<PmsBaseAttrValue> pmsBaseAttrValues = pmsBaseAttrService.getAttrValueList(attrId);
        return pmsBaseAttrValues;
    }


    @RequestMapping(value = "/saveAttrInfo")
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo) {
        int info = pmsBaseAttrService.saveAttrInfo(pmsBaseAttrInfo);
        if (info > 0) {
            return "success";
        }
        return "error";
    }


}
