package com.oracle.mapper;

import com.oracle.entity.Adminmessage;
import com.oracle.entity.AdminmessageExample;
import java.util.List;

import com.oracle.entity.classInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AdminmessageMapper {
    long countByExample(AdminmessageExample example);

    int deleteByExample(AdminmessageExample example);

    int deleteByPrimaryKey(Integer admid);

    int insert(Adminmessage record);

    int insertSelective(Adminmessage record);

    List<Adminmessage> selectByExample(AdminmessageExample example);

    Adminmessage selectByPrimaryKey(Integer admid);

    int updateByExampleSelective(@Param("record") Adminmessage record, @Param("example") AdminmessageExample example);

    int updateByExample(@Param("record") Adminmessage record, @Param("example") AdminmessageExample example);

    int updateByPrimaryKeySelective(Adminmessage record);

    int updateByPrimaryKey(Adminmessage record);

    //自己写的
    @Select("SELECT  *\n" +
            "from adminmessage\n" +
            "WHERE admName not in('admin') LIMIT #{page},#{limit};")
    List<Adminmessage> allAdmInfo(@Param("page") int page, @Param("limit") int limit);


}