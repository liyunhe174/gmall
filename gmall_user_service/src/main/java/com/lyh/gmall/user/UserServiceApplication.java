package com.lyh.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/9 15:57
 * @Description: 用户服务层启动类
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lyh.gmall.user.mapper")
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
