package com.lyh.gmall.manage.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Auther: liyunhe
 * @Date: 2020/2/12 22:52
 * @Description: 文件上传控制层
 */
@RestController
@CrossOrigin
public class FileUploadController {
    /**
     * 描述: 文件上传
     * @param multipartFile:
     * @return java.lang.String
     * @author  liyunhe
     * @Datetime  2020/2/12 22:51
     */
    @RequestMapping(value = "/fileUpload")
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile) {

        //TODO 文件服务器的搭建

        return "success";
    }

}
