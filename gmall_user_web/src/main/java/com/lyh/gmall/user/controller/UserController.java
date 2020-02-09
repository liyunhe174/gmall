package com.lyh.gmall.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.lyh.gmall.bean.pojo.UmsMember;
import com.lyh.gmall.bean.pojo.UmsMemberReceiveAddress;
import com.lyh.gmall.bean.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/8 16:12
 * @Description:  用户控制层
 */
@RestController
@RequestMapping("/user")
@SuppressWarnings("all")
public class UserController {

    @Reference
    private UserService umsMemberService;


    /**
     * 描述:
        查询说有的用户对象
     * @return java.util.List<com.lyh.gmall.user.pojo.UmsMember>
     * @author  liyunhe
     * @Datetime  2020/2/8 16:38
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<UmsMember> getAllUser() {
       List<UmsMember> umsMembers =  umsMemberService.getAllUser();
        return umsMembers;
    }


    /**
     * 描述: 查询收货地址
     * @param memberId:  用户id
     * @return java.util.List<com.lyh.gmall.bean.pojo.UmsMemberReceiveAddress>
     * @author  liyunhe
     * @Datetime  2020/2/8 22:06
     */
    @RequestMapping(value = "/addr/{memberId}" , method = RequestMethod.GET)
    public List<UmsMemberReceiveAddress> getUserAddrBymemberId(@PathVariable("memberId") String memberId) {
        List<UmsMemberReceiveAddress> addressList =
                umsMemberService.getUserAddrBymemberId(memberId);
        return addressList;
    }

}
