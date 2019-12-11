package com.sheep.excel.controller;


import com.sheep.excel.entity.Result;
import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("jexl")
public class JexlController {

    @ResponseBody
    @RequestMapping("/jexl")
    public Result jexl(){

        JexlContext jc = new MapContext();
        jc.set("x",100/100);
        jc.set("y",200);
        jc.set("z",50);
        jc.set("k",33);
        Expression expression = new JexlEngine().createExpression("(x-y)*z/k");
        Object evaluate = expression.evaluate(jc);
        System.out.println(evaluate);
        Result result = new Result();
        result.setMessage(evaluate.toString());

        return result;


    }
}
