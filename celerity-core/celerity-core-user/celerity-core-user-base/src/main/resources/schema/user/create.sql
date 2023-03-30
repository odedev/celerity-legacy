CREATE TABLE IF NOT EXISTS `user` (
  `id` varchar(32) COLLATE utf8mb4_unicode_ci COMMENT '主键ID',
  `username` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '用户名',
  `password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '密码',
  `email` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
