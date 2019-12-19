package com.dao;

import com.bean.OrganizationAssociation;
import com.bean.OrganizationAssociationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationAssociationMapper {
    int countByExample(OrganizationAssociationExample example);

    int deleteByExample(OrganizationAssociationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationAssociation record);

    int insertSelective(OrganizationAssociation record);

    List<OrganizationAssociation> selectByExample(OrganizationAssociationExample example);

    OrganizationAssociation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationAssociation record, @Param("example") OrganizationAssociationExample example);

    int updateByExample(@Param("record") OrganizationAssociation record, @Param("example") OrganizationAssociationExample example);

    int updateByPrimaryKeySelective(OrganizationAssociation record);

    int updateByPrimaryKey(OrganizationAssociation record);
}