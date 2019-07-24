/*
 Navicat Premium Data Transfer

 Source Server         : mysql5.7
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : EduMS

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 26/06/2019 22:06:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for adminMessage
-- ----------------------------
DROP TABLE IF EXISTS `adminMessage`;
CREATE TABLE `adminMessage` (
  `admID` int(10) NOT NULL AUTO_INCREMENT,
  `admName` varchar(255) DEFAULT NULL,
  `admPass` varchar(255) DEFAULT NULL,
  `admPhone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of adminMessage
-- ----------------------------
BEGIN;
INSERT INTO `adminMessage` VALUES (1, 'admin', '123', '18871012502');
COMMIT;

-- ----------------------------
-- Table structure for classMessage
-- ----------------------------
DROP TABLE IF EXISTS `classMessage`;
CREATE TABLE `classMessage` (
  `classID` int(11) NOT NULL AUTO_INCREMENT,
  `className` varchar(255) DEFAULT NULL,
  `teaID` int(11) DEFAULT NULL,
  `depID` int(11) DEFAULT NULL,
  `majID` int(11) DEFAULT NULL,
  PRIMARY KEY (`classID`),
  KEY `className` (`className`),
  KEY `FK_cla_1` (`teaID`),
  KEY `FK_cla_2` (`depID`),
  KEY `FK_cla_3` (`majID`),
  CONSTRAINT `FK_cla_1` FOREIGN KEY (`teaID`) REFERENCES `teaMessage` (`teaID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_cla_2` FOREIGN KEY (`depID`) REFERENCES `depMessage` (`depID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_cla_3` FOREIGN KEY (`majID`) REFERENCES `majorMessage` (`majID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classMessage
-- ----------------------------
BEGIN;
INSERT INTO `classMessage` VALUES (1, '软工1611', 1, 1, 1);
INSERT INTO `classMessage` VALUES (2, '计科1611', 1, 1, 2);
INSERT INTO `classMessage` VALUES (3, '商务1611', 1, 2, 3);
INSERT INTO `classMessage` VALUES (4, '师范1611', 1, 2, 4);
INSERT INTO `classMessage` VALUES (5, '软工1612', 1, 1, 1);
INSERT INTO `classMessage` VALUES (6, '软工1613', 1, 1, 1);
INSERT INTO `classMessage` VALUES (7, '软工1614', 1, 1, 1);
INSERT INTO `classMessage` VALUES (8, '软工1615', 1, 1, 1);
INSERT INTO `classMessage` VALUES (9, '软工1616', 1, 1, 1);
INSERT INTO `classMessage` VALUES (10, '软工1617', 1, 1, 1);
INSERT INTO `classMessage` VALUES (11, '软工1618', 1, 1, 1);
INSERT INTO `classMessage` VALUES (13, '软工1619', 1, 1, 1);
INSERT INTO `classMessage` VALUES (14, '计科1612', 1, 1, 2);
INSERT INTO `classMessage` VALUES (15, '计科1613', 1, 1, 2);
INSERT INTO `classMessage` VALUES (16, '计科1614', 1, 1, 2);
INSERT INTO `classMessage` VALUES (17, '师范1612', 1, 2, 4);
INSERT INTO `classMessage` VALUES (18, '师范1711', 1, 2, 4);
INSERT INTO `classMessage` VALUES (19, '师范1712', 1, 2, 4);
INSERT INTO `classMessage` VALUES (20, '商务1812', 2, 2, 3);
INSERT INTO `classMessage` VALUES (21, '商务1811', 1, 2, 3);
INSERT INTO `classMessage` VALUES (22, '商务1812', 1, 2, 3);
INSERT INTO `classMessage` VALUES (24, '软工1711', 2, 1, 1);
COMMIT;

-- ----------------------------
-- Table structure for courseMessage
-- ----------------------------
DROP TABLE IF EXISTS `courseMessage`;
CREATE TABLE `courseMessage` (
  `couID` int(11) NOT NULL AUTO_INCREMENT,
  `couName` varchar(255) DEFAULT NULL,
  `period` int(10) DEFAULT NULL,
  `credit` int(10) DEFAULT NULL,
  `startTime` varchar(255) DEFAULT NULL,
  `classID` int(10) DEFAULT NULL,
  `teaID` int(10) DEFAULT NULL,
  PRIMARY KEY (`couID`),
  KEY `FK_cou_1` (`classID`),
  KEY `FK_cou_2` (`teaID`),
  CONSTRAINT `FK_cou_1` FOREIGN KEY (`classID`) REFERENCES `classMessage` (`classID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_cou_2` FOREIGN KEY (`teaID`) REFERENCES `teaMessage` (`teaID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for depMessage
-- ----------------------------
DROP TABLE IF EXISTS `depMessage`;
CREATE TABLE `depMessage` (
  `depID` int(11) NOT NULL AUTO_INCREMENT,
  `depName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`depID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of depMessage
-- ----------------------------
BEGIN;
INSERT INTO `depMessage` VALUES (1, '计算机工程学院');
INSERT INTO `depMessage` VALUES (2, '数统学院');
COMMIT;

-- ----------------------------
-- Table structure for majorMessage
-- ----------------------------
DROP TABLE IF EXISTS `majorMessage`;
CREATE TABLE `majorMessage` (
  `majID` int(11) NOT NULL AUTO_INCREMENT,
  `depID` int(11) DEFAULT NULL,
  `majName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`majID`),
  KEY `majID` (`majID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of majorMessage
-- ----------------------------
BEGIN;
INSERT INTO `majorMessage` VALUES (1, 1, '软件工程');
INSERT INTO `majorMessage` VALUES (2, 1, '计算机科学');
INSERT INTO `majorMessage` VALUES (3, 2, '商务智能');
INSERT INTO `majorMessage` VALUES (4, 2, '数学师范');
COMMIT;

-- ----------------------------
-- Table structure for paperManagement
-- ----------------------------
DROP TABLE IF EXISTS `paperManagement`;
CREATE TABLE `paperManagement` (
  `papID` int(10) NOT NULL AUTO_INCREMENT,
  `taeID` int(10) DEFAULT NULL,
  `uploadTime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`papID`),
  KEY `FK_pa_1` (`taeID`),
  CONSTRAINT `FK_pa_1` FOREIGN KEY (`taeID`) REFERENCES `teaMessage` (`teaID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for scoreMessage
-- ----------------------------
DROP TABLE IF EXISTS `scoreMessage`;
CREATE TABLE `scoreMessage` (
  `scoID` int(10) NOT NULL AUTO_INCREMENT,
  `stuID` int(10) DEFAULT NULL,
  `couID` int(10) DEFAULT NULL,
  `usualscore` int(10) DEFAULT NULL,
  `endscore` int(10) DEFAULT NULL,
  `zonghescore` int(10) DEFAULT NULL,
  `scoremark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`scoID`),
  KEY `FK_sco_1` (`stuID`),
  KEY `FK_sco_2` (`couID`),
  CONSTRAINT `FK_sco_1` FOREIGN KEY (`stuID`) REFERENCES `stuMessage` (`stuID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_sco_2` FOREIGN KEY (`couID`) REFERENCES `courseMessage` (`couID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for stuCourse
-- ----------------------------
DROP TABLE IF EXISTS `stuCourse`;
CREATE TABLE `stuCourse` (
  `cousID` int(10) NOT NULL AUTO_INCREMENT,
  `couID` int(10) DEFAULT NULL,
  `stuID` int(10) DEFAULT NULL,
  PRIMARY KEY (`cousID`),
  KEY `FK_stuCou_2` (`stuID`),
  KEY `FK_stuCou_1` (`couID`),
  CONSTRAINT `FK_stuCou_1` FOREIGN KEY (`couID`) REFERENCES `courseMessage` (`couID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_stuCou_2` FOREIGN KEY (`stuID`) REFERENCES `stuMessage` (`stuID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for stuMessage
-- ----------------------------
DROP TABLE IF EXISTS `stuMessage`;
CREATE TABLE `stuMessage` (
  `stuID` int(10) NOT NULL AUTO_INCREMENT,
  `stuPass` varchar(255) DEFAULT NULL,
  `stuName` varchar(255) DEFAULT NULL,
  `stuSex` varchar(255) DEFAULT NULL,
  `stuBirthday` varchar(255) DEFAULT NULL,
  `stuDepartment` int(10) DEFAULT NULL,
  `stuMajor` int(10) DEFAULT NULL,
  `stuClass` int(10) DEFAULT NULL,
  `stuPhone` varchar(255) DEFAULT NULL,
  `stuAddress` varchar(255) DEFAULT NULL,
  `stuStatus` varchar(255) DEFAULT NULL,
  `stuRemark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stuID`),
  KEY `FK_stu_3` (`stuClass`),
  KEY `FK_stu_1` (`stuDepartment`),
  KEY `FK_stu_2` (`stuMajor`),
  CONSTRAINT `FK_stu_1` FOREIGN KEY (`stuDepartment`) REFERENCES `depMessage` (`depID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_stu_2` FOREIGN KEY (`stuMajor`) REFERENCES `majorMessage` (`majID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_stu_3` FOREIGN KEY (`stuClass`) REFERENCES `classMessage` (`classID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stuMessage
-- ----------------------------
BEGIN;
INSERT INTO `stuMessage` VALUES (1, '123', '张希光', '男', '1997-10-1', 1, 1, 1, '18871012502', '天津市静海区', '0', NULL);
COMMIT;

-- ----------------------------
-- Table structure for teaCourse
-- ----------------------------
DROP TABLE IF EXISTS `teaCourse`;
CREATE TABLE `teaCourse` (
  `cousID` int(10) NOT NULL AUTO_INCREMENT,
  `couID` int(10) DEFAULT NULL,
  `teaID` int(10) DEFAULT NULL,
  PRIMARY KEY (`cousID`),
  KEY `FK_teaCou_2` (`teaID`),
  KEY `FK_teaCou_1` (`couID`),
  CONSTRAINT `FK_teaCou_1` FOREIGN KEY (`couID`) REFERENCES `courseMessage` (`couID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_teaCou_2` FOREIGN KEY (`teaID`) REFERENCES `teaMessage` (`teaID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for teaMessage
-- ----------------------------
DROP TABLE IF EXISTS `teaMessage`;
CREATE TABLE `teaMessage` (
  `teaID` int(10) NOT NULL AUTO_INCREMENT,
  `teaDepartment` int(10) DEFAULT NULL,
  `teaPass` varchar(255) DEFAULT NULL,
  `teaName` varchar(255) DEFAULT NULL,
  `teaSex` varchar(255) DEFAULT NULL,
  `teaNumber` varchar(255) DEFAULT NULL,
  `teaPhone` varchar(255) DEFAULT NULL,
  `teaAddress` varchar(255) DEFAULT NULL,
  `teaLevel` varchar(255) DEFAULT NULL,
  `teaDegree` varchar(255) DEFAULT NULL,
  `teaBoss` varchar(255) DEFAULT NULL,
  `teaRemark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`teaID`),
  KEY `FK_tea_1` (`teaDepartment`),
  CONSTRAINT `FK_tea_1` FOREIGN KEY (`teaDepartment`) REFERENCES `depMessage` (`depID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teaMessage
-- ----------------------------
BEGIN;
INSERT INTO `teaMessage` VALUES (1, 1, '123', '张希光', '男', '120223199710013333', '18871012502', '天津精华', '高级教师', '硕士', '是', '无');
INSERT INTO `teaMessage` VALUES (2, 1, '123', '哈哈', '男', '120222222222222222', '18871012502', '天津', '高级教师', '研究生', '是', '无');
COMMIT;

-- ----------------------------
-- Table structure for teachResource
-- ----------------------------
DROP TABLE IF EXISTS `teachResource`;
CREATE TABLE `teachResource` (
  `resID` int(10) NOT NULL AUTO_INCREMENT,
  `couID` int(10) DEFAULT NULL,
  `upTime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resID`),
  KEY `FK_teacous_1` (`couID`),
  CONSTRAINT `FK_teacous_1` FOREIGN KEY (`couID`) REFERENCES `courseMessage` (`couID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
