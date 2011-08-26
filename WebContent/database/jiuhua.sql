DROP database IF EXISTS jiuhua;
CREATE DATABASE jiuhua
USE jiuhua;


-- ----------------------------
-- Table structure for `tb_user` 用户表
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `realname` varchar(30) DEFAULT NULL,
  `idcard` varchar(18) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `mobinum` varchar(21) DEFAULT NULL,
  `isverify` char(1) DEFAULT NULL COMMENT '手机验证状态: 0未验证/1已验证',
  `safecode` varchar(255) DEFAULT NULL COMMENT '安全码',
  `identify` char(1) DEFAULT NULL COMMENT '身份标识: 0管理员/1宾馆/2商户/3旅行社/4导游/5VIP用户/6普通用户',
  `status` char(1) DEFAULT NULL COMMENT '帐号状态: 0未验证邮箱/1已验证/3已禁止',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------