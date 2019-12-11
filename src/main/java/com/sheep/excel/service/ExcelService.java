package com.sheep.excel.service;

import com.sheep.excel.entity.FactorFile;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

public interface ExcelService {
    boolean upload(MultipartFile file) throws Exception;

    ArrayList<FactorFile> getAll();
}
