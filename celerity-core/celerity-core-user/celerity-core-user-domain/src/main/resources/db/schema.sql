CREATE TABLE `user` (
  `id` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '主键ID',
  `code` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `username` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '密码',
  `phone` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '手机',
  `email` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '邮箱',
  `type` tinyint DEFAULT '1' COMMENT '用户类型',
  `status` tinyint DEFAULT '0' COMMENT '状态',
  `is_admin` tinyint(1) DEFAULT '0' COMMENT '是否管理员',
  `salt` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '密码加盐',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci