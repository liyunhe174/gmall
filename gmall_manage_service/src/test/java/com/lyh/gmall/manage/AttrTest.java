package com.lyh.gmall.manage;

import com.lyh.gmall.bean.pojo.PmsBaseAttrInfo;
import com.lyh.gmall.bean.pojo.PmsBaseAttrValue;
import com.lyh.gmall.bean.service.PmsBaseAttrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/11 11:11
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AttrTest {

    @Autowired
    private PmsBaseAttrService pmsBaseAttrService;

    @Test
    public void saveAttrInfo() {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id("62");
        pmsBaseAttrInfo.setAttrName("添加测试");

        List<PmsBaseAttrValue> values = new ArrayList<>();

        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setValueName("13");

        values.add(pmsBaseAttrValue);
        pmsBaseAttrInfo.setAttrValueList(values);
        pmsBaseAttrService.saveAttrInfo(pmsBaseAttrInfo);
    }

}
