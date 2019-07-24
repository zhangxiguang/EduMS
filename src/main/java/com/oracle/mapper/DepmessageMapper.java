package com.oracle.mapper;

import com.oracle.entity.Depmessage;
import com.oracle.entity.DepmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepmessageMapper {
    long countByExample(DepmessageExample example);

    int deleteByExample(DepmessageExample example);

    int deleteByPrimaryKey(Integer depid);

    int insert(Depmessage record);

    int insertSelective(Depmessage record);

    List<Depmessage> selectByExample(DepmessageExample example);

    Depmessage selectByPrimaryKey(Integer depid);

    int updateByExampleSelective(@Param("record") Depmessage record, @Param("example") DepmessageExample example);

    int updateByExample(@Param("record") Depmessage record, @Param("example") DepmessageExample example);

    int updateByPrimaryKeySelective(Depmessage record);

    int updateByPrimaryKey(Depmessage record);
}