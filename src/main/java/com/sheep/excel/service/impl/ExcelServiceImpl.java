package com.sheep.excel.service.impl;

import com.sheep.excel.entity.FactorFile;
import com.sheep.excel.mapper.FactorFileMapper;
import com.sheep.excel.service.ExcelService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@Service
public class ExcelServiceImpl implements ExcelService{

    @Resource
    private FactorFileMapper factorFileMapper;

    @Override
    public boolean upload(MultipartFile file) throws Exception {
        if (file == null || file.isEmpty()) {
            throw new Exception("未选择需上传的文件");
        }

        String filePath = new File("D:\\").getAbsolutePath();
        File fileUpload = new File(filePath);
        if (!fileUpload.exists()) {
            fileUpload.mkdirs();
        }

        fileUpload = new File(filePath, file.getOriginalFilename());
        if (fileUpload.exists()) {
            throw new Exception("上传的已存在");
        }

        try {
            file.transferTo(fileUpload);
            return true;
        } catch (IOException e) {
            throw new Exception("上传服务器失败：" + e.toString());
        }
    }

    @Override
    public ArrayList<FactorFile> getAll() {

        return  factorFileMapper.selectAll();
    }
}
