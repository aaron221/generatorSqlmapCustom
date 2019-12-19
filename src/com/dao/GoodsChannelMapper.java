package com.dao;

import com.bean.GoodsChannel;
import com.bean.GoodsChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsChannelMapper {
    int countByExample(GoodsChannelExample example);

    int deleteByExample(GoodsChannelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsChannel record);

    int insertSelective(GoodsChannel record);

    List<GoodsChannel> selectByExample(GoodsChannelExample example);

    GoodsChannel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsChannel record, @Param("example") GoodsChannelExample example);

    int updateByExample(@Param("record") GoodsChannel record, @Param("example") GoodsChannelExample example);

    int updateByPrimaryKeySelective(GoodsChannel record);

    int updateByPrimaryKey(GoodsChannel record);
}