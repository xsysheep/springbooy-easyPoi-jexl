package com.sheep.excel.controller;


import com.sheep.excel.entity.Result;
import com.sheep.excel.service.FormulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("formula")
public class FormulaControler {

    @Resource
    private Result result;

    @Autowired
    private FormulaService formulaService;

    @ResponseBody
    @RequestMapping("/save")
    public Result saveFormula(String formula,Integer ffid){
        Boolean flag = formulaService.saveFormula(formula,ffid);
        result.setFlag(flag);
        if(flag){
            result.setMessage("保存成功");
        }else {
            result.setMessage("保存失败");
        }
        return result;
    }
}
