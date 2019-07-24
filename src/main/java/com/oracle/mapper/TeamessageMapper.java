package com.oracle.mapper;

import com.oracle.entity.Teamessage;
import com.oracle.entity.TeamessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamessageMapper {
    long countByExample(TeamessageExample example);

    int deleteByExample(TeamessageExample example);

    int deleteByPrimaryKey(Integer teaid);

    int insert(Teamessage record);

    int insertSelective(Teamessage record);

    List<Teamessage> selectByExample(TeamessageExample example);

    Teamessage selectByPrimaryKey(Integer teaid);

    int updateByExampleSelective(@Param("record") Teamessage record, @Param("example") TeamessageExample example);

    int updateByExample(@Param("record") Teamessage record, @Param("example") TeamessageExample example);

    int updateByPrimaryKeySelective(Teamessage record);

    int updateByPrimaryKey(Teamessage record);
}