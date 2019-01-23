/*
Navicat MySQL Data Transfer

Source Server         : nishuai
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : contact

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2019-01-23 22:42:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for contact_person
-- ----------------------------
DROP TABLE IF EXISTS `contact_person`;
CREATE TABLE `contact_person` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(64) DEFAULT NULL COMMENT '联系人名称',
  `phone` int(11) DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contact_person
-- ----------------------------
INSERT INTO `contact_person` VALUES ('1', '张三', null);
INSERT INTO `contact_person` VALUES ('2', '李四', null);
INSERT INTO `contact_person` VALUES ('3', '王五', null);
INSERT INTO `contact_person` VALUES ('4', '张帅', null);
