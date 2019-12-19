package com.dao;

import com.bean.GoodsCombinationAssociation;
import com.bean.GoodsCombinationAssociationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCombinationAssociationMapper {
    int countByExample(GoodsCombinationAssociationExample example);

    int deleteByExample(GoodsCombinationAssociationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsCombinationAssociation record);

    int insertSelective(GoodsCombinationAssociation record);

    List<GoodsCombinationAssociation> selectByExample(GoodsCombinationAssociationExample example);

    GoodsCombinationAssociation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsCombinationAssociation record, @Param("example") GoodsCombinationAssociationExample example);

    int updateByExample(@Param("record") GoodsCombinationAssociation record, @Param("example") GoodsCombinationAssociationExample example);

    int updateByPrimaryKeySelective(GoodsCombinationAssociation record);

    int updateByPrimaryKey(GoodsCombinationAssociation record);
}