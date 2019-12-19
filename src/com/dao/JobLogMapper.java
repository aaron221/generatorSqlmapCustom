package com.dao;

import com.bean.JobLog;
import com.bean.JobLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobLogMapper {
    int countByExample(JobLogExample example);

    int deleteByExample(JobLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JobLog record);

    int insertSelective(JobLog record);

    List<JobLog> selectByExample(JobLogExample example);

    JobLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JobLog record, @Param("example") JobLogExample example);

    int updateByExample(@Param("record") JobLog record, @Param("example") JobLogExample example);

    int updateByPrimaryKeySelective(JobLog record);

    int updateByPrimaryKey(JobLog record);
}