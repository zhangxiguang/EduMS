package com.oracle.mapper;

import com.oracle.entity.Stumessage;
import com.oracle.entity.StumessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface StumessageMapper {
    long countByExample(StumessageExample example);

    int deleteByExample(StumessageExample example);

    int deleteByPrimaryKey(Integer stuid);

    int insert(Stumessage record);

    int insertSelective(Stumessage record);

    List<Stumessage> selectByExample(StumessageExample example);

    Stumessage selectByPrimaryKey(Integer stuid);

    int updateByExampleSelective(@Param("record") Stumessage record, @Param("example") StumessageExample example);

    int updateByExample(@Param("record") Stumessage record, @Param("example") StumessageExample example);

    int updateByPrimaryKeySelective(Stumessage record);

    int updateByPrimaryKey(Stumessage record);

    //自己写的

    @Update("UPDATE stuMessage SET stuClass=#{classId2} WHERE stuClass=#{classId1};")
    int updateClassId(@Param("classId1")int classId1,@Param("classId2")int classId2);
    @Update("UPDATE stuMessage SET stuDepartment=#{depId},stuMajor=#{majorId} WHERE stuClass=#{classId};")
    int updateClassDepaMajor(@Param("depId")int depId,@Param("majorId")int majorId,@Param("classId")int classId);


}