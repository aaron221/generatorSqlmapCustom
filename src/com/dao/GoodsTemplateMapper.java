package com.dao;

import com.bean.GoodsTemplate;
import com.bean.GoodsTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsTemplateMapper {
    int countByExample(GoodsTemplateExample example);

    int deleteByExample(GoodsTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsTemplate record);

    int insertSelective(GoodsTemplate record);

    List<GoodsTemplate> selectByExample(GoodsTemplateExample example);

    GoodsTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsTemplate record, @Param("example") GoodsTemplateExample example);

    int updateByExample(@Param("record") GoodsTemplate record, @Param("example") GoodsTemplateExample example);

    int updateByPrimaryKeySelective(GoodsTemplate record);

    int updateByPrimaryKey(GoodsTemplate record);
}