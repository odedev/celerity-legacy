# FAQ

## 实现在 repository 还是 persistent?
由于查询条件的类型不一样，所以选择在 repository 层实现，同时在 repository 层做条件转换。

## 页面使用 view 还是 page?
由于 page 还有分页的含义, view 在 mysql 中是关键字，所以选择 view 表示页面, 表名使用 metadata_view, 即 **模块_实体** 格式

## entity 和 model 的使用
entity 使用在 repository 和 persistent， model 使用在 service 和 controller, 在 service 中将 entity 转为 model
