package com.share1024.controller;

import com.share1024.utils.FileUtil;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by yesheng on 2017/9/19.
 */
@RestController
public class FileController {

    @RequestMapping("/upload")
    @ResponseBody
    public Object uploadFile(MultipartFile file){


        String fileName = file.getName();
        System.out.println("===="+fileName);
        try {
            System.out.println(FileUtil.toString(file.getInputStream(),"utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "ok";
    }
}
