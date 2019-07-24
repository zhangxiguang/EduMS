package com.oracle.mapper;

import com.oracle.entity.Coursemessage;
import com.oracle.entity.CoursemessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursemessageMapper {
    long countByExample(CoursemessageExample example);

    int deleteByExample(CoursemessageExample example);

    int deleteByPrimaryKey(Integer couid);

    int insert(Coursemessage record);

    int insertSelective(Coursemessage record);

    List<Coursemessage> selectByExample(CoursemessageExample example);

    Coursemessage selectByPrimaryKey(Integer couid);

    int updateByExampleSelective(@Param("record") Coursemessage record, @Param("example") CoursemessageExample example);

    int updateByExample(@Param("record") Coursemessage record, @Param("example") CoursemessageExample example);

    int updateByPrimaryKeySelective(Coursemessage record);

    int updateByPrimaryKey(Coursemessage record);
}