package com.sheep.excel.service.impl;

import com.sheep.excel.entity.Formula;
import com.sheep.excel.mapper.FormulaMapper;
import com.sheep.excel.service.FormulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FormulaServiceImpl implements FormulaService {


    @Resource
    private FormulaMapper formulaMapper;

    @Override
    public Boolean saveFormula(String formula,Integer ffid) {
        Formula formula1 = new Formula();
        formula1.setFfid(ffid);
        formula1.setFormula(formula);
        int insert = formulaMapper.insert(formula1);
        System.out.println(insert);
        return insert>0;
    }
}
