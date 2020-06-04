/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : alipay

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2020-06-04 16:44:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for flow
-- ----------------------------
DROP TABLE IF EXISTS `flow`;
CREATE TABLE `flow` (
  `id` varchar(20) NOT NULL,
  `flow_num` varchar(20) DEFAULT NULL COMMENT '流水号',
  `order_num` varchar(20) DEFAULT NULL COMMENT '订单号',
  `product_id` varchar(20) DEFAULT NULL COMMENT '产品主键ID',
  `paid_amount` varchar(11) DEFAULT NULL COMMENT '支付金额',
  `paid_method` int(11) DEFAULT NULL COMMENT '支付方式\r\n 1：支付宝\r\n 2：微信',
  `buy_counts` int(11) DEFAULT NULL COMMENT '购买个数',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='流水表';

-- ----------------------------
-- Records of flow
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` varchar(20) NOT NULL,
  `order_num` varchar(20) DEFAULT NULL COMMENT '订单号',
  `order_status` varchar(20) DEFAULT NULL COMMENT '订单状态\r\n 10：待付款\r\n 20：已付款',
  `order_amount` varchar(11) DEFAULT NULL COMMENT '订单金额',
  `paid_amount` varchar(11) DEFAULT NULL COMMENT '实际支付金额',
  `product_id` varchar(20) DEFAULT NULL COMMENT '产品表外键ID',
  `buy_counts` int(11) DEFAULT NULL COMMENT '产品购买的个数',
  `create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
  `paid_time` datetime DEFAULT NULL COMMENT '支付时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单表';

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1812207R22F6DM14', '1812207R22F6DM14', '10', '2.0', null, '1', '2', '2018-12-20 10:51:46', null);
INSERT INTO `orders` VALUES ('1812207S7CN814M8', '1812207S7CN814M8', '10', '2.0', null, '1', '2', '2018-12-20 10:55:21', null);
INSERT INTO `orders` VALUES ('1812207S87PPY79P', '1812207S87PPY79P', '10', '2.0', null, '1', '2', '2018-12-20 10:55:26', null);
INSERT INTO `orders` VALUES ('1812208CY53HRRYW', '1812208CY53HRRYW', '10', '34.0', null, '1', '34', '2018-12-20 11:51:24', null);
INSERT INTO `orders` VALUES ('1812208HW44KTDYW', '1812208HW44KTDYW', '10', '34.0', null, '1', '34', '2018-12-20 12:03:11', null);
INSERT INTO `orders` VALUES ('1812208KD75YTKGC', '1812208KD75YTKGC', '10', '34.0', null, '1', '34', '2018-12-20 12:05:01', null);
INSERT INTO `orders` VALUES ('181220ASYCGYY428', '181220ASYCGYY428', '10', '2.0', null, '1', '2', '2018-12-20 15:09:35', null);
INSERT INTO `orders` VALUES ('181220ASZY889K1P', '181220ASZY889K1P', '10', '2.0', null, '1', '2', '2018-12-20 15:09:45', null);
INSERT INTO `orders` VALUES ('181220GM4PMR5CDP', '181220GM4PMR5CDP', '10', '20.0', null, '1', '20', '2018-12-20 21:55:36', null);
INSERT INTO `orders` VALUES ('1812219SF42HKSY8', '1812219SF42HKSY8', '10', '2.0', null, '1', '2', '2018-12-21 13:44:12', null);
INSERT INTO `orders` VALUES ('1812219SFG49P18H', '1812219SFG49P18H', '10', '2.0', null, '1', '2', '2018-12-21 13:44:15', null);
INSERT INTO `orders` VALUES ('181221DCZZMB5PZC', '181221DCZZMB5PZC', '10', '2.0', null, '1', '2', '2018-12-21 18:51:56', null);
INSERT INTO `orders` VALUES ('181221DGKAR7CD1P', '181221DGKAR7CD1P', '10', '2000.0', null, '1', '2000', '2018-12-21 18:59:49', null);
INSERT INTO `orders` VALUES ('181221FGG6X50PH0', '181221FGG6X50PH0', '10', '253.0', null, '1', '253', '2018-12-21 20:23:39', null);
INSERT INTO `orders` VALUES ('2006048DFCMBSPBC', '2006048DFCMBSPBC', '10', '1.0', null, '1', '1', '2020-06-04 11:53:09', null);
INSERT INTO `orders` VALUES ('2006048DHZT66140', '2006048DHZT66140', '10', '1.0', null, '1', '1', '2020-06-04 11:53:25', null);
INSERT INTO `orders` VALUES ('2006048FSF1P77R4', '2006048FSF1P77R4', '10', '253.0', null, '1', '253', '2020-06-04 11:57:00', null);
INSERT INTO `orders` VALUES ('2006048G68PSAAK4', '2006048G68PSAAK4', '10', '253.0', null, '1', '253', '2020-06-04 11:58:16', null);
INSERT INTO `orders` VALUES ('2006048KG36DBWPH', '2006048KG36DBWPH', '10', '70.0', null, '2', '20', '2020-06-04 12:05:13', null);
INSERT INTO `orders` VALUES ('2006048KGPX5S04H', '2006048KGPX5S04H', '10', '70.0', null, '2', '20', '2020-06-04 12:05:17', null);
INSERT INTO `orders` VALUES ('2006048MG7SXD6K4', '2006048MG7SXD6K4', '10', '70.0', null, '2', '20', '2020-06-04 12:08:15', null);
INSERT INTO `orders` VALUES ('200604B39B1DYYK4', '200604B39B1DYYK4', '10', '122.5', null, '2', '35', '2020-06-04 15:34:47', null);
INSERT INTO `orders` VALUES ('200604B56GDR50PH', '200604B56GDR50PH', '10', '35.0', null, '1', '35', '2020-06-04 15:40:29', null);
INSERT INTO `orders` VALUES ('200604B5XW8C0ZC0', '200604B5XW8C0ZC0', '10', '20.0', null, '1', '20', '2020-06-04 15:42:33', null);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL COMMENT '产品名称',
  `price` varchar(11) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='产品表 ';

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '辣条', '1.0');
INSERT INTO `product` VALUES ('2', '牛奶', '3.5');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(20) NOT NULL,
  `username` varchar(128) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
