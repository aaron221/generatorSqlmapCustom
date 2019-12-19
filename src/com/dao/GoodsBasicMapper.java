package com.dao;

import com.bean.GoodsBasic;
import com.bean.GoodsBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsBasicMapper {
    int countByExample(GoodsBasicExample example);

    int deleteByExample(GoodsBasicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsBasic record);

    int insertSelective(GoodsBasic record);

    List<GoodsBasic> selectByExample(GoodsBasicExample example);

    GoodsBasic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsBasic record, @Param("example") GoodsBasicExample example);

    int updateByExample(@Param("record") GoodsBasic record, @Param("example") GoodsBasicExample example);

    int updateByPrimaryKeySelective(GoodsBasic record);

    int updateByPrimaryKey(GoodsBasic record);
}