package com.sheep.excel.controller;

import com.sheep.excel.entity.Result;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class ApiController {

    /**
     * 上传excel方法
     *
     * @param file excel文件
     */
    public void upload(@RequestParam("file") MultipartFile file) {

    }

    /**
     * 下载excel方法
     *
     * @param priceid 报价表id
     * @return Result
     */
    public Result download(Integer priceid) {
        return new Result();
    }


}