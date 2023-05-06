
# 参考官方文档: https://dev.mysql.com/doc/refman/8.0/en/numeric-type-syntax.html
# As of MySQL 8.0.17, the display width attribute is deprecated for integer data types; you should expect support for it to be removed in a future version of MySQL.
# As of MySQL 8.0.17, the ZEROFILL attribute is deprecated for numeric data types

CREATE TABLE IF NOT EXISTS `uc_user` (
    `id` CHAR(32) NOT NULL COMMENT '主键ID' COLLATE 'utf8mb4_unicode_ci',
    `code` VARCHAR(32) NOT NULL COMMENT '编码' COLLATE 'utf8mb4_unicode_ci',
    `name` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '姓名' COLLATE 'utf8mb4_unicode_ci',
    `phone` VARCHAR(11) NULL DEFAULT '' COMMENT '手机' COLLATE 'utf8mb4_unicode_ci',
    `email` VARCHAR(64) NULL DEFAULT '' COMMENT '邮箱' COLLATE 'utf8mb4_unicode_ci',
    `type` TINYINT NULL DEFAULT '1' COMMENT '用户类型',
    `status` TINYINT NULL DEFAULT '0' COMMENT '状态',
    `is_admin` TINYINT NULL DEFAULT '0' COMMENT '是否管理员',
    `salt` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '密码加盐' COLLATE 'utf8mb4_unicode_ci',
    `remark` VARCHAR(255) NULL DEFAULT '' COMMENT '备注' COLLATE 'utf8mb4_unicode_ci',
    `is_valid` TINYINT NULL DEFAULT '1' COMMENT '是否生效',
    `created_by` CHAR(32) NULL DEFAULT NULL COMMENT '创建人ID' COLLATE 'utf8mb4_unicode_ci',
    `created_at` DATETIME(6) NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT '创建时间',
    `updated_by` CHAR(32) NULL DEFAULT NULL COMMENT '更新人ID' COLLATE 'utf8mb4_unicode_ci',
    `updated_at` DATETIME(6) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(6) COMMENT '更新时间',
    `updated_count` INT NULL DEFAULT '0' COMMENT '更新次数',
    `deleted_by` CHAR(32) NULL DEFAULT NULL COMMENT '删除人ID' COLLATE 'utf8mb4_unicode_ci',
    `deleted_at` DATETIME(6) NULL DEFAULT NULL COMMENT '删除时间',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE INDEX `code` (`code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET='utf8mb4' COLLATE='utf8mb4_unicode_ci';

CREATE TABLE IF NOT EXISTS `user` (
    `id` varchar(32) NOT NULL COMMENT '主键ID' COLLATE utf8mb4_unicode_ci,
    `code` varchar(32) NOT NULL COMMENT '编码' COLLATE utf8mb4_unicode_ci,
    `phone` varchar(11) DEFAULT '' COMMENT '手机' COLLATE utf8mb4_unicode_ci,
    `email` varchar(64) DEFAULT '' COMMENT '邮箱' COLLATE utf8mb4_unicode_ci,
    `type` tinyint DEFAULT '1' COMMENT '用户类型',
    `status` tinyint DEFAULT '0' COMMENT '状态',
    `is_admin` tinyint(1) DEFAULT '0' COMMENT '是否管理员',
    `salt` varchar(255) NOT NULL DEFAULT '' COMMENT '密码加盐' COLLATE utf8mb4_unicode_ci,
    `remark` varchar(255) DEFAULT '' COMMENT '备注' COLLATE utf8mb4_unicode_ci,
    `is_valid` tinyint(1) DEFAULT '1' COMMENT '是否生效',
    `created_by` varchar(32) DEFAULT NULL COMMENT '创建人ID' COLLATE utf8mb4_unicode_ci,
    `created_at` datetime DEFAULT NULL COMMENT '创建时间',
    `updated_by` varchar(32) DEFAULT NULL COMMENT '更新人ID' COLLATE utf8mb4_unicode_ci,
    `updated_at` datetime DEFAULT NULL COMMENT '更新时间',
    `updated_count` int DEFAULT '0' COMMENT '更新次数',
    `deleted_by` varchar(32) DEFAULT NULL COMMENT '删除人ID' COLLATE utf8mb4_unicode_ci,
    `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户';
