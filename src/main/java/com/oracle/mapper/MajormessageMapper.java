package com.oracle.mapper;

import com.oracle.entity.Majormessage;
import com.oracle.entity.MajormessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajormessageMapper {
    long countByExample(MajormessageExample example);

    int deleteByExample(MajormessageExample example);

    int deleteByPrimaryKey(Integer majid);

    int insert(Majormessage record);

    int insertSelective(Majormessage record);

    List<Majormessage> selectByExample(MajormessageExample example);

    Majormessage selectByPrimaryKey(Integer majid);

    int updateByExampleSelective(@Param("record") Majormessage record, @Param("example") MajormessageExample example);

    int updateByExample(@Param("record") Majormessage record, @Param("example") MajormessageExample example);

    int updateByPrimaryKeySelective(Majormessage record);

    int updateByPrimaryKey(Majormessage record);
}