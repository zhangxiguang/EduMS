package com.oracle.service.imp;

import com.oracle.entity.*;
import com.oracle.mapper.*;
import com.oracle.mapper.AdminmessageMapper;
import com.oracle.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImp implements AdminService {

    @Resource
    AdminmessageMapper adminmessageMapper;
    @Resource
    DepmessageMapper depmessageMapper;
    @Resource
    MajormessageMapper majormessageMapper;
    @Resource
    ClassmessageMapper classmessageMapper;
    @Resource
    TeamessageMapper teamessageMapper;
    @Resource
    StumessageMapper stumessageMapper;



    @Override
    public Adminmessage login(Adminmessage adminmessage) {
        if (adminmessage == null || " ".equals(adminmessage.getAdmname()) || " ".equals(adminmessage.getAdmpass())) {

            return null;

        } else {

            AdminmessageExample example=new AdminmessageExample();
            AdminmessageExample.Criteria criteria = example.createCriteria();
            criteria.andAdmnameEqualTo(adminmessage.getAdmname());
            criteria.andAdmpassEqualTo(adminmessage.getAdmpass());

            List<Adminmessage> admins = adminmessageMapper.selectByExample(example);
            if (admins != null && admins.size() > 0) {

                return admins.get(0);
            }

        }
        return null;
    }


    @Override
    public List<Depmessage> adllDepa() {
        DepmessageExample example=new DepmessageExample();
        return depmessageMapper.selectByExample(example);
    }

    @Override
    public List<Majormessage> allMajor(String depaName) {
        int depaID=0;
        DepmessageExample example1=new DepmessageExample();
        DepmessageExample.Criteria criteria1=example1.createCriteria();
        criteria1.andDepnameEqualTo(depaName);
        List<Depmessage> depmessageList = depmessageMapper.selectByExample(example1);
        if (depmessageList != null && depmessageList.size() > 0) {

            depaID=depmessageList.get(0).getDepid();
        }


        MajormessageExample example=new MajormessageExample();
        MajormessageExample.Criteria criteria=example.createCriteria();
        criteria.andDepidEqualTo(depaID);
        List<Majormessage> majormessageList = majormessageMapper.selectByExample(example);
        if (majormessageList != null && majormessageList.size() > 0) {

            return majormessageList;
        }
        return null;
    }

    @Override
    public List<Classmessage> allClass(String majorName) {
        int majorID=0;
        MajormessageExample example1=new MajormessageExample();
        MajormessageExample.Criteria criteria1=example1.createCriteria();
        criteria1.andMajnameEqualTo(majorName);
        List<Majormessage> majormessageList = majormessageMapper.selectByExample(example1);
        if (majormessageList != null && majormessageList.size() > 0) {

            majorID=majormessageList.get(0).getMajid();
        }


        ClassmessageExample example=new ClassmessageExample();
        ClassmessageExample.Criteria criteria=example.createCriteria();
        criteria.andMajidEqualTo(majorID);
        List<Classmessage> classmessages = classmessageMapper.selectByExample(example);
        if (classmessages != null && classmessages.size() > 0) {

            return classmessages;
        }
        return null;
    }

    @Override
    public List<classInfo> allClassInfo(int page,int limit) {

        return classmessageMapper.allClassInfo(page,limit);
    }

    @Override
    public int ClassCount() {
        ClassmessageExample example=new ClassmessageExample();
        return (int)classmessageMapper.countByExample(example);
    }

    @Override
    public List<Teamessage> allBoss() {
        TeamessageExample example=new TeamessageExample();
        TeamessageExample.Criteria criteria=example.createCriteria();
        criteria.andTeabossEqualTo("是");

        return teamessageMapper.selectByExample(example);


    }

    @Override
    public boolean searchClassName(String className) {
        ClassmessageExample example=new ClassmessageExample();
        ClassmessageExample.Criteria criteria=example.createCriteria();
        criteria.andClassnameEqualTo(className);

        List<Classmessage> list=classmessageMapper.selectByExample(example);
        if (list != null && list.size() > 0) {

            return true;
        }
        return false;
    }

    @Override
    public Teamessage searchTeaByTeaName(String teaname) {
        TeamessageExample example=new TeamessageExample();
        TeamessageExample.Criteria criteria=example.createCriteria();
        criteria.andTeanameEqualTo(teaname);

        List<Teamessage> list=teamessageMapper.selectByExample(example);
        if (list != null && list.size() > 0) {

            return list.get(0);
        }

        return null;
    }

    @Override
    public Depmessage searchDepaByDepaName(String depName) {
        DepmessageExample example=new DepmessageExample();
        DepmessageExample.Criteria criteria=example.createCriteria();
        criteria.andDepnameEqualTo(depName);

        List<Depmessage> list=depmessageMapper.selectByExample(example);
        if (list != null && list.size() > 0) {

            return list.get(0);
        }

        return null;
    }

    @Override
    public Majormessage searchMajorByMajorName(String majorName) {
        MajormessageExample example=new MajormessageExample();
        MajormessageExample.Criteria criteria=example.createCriteria();
        criteria.andMajnameEqualTo(majorName);

        List<Majormessage> list=majormessageMapper.selectByExample(example);
        if (list != null && list.size() > 0) {

            return list.get(0);
        }

        return null;
    }

    @Override
    public int addNewClass(Classmessage classmessage) {
        return classmessageMapper.insert(classmessage);
    }

    @Override
    public List<classInfo> allClassInfoByBoss(int page, int limit, String teaname) {
        return classmessageMapper.allClassInfoByBoss(page,limit,teaname);
    }

    @Override
    public List<classInfo> allClassInfoByDepa(int page, int limit, String depname) {
        return classmessageMapper.allClassInfoByDepa(page,limit,depname);
    }

    @Override
    public List<classInfo> allClassInfoByMajor(int page, int limit, String majorname) {
        return classmessageMapper.allClassInfoByMajor(page,limit,majorname);
    }

    @Override
    public List<classInfo> allClassInfoByClass(int page, int limit, String classname) {
        return classmessageMapper.allClassInfoByClass(page,limit,classname);
    }

    @Override
    public int ClassCountByBoss(int teaid) {
        ClassmessageExample example=new ClassmessageExample();
        ClassmessageExample.Criteria criteria=example.createCriteria();
        criteria.andTeaidEqualTo(teaid);
        List<Classmessage> list=classmessageMapper.selectByExample(example);
        return list.size();
    }

    @Override
    public int ClassCountByDepa(int depid) {
        ClassmessageExample example=new ClassmessageExample();
        ClassmessageExample.Criteria criteria=example.createCriteria();
        criteria.andDepidEqualTo(depid);
        List<Classmessage> list=classmessageMapper.selectByExample(example);
        return list.size();
    }

    @Override
    public int ClassCountByMajor(int majid) {
        ClassmessageExample example=new ClassmessageExample();
        ClassmessageExample.Criteria criteria=example.createCriteria();
        criteria.andMajidEqualTo(majid);
        List<Classmessage> list=classmessageMapper.selectByExample(example);
        return list.size();
    }

    @Override
    public int editClassInfo(Classmessage classmessage) {
        return classmessageMapper.updateByPrimaryKey(classmessage);
    }

    @Override
    public int delClassInfo(int classid) {
        return  classmessageMapper.deleteByPrimaryKey(classid);

    }

    @Override
    public int classComBine(int classId1,int classId2) {
        //更改班级id
        int count=stumessageMapper.updateClassId(classId1,classId2);
        return count;
    }

    @Override
    public Classmessage searchClassByClassName(String classname) {
        ClassmessageExample example=new ClassmessageExample();
        ClassmessageExample.Criteria criteria=example.createCriteria();
        criteria.andClassnameEqualTo(classname);

        List<Classmessage> list=classmessageMapper.selectByExample(example);
        if (list != null && list.size() > 0) {

            return list.get(0);
        }

        return null;
    }

    @Override
    public int updateClassDepaMajor(int depId, int majorId,int classId) {
        return stumessageMapper.updateClassDepaMajor(depId,majorId,classId);
    }

    @Override
    public int updateAdminInfo(Adminmessage adminmessage) {
        return adminmessageMapper.updateByPrimaryKey(adminmessage);
    }

    @Override
    public Adminmessage loginByPhone(String phone) {
        AdminmessageExample example=new AdminmessageExample();
        AdminmessageExample.Criteria criteria=example.createCriteria();
        criteria.andAdmphoneEqualTo(phone);

        List<Adminmessage> list=adminmessageMapper.selectByExample(example);
        if (list != null && list.size() > 0) {

            return list.get(0);
        }

        return null;
    }

    @Override
    public List<Adminmessage> allAdmin(int page, int limit) {
        return adminmessageMapper.allAdmInfo(page,limit);
    }

    @Override
    public int AdminCount() {
        AdminmessageExample example=new AdminmessageExample();
        return (int)adminmessageMapper.countByExample(example)-1;
    }

    @Override
    public int updateNorAdminInfo(Adminmessage adminmessage) {
        return adminmessageMapper.updateByPrimaryKeySelective(adminmessage);
    }

    @Override
    public Adminmessage searchNorAdmByKey(int admId) {
        return adminmessageMapper.selectByPrimaryKey(admId);
    }

    @Override
    public Adminmessage checkAdmName(String admName) {
        AdminmessageExample example=new AdminmessageExample();
        AdminmessageExample.Criteria criteria=example.createCriteria();
        criteria.andAdmnameEqualTo(admName);

        List<Adminmessage> list=adminmessageMapper.selectByExample(example);
        if (list != null && list.size() > 0) {

            return list.get(0);
        }

        return null;
    }

    @Override
    public int addNewAdm(Adminmessage adminmessage) {
        return adminmessageMapper.insert(adminmessage);
    }

    @Override
    public int delAdm(int admId) {
        return adminmessageMapper.deleteByPrimaryKey(admId);
    }

    @Override
    public Adminmessage loginByFace(int admID) {
        return adminmessageMapper.selectByPrimaryKey(admID);
    }

    @Override
    public Adminmessage searchAdmIdByName(String admName) {
        AdminmessageExample example=new AdminmessageExample();
        AdminmessageExample.Criteria criteria=example.createCriteria();
        criteria.andAdmnameEqualTo(admName);

        List<Adminmessage> list=adminmessageMapper.selectByExample(example);
        if (list != null && list.size() > 0) {

            return list.get(0);
        }

        return null;
    }

    @Override
    public List<Adminmessage> allAdminToFace() {
        AdminmessageExample example=new AdminmessageExample();
        return adminmessageMapper.selectByExample(example);
    }


}
