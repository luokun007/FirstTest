/*
Navicat MySQL Data Transfer

Source Server         : demo1
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : trainingdb

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-08-09 19:49:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleid` int(50) NOT NULL,
  `rolename` varchar(255) NOT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '采购人员');
INSERT INTO `role` VALUES ('2', '生产人员');
INSERT INTO `role` VALUES ('3', '管理人员');
INSERT INTO `role` VALUES ('4', '售后人员');
INSERT INTO `role` VALUES ('5', '销售人员');
INSERT INTO `role` VALUES ('6', '领导人员');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(50) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '1023');
INSERT INTO `user` VALUES ('2', '李四', '324');
INSERT INTO `user` VALUES ('3', '小白', '1101');
INSERT INTO `user` VALUES ('4', '小黑', '52099');
INSERT INTO `user` VALUES ('6', '小蓝', '2023');
INSERT INTO `user` VALUES ('7', '小紫', '5203');
INSERT INTO `user` VALUES ('8', '小刚', '9632');
INSERT INTO `user` VALUES ('9', '小新', '9856');
INSERT INTO `user` VALUES ('10', '小红', '1234');
INSERT INTO `user` VALUES ('11', '小小', '4569');
INSERT INTO `user` VALUES ('12', '小天', '9632');
INSERT INTO `user` VALUES ('13', '小弟', '7894');
INSERT INTO `user` VALUES ('14', '小班', '4563');
INSERT INTO `user` VALUES ('15', '小笑', '1569');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(50) NOT NULL,
  `userid` int(50) NOT NULL,
  `roleid` int(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '1');
INSERT INTO `user_role` VALUES ('2', '3', '2');
INSERT INTO `user_role` VALUES ('3', '2', '3');
INSERT INTO `user_role` VALUES ('4', '4', '4');
INSERT INTO `user_role` VALUES ('6', '6', '1');
INSERT INTO `user_role` VALUES ('7', '5', '3');
INSERT INTO `user_role` VALUES ('8', '1', '5');
