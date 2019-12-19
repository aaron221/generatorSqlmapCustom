package com.dao;

import com.bean.CategoryAssociation;
import com.bean.CategoryAssociationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryAssociationMapper {
    int countByExample(CategoryAssociationExample example);

    int deleteByExample(CategoryAssociationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CategoryAssociation record);

    int insertSelective(CategoryAssociation record);

    List<CategoryAssociation> selectByExample(CategoryAssociationExample example);

    CategoryAssociation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CategoryAssociation record, @Param("example") CategoryAssociationExample example);

    int updateByExample(@Param("record") CategoryAssociation record, @Param("example") CategoryAssociationExample example);

    int updateByPrimaryKeySelective(CategoryAssociation record);

    int updateByPrimaryKey(CategoryAssociation record);
}