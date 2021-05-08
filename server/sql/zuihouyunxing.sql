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

 Date: 29/04/2021 10:53:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for firstclass
-- ----------------------------
DROP TABLE IF EXISTS `firstclass`;
CREATE TABLE `firstclass`  (
  `cate_id` int(11) NOT NULL COMMENT '一级分类编号',
  `cate_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '一级分类商品名',
  PRIMARY KEY (`cate_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of firstclass
-- ----------------------------
INSERT INTO `firstclass` VALUES (1, '洗护');
INSERT INTO `firstclass` VALUES (2, '生鲜');
INSERT INTO `firstclass` VALUES (3, '食品');
INSERT INTO `firstclass` VALUES (4, '百货');
INSERT INTO `firstclass` VALUES (5, '手机');
INSERT INTO `firstclass` VALUES (6, '电脑');
INSERT INTO `firstclass` VALUES (7, '配件');

SET FOREIGN_KEY_CHECKS = 1;


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

 Date: 29/04/2021 10:54:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for secondclass
-- ----------------------------
DROP TABLE IF EXISTS `secondclass`;
CREATE TABLE `secondclass`  (
  `id` int(11) NOT NULL COMMENT '二级分类编号',
  `cate_id` int(11) NULL DEFAULT NULL COMMENT '一级分类编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二级分类商品名',
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二级分类商品图片',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of secondclass
-- ----------------------------
INSERT INTO `secondclass` VALUES (1, 1, '洗面奶', 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10001.jpg');
INSERT INTO `secondclass` VALUES (2, 1, '护手霜', 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10002.jpg');
INSERT INTO `secondclass` VALUES (3, 2, '龙虾', 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10003.jpg');
INSERT INTO `secondclass` VALUES (4, 2, '鲍鱼', 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10004.jpg');
INSERT INTO `secondclass` VALUES (5, 3, '薯片', 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10005.jpg');
INSERT INTO `secondclass` VALUES (6, 3, '锅巴', 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10006.jpg');
INSERT INTO `secondclass` VALUES (7, 4, '指甲剪', 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10007.jpg');
INSERT INTO `secondclass` VALUES (8, 5, '华为', 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10008.jpg');
INSERT INTO `secondclass` VALUES (9, 6, '惠普', 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10009.jpg');
INSERT INTO `secondclass` VALUES (10, 1, '气泡水', 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10009.jpg');

SET FOREIGN_KEY_CHECKS = 1;


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

 Date: 29/04/2021 00:07:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_help_information
-- ----------------------------
DROP TABLE IF EXISTS `sys_help_information`;
CREATE TABLE `sys_help_information`  (
  `help_information_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '帮助文档ID',
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '问题创建时间',
  `question` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '问题',
  `answer` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '答案',
  PRIMARY KEY (`help_information_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_help_information
-- ----------------------------
INSERT INTO `sys_help_information` VALUES (1, '2021-04-28 23:28:09', '浏览网页时怎样调整字号的大小？', '您可以打开网页，在“查看”菜单中选择“文字大小”，调整字体的大小。\r\n\r\n');
INSERT INTO `sys_help_information` VALUES (2, '2021-04-28 23:28:31', '如何打印网页正文？', '您只需要在“文件”菜单上，单击“打印”，选定你需要的打印选项。');
INSERT INTO `sys_help_information` VALUES (3, '2021-04-28 23:27:46', '如何检索本站的信息？', '您只需要在网页上“搜索”框内，输入您要查找的关键词，按回车键或者点击搜索框右侧的“搜索”按钮，即可实现站内检索。\r\n\r\n');
INSERT INTO `sys_help_information` VALUES (4, '2021-04-28 23:28:38', '如何用电子邮件发送当前网页？', '您只需要在“文件”菜单上，单击“发送”，根据需求选择单击“电子邮件页面”或“电子邮件链接”，在邮件窗口中填写有关内容，发送邮件即可。');
INSERT INTO `sys_help_information` VALUES (5, '2021-04-28 23:28:54', '网页为什么打不开？', '如果您通过局域网上网时，由于局域网通往外部的出口带宽限制，连接网站时发生超时错误都会发生连接不上的问题。如果遇到网页打不开的问题，有时只须刷新即可，有时需要您换个时间再登陆。');
INSERT INTO `sys_help_information` VALUES (6, '2021-04-28 23:30:33', ' 浏览网页时遇到乱码怎么办？', '在浏览网页时如出现乱码，可用如下办法解决：使用IE6.X、IE7.X浏览网页时，可在“查看”菜单上单击“编码”，然后选择“简体中文GB2312”来解决。');
INSERT INTO `sys_help_information` VALUES (7, '2021-04-28 23:31:06', '如何与我们联系？', '本网首页设有“联系我们”栏目，可根据您的问题，查找电话，直接和中国交通建设股份有限公司网站维护部门联系。');
INSERT INTO `sys_help_information` VALUES (8, '2021-04-28 23:31:27', '中国交通建设股份有限公司常识：\r\n\r\n', '标识图形取材于中国甲骨文中的“行”字，以公司英文译名CHINA COMMUNICATIONS CONSTRUCTION COMPANY中四个首写字母“C”组合，结合现代交通理念，融入现代审美观念，艺术加工形成以“行”字为主体的标识架构。表现了公司的专业特征，宣示了公司的企业使命。\r\n\r\n　　标识图形以圆为衬托，托起“行”字主体架构，象征公司立志成为国际化大企业，走向世界“行天下、天下行”的雄心壮志。中间的方块，象征公司在发展中坚持科学的经营理念，倡导优秀的企业精神。圆形与方块结合，“外圆内方”，表达了广交朋友、和谐共处、创造价值、合作共赢的胸怀。');
INSERT INTO `sys_help_information` VALUES (9, '2021-04-28 23:32:07', '我可以申请实习吗？', '联合国给提供给在校研究生在其 纽约总部实习的机会。');
INSERT INTO `sys_help_information` VALUES (10, '2021-04-28 23:32:24', '我能否获得联合国的财政资助？', '联合国不提供给个人或私营组织财政资助。');
INSERT INTO `sys_help_information` VALUES (11, '2021-04-28 23:32:35', '我该如何帮助联合国的工作？', '本组织接受符合其宗旨和活动的自愿捐款。');
INSERT INTO `sys_help_information` VALUES (12, '2021-04-29 00:05:51', '1', '问问');

SET FOREIGN_KEY_CHECKS = 1;


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

 Date: 08/05/2021 08:54:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `dept_id` bigint(20) NULL DEFAULT NULL COMMENT '部门ID',
  `user_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户账号',
  `nick_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户昵称',
  `user_type` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '00' COMMENT '用户类型（00系统用户）',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '用户邮箱',
  `phonenumber` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '手机号码',
  `sex` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '用户性别（0男 1女 2未知）',
  `avatar` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '头像地址',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '密码',
  `status` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '帐号状态（0正常 1停用）',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `login_ip` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后登录IP',
  `login_date` datetime(0) NULL DEFAULT NULL COMMENT '最后登录时间',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `country` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '国家',
  `province` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省份',
  `city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '市区\r\n市区',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 103, 'admin', '若依', '00', 'ry@163.com', '15888888888', '1', '', '$2a$10$7JB720yubVSZvUI0rEqK/.VqGOZTH.ulu33dHOiBE8ByOhJIrdAu2', '0', '0', '127.0.0.1', '2021-04-21 16:24:46', 'admin', '2021-04-21 16:24:46', '', NULL, '管理员', NULL, NULL, NULL);
INSERT INTO `sys_user` VALUES (2, 105, 'ry', '若依', '00', 'ry@qq.com', '15666666666', '1', '', '$2a$10$7JB720yubVSZvUI0rEqK/.VqGOZTH.ulu33dHOiBE8ByOhJIrdAu2', '0', '0', '127.0.0.1', '2021-04-21 16:24:46', 'admin', '2021-04-21 16:24:46', '', NULL, '测试员', NULL, NULL, NULL);


SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO `sys_role` VALUES (5, '小程序', 'wechat', 0, '1', 1, 1, '0', '0', 'admin', '2021-04-25 11:27:39', '', NULL, NULL);

INSERT INTO `sys_menu` VALUES (2006, '商城项目', 0, 5, 'shopping', NULL, 1, 0, 'M', '0', '0', NULL, 'shopping', 'admin', '2021-04-28 23:43:23', '', NULL, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改', '2006', '1', 'shortcut', 'system/shortcut/index', 1, 0, 'C', '0', '0', 'system:shortcut:list', '#', 'admin', sysdate(), '', null, '二级类的快捷菜单关联增删查改菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:shortcut:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:shortcut:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:shortcut:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:shortcut:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级类的快捷菜单关联增删查改导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:shortcut:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一级分类', '3', '1', 'firstclass', 'system/firstclass/index', 1, 0, 'C', '0', '0', 'system:firstclass:list', '#', 'admin', sysdate(), '', null, '一级分类菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一级分类查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:firstclass:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一级分类新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:firstclass:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一级分类修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:firstclass:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一级分类删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:firstclass:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一级分类导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:firstclass:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级分类', '3', '1', 'secondclass', 'system/secondclass/index', 1, 0, 'C', '0', '0', 'system:secondclass:list', '#', 'admin', sysdate(), '', null, '二级分类菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级分类查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:secondclass:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级分类新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:secondclass:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级分类修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:secondclass:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级分类删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:secondclass:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('二级分类导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:secondclass:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('常见问题的解答', '2006', '1', 'information', 'system/information/index', 1, 0, 'C', '0', '0', 'system:information:list', '#', 'admin', sysdate(), '', null, '常见问题的解答菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('常见问题的解答查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:information:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('常见问题的解答新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:information:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('常见问题的解答修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:information:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('常见问题的解答删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:information:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('常见问题的解答导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:information:export',       '#', 'admin', sysdate(), '', null, '');


-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品详情', '2006', '1', 'detail', 'system/detail/index', 1, 0, 'C', '0', '0', 'system:detail:list', '#', 'admin', sysdate(), '', null, '商品详情菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品详情查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:detail:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品详情新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:detail:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品详情修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:detail:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品详情删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:detail:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品详情导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:detail:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表', '2006', '1', 'myintegral', 'system/myintegral/index', 1, 0, 'C', '0', '0', 'system:myintegral:list', '#', 'admin', sysdate(), '', null, '积分表菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:myintegral:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:myintegral:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:myintegral:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:myintegral:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('积分表导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:myintegral:export',       '#', 'admin', sysdate(), '', null, '');



