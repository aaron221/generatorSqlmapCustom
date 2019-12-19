package com.dao;

import com.bean.Testsysteminfo;
import com.bean.TestsysteminfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestsysteminfoMapper {
    int countByExample(TestsysteminfoExample example);

    int deleteByExample(TestsysteminfoExample example);

    int deleteByPrimaryKey(Integer systemid);

    int insert(Testsysteminfo record);

    int insertSelective(Testsysteminfo record);

    List<Testsysteminfo> selectByExample(TestsysteminfoExample example);

    Testsysteminfo selectByPrimaryKey(Integer systemid);

    int updateByExampleSelective(@Param("record") Testsysteminfo record, @Param("example") TestsysteminfoExample example);

    int updateByExample(@Param("record") Testsysteminfo record, @Param("example") TestsysteminfoExample example);

    int updateByPrimaryKeySelective(Testsysteminfo record);

    int updateByPrimaryKey(Testsysteminfo record);
}