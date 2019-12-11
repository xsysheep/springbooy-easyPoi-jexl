package com.sheep.excel.mapper;

import com.sheep.excel.entity.Formula;
import com.sheep.excel.entity.FormulaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormulaMapper {
    int countByExample(FormulaExample example);

    int deleteByExample(FormulaExample example);

    int deleteByPrimaryKey(Integer formulaid);

    int insert(Formula record);

    int insertSelective(Formula record);

    List<Formula> selectByExample(FormulaExample example);

    Formula selectByPrimaryKey(Integer formulaid);

    int updateByExampleSelective(@Param("record") Formula record, @Param("example") FormulaExample example);

    int updateByExample(@Param("record") Formula record, @Param("example") FormulaExample example);

    int updateByPrimaryKeySelective(Formula record);

    int updateByPrimaryKey(Formula record);
}