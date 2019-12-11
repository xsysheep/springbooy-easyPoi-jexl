package com.sheep.excel.mapper;

import com.sheep.excel.entity.FactorFile;
import com.sheep.excel.entity.FactorFileExample;
import com.sheep.excel.entity.FactorFileKey;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface FactorFileMapper {
    int countByExample(FactorFileExample example);

    int deleteByExample(FactorFileExample example);

    int deleteByPrimaryKey(FactorFileKey key);

    int insert(FactorFile record);

    int insertSelective(FactorFile record);

    List<FactorFile> selectByExample(FactorFileExample example);

    FactorFile selectByPrimaryKey(FactorFileKey key);

    int updateByExampleSelective(@Param("record") FactorFile record, @Param("example") FactorFileExample example);

    int updateByExample(@Param("record") FactorFile record, @Param("example") FactorFileExample example);

    int updateByPrimaryKeySelective(FactorFile record);

    int updateByPrimaryKey(FactorFile record);

    ArrayList<FactorFile> selectAll();
}