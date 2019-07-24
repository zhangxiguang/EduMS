package com.oracle.mapper;

import com.oracle.entity.Papermanagement;
import com.oracle.entity.PapermanagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PapermanagementMapper {
    long countByExample(PapermanagementExample example);

    int deleteByExample(PapermanagementExample example);

    int deleteByPrimaryKey(Integer papid);

    int insert(Papermanagement record);

    int insertSelective(Papermanagement record);

    List<Papermanagement> selectByExample(PapermanagementExample example);

    Papermanagement selectByPrimaryKey(Integer papid);

    int updateByExampleSelective(@Param("record") Papermanagement record, @Param("example") PapermanagementExample example);

    int updateByExample(@Param("record") Papermanagement record, @Param("example") PapermanagementExample example);

    int updateByPrimaryKeySelective(Papermanagement record);

    int updateByPrimaryKey(Papermanagement record);
}