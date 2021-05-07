/*
 Navicat Premium Data Transfer

 Source Server         : yang
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : shopping_mall

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 07/05/2021 15:30:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for myintegral
-- ----------------------------
DROP TABLE IF EXISTS `myintegral`;
CREATE TABLE `myintegral`  (
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名称',
  `change_integral` int(20) DEFAULT NULL COMMENT '改变积分',
  `change_time` datetime(6) DEFAULT NULL COMMENT '消费或增加积分的时间',
  `consumption_type` int(10) DEFAULT NULL COMMENT '获取积分的方式（0：签到；1：消费；2：购买会员）',
  `change_type` int(10) DEFAULT NULL COMMENT '积分是增加还是减少（0:增加；1：减少）'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
