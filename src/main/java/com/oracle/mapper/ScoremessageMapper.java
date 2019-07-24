package com.oracle.mapper;

import com.oracle.entity.Scoremessage;
import com.oracle.entity.ScoremessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoremessageMapper {
    long countByExample(ScoremessageExample example);

    int deleteByExample(ScoremessageExample example);

    int deleteByPrimaryKey(Integer scoid);

    int insert(Scoremessage record);

    int insertSelective(Scoremessage record);

    List<Scoremessage> selectByExample(ScoremessageExample example);

    Scoremessage selectByPrimaryKey(Integer scoid);

    int updateByExampleSelective(@Param("record") Scoremessage record, @Param("example") ScoremessageExample example);

    int updateByExample(@Param("record") Scoremessage record, @Param("example") ScoremessageExample example);

    int updateByPrimaryKeySelective(Scoremessage record);

    int updateByPrimaryKey(Scoremessage record);
}