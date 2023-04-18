CREATE TABLE `metadata_view` (
  `id` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '主键ID',
  `code` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '用户名',
  `path` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '密码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `metadata_page` (
  `id` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '主键ID',
  `code` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '用户名',
  `path` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '密码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
