CREATE TABLE IF NOT EXISTS `develop_view` (
    `id` varchar(32) NOT NULL COMMENT 'ID',
    `code` varchar(32) NOT NULL COMMENT '编码',
    `name` varchar(32) NOT NULL DEFAULT '' COMMENT '名称',
    `path` varchar(255) NOT NULL DEFAULT '' COMMENT '路径',
    `serial_no` tinyint DEFAULT '1' COMMENT '顺序号',
    `is_menu` tinyint DEFAULT '0' COMMENT '是否菜单',
    `parent` varchar(32) NOT NULL DEFAULT NULL COMMENT '父级',
    `module` varchar(32) NOT NULL DEFAULT NULL COMMENT '模块',
    `remark` varchar(255) DEFAULT '' COMMENT '备注',
    `created_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '创建人',
    `created_at` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
    `updated_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '更新人',
    `updated_at` DATETIME NULL DEFAULT NULL COMMENT '更新时间',
    `deleted_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '删除人',
    `deleted_at` DATETIME NULL DEFAULT NULL COMMENT '删除时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `code` (`code`)
);
