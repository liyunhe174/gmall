package com.lyh.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.lyh.gmall.bean.pojo.UmsMember;
import com.lyh.gmall.bean.pojo.UmsMemberReceiveAddress;
import com.lyh.gmall.bean.service.UserService;
import com.lyh.gmall.user.mapper.UmsMemberMapper;
import com.lyh.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/8 16:13
 * @Description: 用户服务实现类
 */
@Service
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return umsMemberMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getUserAddrBymemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> receiveAddressList =
                umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return receiveAddressList;
    }

}
