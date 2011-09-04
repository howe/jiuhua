DROP database IF EXISTS jiuhua;
CREATE DATABASE jiuhua
USE jiuhua;

-- ----------------------------
-- Table structure for `tb_user` 用户表
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
create table tb_user
(
   id                   int(11) not null AUTO_INCREMENT comment '用户表主键',
   username             varchar(30) comment '用户姓名',
   realname             varchar(30) comment '用户真实姓名',
   idcard               varchar(18) comment '用户身份证号',
   password             varchar(255) comment '用户密码',
   mobinum              varchar(21) comment '用户手机号码',
   isverify             char(1) comment '用户手机号码真实性验证状态, 0否/1是',
   sex                  char(1) comment '性别, 0女/1男',
   email                varchar(100) comment '用户电子邮件',
   safecode             varchar(255) comment '密码找回使用的密保问题。',
   identify             char(1) comment '用户账户权限标识，0普通用户/1VIP用户/2管理员',
   status               char(1) comment '用户账户生命状态，0禁止使用/1正常使用',
   primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_datadictionarytype` 数据字典类型表
-- ----------------------------
DROP TABLE IF EXISTS `tb_datadictionarytype`;
create table tb_datadictionarytype
(
   id                   int(11) not null auto_increment comment '表主键',
   name                 varchar(30) comment '类型名称',
   value                varchar(30) comment '类型值',
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_datadictionarytype
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_datadictionary` 数据字典表
-- ----------------------------
DROP TABLE IF EXISTS `tb_datadictionary`;
create table tb_datadictionary
(
   id                   int(11) not null AUTO_INCREMENT comment '数据字典表主键',
   type                 varchar(30) comment '数据字典类型',
   name                 varchar(30) comment '数据字典名称',
   value                varchar(30) comment '数据字典值',
   status               varchar(1) comment '数据字典状态 0停用/1启用',
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_datadictionary
-- ----------------------------

