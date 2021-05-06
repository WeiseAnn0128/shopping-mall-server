/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : shopping_mall

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 06/05/2021 17:26:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods_detail
-- ----------------------------
DROP TABLE IF EXISTS `goods_detail`;
CREATE TABLE `goods_detail`  (
  `id` int(11) NOT NULL,
  `goods_id` int(11) NULL DEFAULT NULL COMMENT '商品id',
  `goods_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名字',
  `goods_price` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品价格',
  `top_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '顶部图片（“，”分隔）',
  `detail_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品详情图（“，”分隔）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品详情' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods_detail
-- ----------------------------
INSERT INTO `goods_detail` VALUES (1, 123, '手表', '2000', 'https://img.alicdn.com/imgextra/i2/2208186624252/O1CN01GSRnN31hHSjqVfqlB_!!0-item_pic.jpg_60x60q90.jpg', 'https://img.alicdn.com/imgextra/i2/2208186624252/O1CN01GSRnN31hHSjqVfqlB_!!0-item_pic.jpg_60x60q90.jpg');
INSERT INTO `goods_detail` VALUES (2, 124, '皮鞋', '200', 'https://img.alicdn.com/imgextra/i2/2210050112/O1CN01wQ4vH51ChKv4GQOor_!!0-item_pic.jpg_60x60q90.jpg', 'https://img.alicdn.com/imgextra/i3/2210050112/O1CN01ewfume1ChL25tyXWk_!!2210050112.jpg_60x60q90.jpg');

SET FOREIGN_KEY_CHECKS = 1;
