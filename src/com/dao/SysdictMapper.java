package com.dao;

import com.bean.Sysdict;
import com.bean.SysdictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysdictMapper {
    int countByExample(SysdictExample example);

    int deleteByExample(SysdictExample example);

    int insert(Sysdict record);

    int insertSelective(Sysdict record);

    List<Sysdict> selectByExample(SysdictExample example);

    int updateByExampleSelective(@Param("record") Sysdict record, @Param("example") SysdictExample example);

    int updateByExample(@Param("record") Sysdict record, @Param("example") SysdictExample example);
}