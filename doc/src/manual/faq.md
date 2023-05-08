# FAQ

## 实现在 repository 还是 persistent?
~~由于查询条件的类型不一样，所以选择在 repository 层实现，同时在 repository 层做条件转换。~~
由于需要做一些生命周期的管理, 选择在 persistent 层实现，同时在 persistent 层做条件转换。

## 页面使用 view 还是 page?
由于 page 还有分页的含义, view 在 mysql 中是关键字，所以选择 view 表示页面, 表名使用 metadata_view, 即 **模块_实体** 格式

## entity 和 model 的使用
entity 使用在 repository 和 persistent， model 使用在 repository 和 service, 在 repository 中将 entity 转为 model

## Transform
Entity 和 Model 之间的转换, 如果字段出现变动, 添加此层可以避免对 service 或 repository 修改.

## MySQL 字符集
utf8mb4_bin 将字符串中的每一个字符用二进制数据存储，区分大小写。

utf8mb4_unicode_ci不区分大小写，ci为case insensitive的缩写，即大小写不敏感。

utf8_genera_ci不区分大小写，ci为case insensitive的缩写，即大小写不敏感。

utf8_general_cs区分大小写，cs为case sensitive的缩写，即大小写敏感。


## Idea类注释模板
File---Settings---Editor---File and Code Templates--- Includes
```
/**
 * package: ${PACKAGE_NAME}
 * class: ${NAME}
 * date: ${DATE} ${TIME}
 * version: 1.0.0
 * description:
 */
```
