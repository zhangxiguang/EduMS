package com.oracle.mapper;

import com.oracle.entity.Stucourse;
import com.oracle.entity.StucourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StucourseMapper {
    long countByExample(StucourseExample example);

    int deleteByExample(StucourseExample example);

    int deleteByPrimaryKey(Integer cousid);

    int insert(Stucourse record);

    int insertSelective(Stucourse record);

    List<Stucourse> selectByExample(StucourseExample example);

    Stucourse selectByPrimaryKey(Integer cousid);

    int updateByExampleSelective(@Param("record") Stucourse record, @Param("example") StucourseExample example);

    int updateByExample(@Param("record") Stucourse record, @Param("example") StucourseExample example);

    int updateByPrimaryKeySelective(Stucourse record);

    int updateByPrimaryKey(Stucourse record);
}