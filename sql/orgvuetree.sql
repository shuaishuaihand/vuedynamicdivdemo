/*
Navicat MySQL Data Transfer

Source Server         : nishuai
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : orgvuetree

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-11-14 15:30:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `LEVEL_` int(11) DEFAULT NULL,
  `NAME` varchar(64) DEFAULT NULL,
  `PARENTID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=612 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of organization
-- ----------------------------
INSERT INTO `organization` VALUES ('1', '0', '帅帅集团有限公司', '-1');
INSERT INTO `organization` VALUES ('602', '2', '销售部', '1');
INSERT INTO `organization` VALUES ('603', '2', '产品部', '1');
INSERT INTO `organization` VALUES ('611', '2', '研发部', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(64) DEFAULT NULL,
  `ORG_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2235 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '系统管理员', '1');
INSERT INTO `user` VALUES ('1851', '张三', '603');
INSERT INTO `user` VALUES ('1852', '李四', '603');
INSERT INTO `user` VALUES ('1854', '李小萌', '611');
