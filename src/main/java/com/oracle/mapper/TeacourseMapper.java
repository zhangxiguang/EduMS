package com.oracle.mapper;

import com.oracle.entity.Teacourse;
import com.oracle.entity.TeacourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacourseMapper {
    long countByExample(TeacourseExample example);

    int deleteByExample(TeacourseExample example);

    int deleteByPrimaryKey(Integer cousid);

    int insert(Teacourse record);

    int insertSelective(Teacourse record);

    List<Teacourse> selectByExample(TeacourseExample example);

    Teacourse selectByPrimaryKey(Integer cousid);

    int updateByExampleSelective(@Param("record") Teacourse record, @Param("example") TeacourseExample example);

    int updateByExample(@Param("record") Teacourse record, @Param("example") TeacourseExample example);

    int updateByPrimaryKeySelective(Teacourse record);

    int updateByPrimaryKey(Teacourse record);
}