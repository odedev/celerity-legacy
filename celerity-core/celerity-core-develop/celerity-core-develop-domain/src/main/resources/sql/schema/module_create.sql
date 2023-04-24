CREATE TABLE IF NOT EXISTS `develop_module` (
    `id` varchar(32) NOT NULL COMMENT 'ID',
    `code` varchar(32) NOT NULL COMMENT '编码',
    `name` varchar(32) NOT NULL DEFAULT '' COMMENT '名称',
    `description` varchar(255) NOT NULL DEFAULT '' COMMENT '描述',
    `module_type` tinyint DEFAULT '1' COMMENT '模块类型',
    `persistence_type` tinyint DEFAULT '0' COMMENT '持久化类型',
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
