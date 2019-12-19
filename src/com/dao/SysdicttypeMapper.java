package com.dao;

import com.bean.Sysdicttype;
import com.bean.SysdicttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysdicttypeMapper {
    int countByExample(SysdicttypeExample example);

    int deleteByExample(SysdicttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysdicttype record);

    int insertSelective(Sysdicttype record);

    List<Sysdicttype> selectByExample(SysdicttypeExample example);

    Sysdicttype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysdicttype record, @Param("example") SysdicttypeExample example);

    int updateByExample(@Param("record") Sysdicttype record, @Param("example") SysdicttypeExample example);

    int updateByPrimaryKeySelective(Sysdicttype record);

    int updateByPrimaryKey(Sysdicttype record);
}