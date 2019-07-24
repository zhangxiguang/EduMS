package com.oracle.mapper;

import com.oracle.entity.Classmessage;
import com.oracle.entity.ClassmessageExample;
import java.util.List;

import com.oracle.entity.classInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ClassmessageMapper {
    long countByExample(ClassmessageExample example);

    int deleteByExample(ClassmessageExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(Classmessage record);

    int insertSelective(Classmessage record);

    List<Classmessage> selectByExample(ClassmessageExample example);

    Classmessage selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") Classmessage record, @Param("example") ClassmessageExample example);

    int updateByExample(@Param("record") Classmessage record, @Param("example") ClassmessageExample example);

    int updateByPrimaryKeySelective(Classmessage record);

    int updateByPrimaryKey(Classmessage record);

    //自己写的
    @Select("SELECT  c.classID,c.className,d.depName,m.majName,t.teaName\n" +
            "from classMessage c,depMessage d,majorMessage m,teaMessage t\n" +
            "WHERE c.depID=d.depID AND c.majID=m.majID and c.teaID=t.teaID LIMIT #{page},#{limit};")
    List<classInfo> allClassInfo(@Param("page") int page, @Param("limit") int limit);

    @Select("SELECT  c.classID,c.className,d.depName,m.majName,t.teaName\n" +
            "from classMessage c,depMessage d,majorMessage m,teaMessage t\n" +
            "WHERE c.depID=d.depID AND c.majID=m.majID and c.teaID=t.teaID and t.teaName=#{teaname} LIMIT #{page},#{limit};")
    List<classInfo> allClassInfoByBoss(@Param("page") int page, @Param("limit") int limit,@Param("teaname")String teanama);

    @Select("SELECT  c.classID,c.className,d.depName,m.majName,t.teaName\n" +
            "from classMessage c,depMessage d,majorMessage m,teaMessage t\n" +
            "WHERE c.depID=d.depID AND c.majID=m.majID and c.teaID=t.teaID and d.depName=#{depname} LIMIT #{page},#{limit};")
    List<classInfo> allClassInfoByDepa(@Param("page") int page, @Param("limit") int limit,@Param("depname")String depname);

    @Select("SELECT  c.classID,c.className,d.depName,m.majName,t.teaName\n" +
            "from classMessage c,depMessage d,majorMessage m,teaMessage t\n" +
            "WHERE c.depID=d.depID AND c.majID=m.majID and c.teaID=t.teaID and m.majName=#{majorname} LIMIT #{page},#{limit};")
    List<classInfo> allClassInfoByMajor(@Param("page") int page, @Param("limit") int limit,@Param("majorname")String majorname);

    @Select("SELECT  c.classID,c.className,d.depName,m.majName,t.teaName\n" +
            "from classMessage c,depMessage d,majorMessage m,teaMessage t\n" +
            "WHERE c.depID=d.depID AND c.majID=m.majID and c.teaID=t.teaID and c.className=#{classname} LIMIT #{page},#{limit};")
    List<classInfo> allClassInfoByClass(@Param("page") int page, @Param("limit") int limit,@Param("classname")String classname);

}