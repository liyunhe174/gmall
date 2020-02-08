package com.lyh.gmall.bean.service;



import com.lyh.gmall.bean.pojo.UmsMember;
import com.lyh.gmall.bean.pojo.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/8 16:11
 * @Description:  用户会员的服务层
 */
@SuppressWarnings("all")
public interface UserService {
    /**
     * 描述:
        查询所有的用户会员
     * @return java.util.List<com.lyh.gmall.user.pojo.UmsMember>
     * @author  liyunhe
     * @Datetime  2020/2/8 16:18
     */
    List<UmsMember> getAllUser();

    /**
     * 描述:  根据会员id查找用户的收货地址
     * @param memberId:
     * @return java.util.List<com.lyh.gmall.user.pojo.UmsMemberReceiveAddress>
     * @author  liyunhe
     * @Datetime  2020/2/8 16:44
     */
    List<UmsMemberReceiveAddress> getUserAddrBymemberId(String memberId);
}
