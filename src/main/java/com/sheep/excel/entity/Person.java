package com.sheep.excel.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Person {

    @Excel(name="姓名",orderNum = "0")
    private String name;

    @Excel(name="id",orderNum = "1")
    private String id;

    public Person() {
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
