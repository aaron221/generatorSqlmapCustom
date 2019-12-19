package com.dao;

import com.bean.GoodsDistributionCenter;
import com.bean.GoodsDistributionCenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsDistributionCenterMapper {
    int countByExample(GoodsDistributionCenterExample example);

    int deleteByExample(GoodsDistributionCenterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsDistributionCenter record);

    int insertSelective(GoodsDistributionCenter record);

    List<GoodsDistributionCenter> selectByExample(GoodsDistributionCenterExample example);

    GoodsDistributionCenter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsDistributionCenter record, @Param("example") GoodsDistributionCenterExample example);

    int updateByExample(@Param("record") GoodsDistributionCenter record, @Param("example") GoodsDistributionCenterExample example);

    int updateByPrimaryKeySelective(GoodsDistributionCenter record);

    int updateByPrimaryKey(GoodsDistributionCenter record);
}