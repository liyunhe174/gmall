package com.lyh.gmall.manage.mapper;

import com.lyh.gmall.bean.pojo.PmsBaseAttrValue;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/10 21:27
 * @Description: 属性value的dao层 ， 用于与数据库进行交互
 */
@SuppressWarnings("all")
public interface PmsBaseAttrValueMpper  extends Mapper<PmsBaseAttrValue> {

    int insertAttrValueList(@Param("valueList") List<PmsBaseAttrValue> valueList);

    /**
     * 描述: 删除指定属性的属性值
     * @param attrId:
     * @return int
     * @author  liyunhe
     * @Datetime  2020/2/12 20:21
     */
    int deleteList(@Param("attrId") String attrId);
}
