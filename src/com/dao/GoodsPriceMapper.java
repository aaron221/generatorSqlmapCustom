package com.dao;

import com.bean.GoodsPrice;
import com.bean.GoodsPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPriceMapper {
    int countByExample(GoodsPriceExample example);

    int deleteByExample(GoodsPriceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsPrice record);

    int insertSelective(GoodsPrice record);

    List<GoodsPrice> selectByExample(GoodsPriceExample example);

    GoodsPrice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsPrice record, @Param("example") GoodsPriceExample example);

    int updateByExample(@Param("record") GoodsPrice record, @Param("example") GoodsPriceExample example);

    int updateByPrimaryKeySelective(GoodsPrice record);

    int updateByPrimaryKey(GoodsPrice record);
}