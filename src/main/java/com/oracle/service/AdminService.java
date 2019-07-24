package com.oracle.service;

import com.oracle.entity.*;

import javax.crypto.interfaces.PBEKey;
import java.util.List;

public interface AdminService {
    public Adminmessage login(Adminmessage adminmessage);

    public List<Depmessage> adllDepa();
    public List<Majormessage> allMajor(String depaName);
    public List<Classmessage> allClass(String majorName);
    public List<classInfo> allClassInfo(int page, int limit);
    public int ClassCount();
    public List<Teamessage> allBoss();
    public boolean searchClassName(String className);
    public Teamessage searchTeaByTeaName(String teaname);
    public Depmessage searchDepaByDepaName(String depName);
    public Majormessage searchMajorByMajorName(String majorName);
    public int addNewClass(Classmessage classmessage);

    public List<classInfo> allClassInfoByBoss(int page, int limit,String teaname);
    public List<classInfo> allClassInfoByDepa(int page, int limit,String depname);
    public List<classInfo> allClassInfoByMajor(int page, int limit,String majorname);
    public List<classInfo> allClassInfoByClass(int page, int limit,String classname);
    public int ClassCountByBoss(int teaid);
    public int ClassCountByDepa(int depid);
    public int ClassCountByMajor(int majid);

    public int editClassInfo(Classmessage classmessage);

    public int delClassInfo(int classid);

    public int classComBine(int classId1,int classId2);
    public Classmessage searchClassByClassName(String classname);
    public int updateClassDepaMajor(int depId,int majorId,int classId);

    public int updateAdminInfo(Adminmessage adminmessage);

    public Adminmessage loginByPhone(String phone);

    public List<Adminmessage> allAdmin(int page, int limit);
    public int AdminCount();

    public int updateNorAdminInfo(Adminmessage adminmessage);
    public Adminmessage searchNorAdmByKey(int admId);
    public Adminmessage checkAdmName(String admName);
    public int addNewAdm(Adminmessage adminmessage);
    public int delAdm(int admId);

    public Adminmessage loginByFace(int admID);
    public Adminmessage searchAdmIdByName(String admName);
    public List<Adminmessage> allAdminToFace();
}
