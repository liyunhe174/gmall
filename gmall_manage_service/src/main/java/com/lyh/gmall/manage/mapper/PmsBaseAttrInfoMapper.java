package com.lyh.gmall.manage.mapper;

import com.lyh.gmall.bean.pojo.PmsBaseAttrInfo;
import com.sun.org.apache.xml.internal.security.Init;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/10 21:12
 * @Description:
 */
public interface PmsBaseAttrInfoMapper extends Mapper<PmsBaseAttrInfo> {
    int insetInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
}
