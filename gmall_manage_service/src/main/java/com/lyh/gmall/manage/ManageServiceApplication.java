package com.lyh.gmall.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/10 17:58
 * @Description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lyh.gmall.manage.mapper")
public class ManageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageServiceApplication.class, args);
    }
}
