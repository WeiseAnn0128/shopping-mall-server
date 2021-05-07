/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : shopping_mall

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 30/04/2021 17:37:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for delivery_address
-- ----------------------------
DROP TABLE IF EXISTS `delivery_address`;
CREATE TABLE `delivery_address`  (
  `address_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '地址ID',
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人姓名',
  `user_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号码',
  `province` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省份',
  `city` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '城市',
  `district` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '区',
  `user_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '详细地址',
  `isDefault` tinyint(4) NOT NULL DEFAULT 0 COMMENT '是否是默认地址 1是 0否 默认否',
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建的时间',
  PRIMARY KEY (`address_id`, `user_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of delivery_address
-- ----------------------------
INSERT INTO `delivery_address` VALUES (1, '张安', '123456', '河南省', '新乡市', '牧野区', '河南师范大学东校区', 1, '2021-04-30 16:09:55');
INSERT INTO `delivery_address` VALUES (2, '啊', 'a', 'a', 'a', '3', 'a', 1, '2021-04-30 16:21:04');
INSERT INTO `delivery_address` VALUES (3, 'a', 'a', 'a', 'a', 'a', '1', 0, '2021-04-30 16:20:51');

SET FOREIGN_KEY_CHECKS = 1;
