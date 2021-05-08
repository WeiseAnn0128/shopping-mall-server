/*
 Navicat Premium Data Transfer

 Source Server         : Link
 Source Server Type    : MySQL
 Source Server Version : 50712
 Source Host           : localhost:3306
 Source Schema         : shopping_mall

 Target Server Type    : MySQL
 Target Server Version : 50712
 File Encoding         : 65001

 Date: 08/05/2021 09:28:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for myintegral
-- ----------------------------
DROP TABLE IF EXISTS `myintegral`;
CREATE TABLE `myintegral`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(8) NULL DEFAULT NULL COMMENT '用户名称',
  `change_integral` int(20) NULL DEFAULT NULL COMMENT '改变积分',
  `change_time` datetime(6) NULL DEFAULT NULL COMMENT '消费或增加积分的时间',
  `consumption_type` int(10) NULL DEFAULT NULL COMMENT '获取积分的方式（0：签到；1：消费；2：购买会员）',
  `change_type` int(10) NULL DEFAULT NULL COMMENT '积分是增加还是减少（0:增加；1：减少）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
