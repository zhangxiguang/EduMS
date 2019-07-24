package com.oracle.mapper;

import com.oracle.entity.Teachresource;
import com.oracle.entity.TeachresourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachresourceMapper {
    long countByExample(TeachresourceExample example);

    int deleteByExample(TeachresourceExample example);

    int deleteByPrimaryKey(Integer resid);

    int insert(Teachresource record);

    int insertSelective(Teachresource record);

    List<Teachresource> selectByExample(TeachresourceExample example);

    Teachresource selectByPrimaryKey(Integer resid);

    int updateByExampleSelective(@Param("record") Teachresource record, @Param("example") TeachresourceExample example);

    int updateByExample(@Param("record") Teachresource record, @Param("example") TeachresourceExample example);

    int updateByPrimaryKeySelective(Teachresource record);

    int updateByPrimaryKey(Teachresource record);
}