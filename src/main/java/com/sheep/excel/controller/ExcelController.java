package com.sheep.excel.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.util.PoiPublicUtil;
import com.sheep.excel.entity.FactorFile;
import com.sheep.excel.entity.Person;
import com.sheep.excel.entity.Result;
import com.sheep.excel.service.ExcelService;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("excel")
public class ExcelController {


    @Autowired
    private ExcelService excelService;

    List<Person> personList = new ArrayList<>();
    Person person1 = new Person("张三","1");
    Person person2 = new Person("张4","2");

    @RequestMapping("/import")
    public String importExcel(){
        ArrayList<FactorFile> arraylist = excelService.getAll();
        FactorFile factorFile = arraylist.get(1);
        String filePath = "D:\\xxxx.xls";
        Workbook workbook = ExcelExportUtil.exportExcel
                (new ExportParams("ss","ss"),FactorFile.class,arraylist);
        File file = new File("D:\\new1.xlsx");

        try {
            file.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("excel到处完毕");
        return "/download.html";

    }

    @Test
    public void test2() {
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        long start = new Date().getTime();
        List<Person> list = ExcelImportUtil.importExcel(
                new File(PoiPublicUtil.getWebRootPath("excel/new.xlsx")),
                Person.class, params);
        System.out.println(new Date().getTime() - start);
        System.out.println(list.size());
        System.out.println(ReflectionToStringBuilder.toString(list.get(0)));
    }


    @RequestMapping("/test")
    public String test(){
        return "/download.html";
    }
    @ResponseBody
    @RequestMapping("/upload")
    public Result upload(@RequestParam("file") MultipartFile file){
        boolean flag = false;
        try {
            flag = excelService.upload(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Result result = new Result();
        result.setFlag(flag);
        if (flag) {
            result.setMessage("成功");
        }else
            result.setMessage("失败");
        return result;

    }
    @ResponseBody
    @RequestMapping("/getAll")
    public List<FactorFile> getAll(){
        ArrayList<FactorFile> arraylist = excelService.getAll();
        return arraylist;

    }


}
