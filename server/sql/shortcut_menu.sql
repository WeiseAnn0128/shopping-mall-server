/*
 Navicat Premium Data Transfer

 Source Server         : wyc
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : 127.0.0.1:3306
 Source Schema         : shopping_mall

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 07/05/2021 14:52:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for shortcut_menu
-- ----------------------------
DROP TABLE IF EXISTS `shortcut_menu`;
CREATE TABLE `shortcut_menu`  (
  `shortcut_menu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '快捷菜单ID',
  `cate_id` int(11) NOT NULL COMMENT '二级类的cate_id',
  PRIMARY KEY (`shortcut_menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shortcut_menu
-- ----------------------------
INSERT INTO `shortcut_menu` VALUES (1, 5);
INSERT INTO `shortcut_menu` VALUES (2, 2);
INSERT INTO `shortcut_menu` VALUES (3, 3);
INSERT INTO `shortcut_menu` VALUES (4, 4);
INSERT INTO `shortcut_menu` VALUES (5, 5);
INSERT INTO `shortcut_menu` VALUES (6, 6);
INSERT INTO `shortcut_menu` VALUES (7, 7);
INSERT INTO `shortcut_menu` VALUES (13, 5);
INSERT INTO `shortcut_menu` VALUES (14, 5);
INSERT INTO `shortcut_menu` VALUES (17, 5);
INSERT INTO `shortcut_menu` VALUES (18, 5);
INSERT INTO `shortcut_menu` VALUES (19, 3);
INSERT INTO `shortcut_menu` VALUES (20, 11);
INSERT INTO `shortcut_menu` VALUES (22, 4);

SET FOREIGN_KEY_CHECKS = 1;
