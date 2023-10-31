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


<blockquote> 
MySQL的utf8是utfmb3，只有三个字节，节省空间但不能表达全部的UTF-8。所以推荐使用utf8mb4

<p>MySQL常用排序规则utf8mb4_general_ci、utf8mb4_unicode_ci、utf8mb4_bin<br>
ci即case insensitive，不区分大小写。<br> 
<strong>utf8mb4_unicode_ci</strong>：<br> 
是基于标准的Unicode来排序和比较，能够在各种语言之间精确排序，Unicode排序规则为了能够处理特殊字符的情况，实现了略微复杂的排序算法<br> 
<strong>utf8mb4_general_ci</strong>：<br>
是一个遗留的 校对规则，不支持扩展，它仅能够在字符之间进行逐个比较。utf8_general_ci校对规则进行的比较速度很快，但是与使用 utf8mb4_unicode_ci的校对规则相比，比较正确性较差。<br> 
<strong>utf8mb4_bin</strong>：<br> 
将字符串每个字符用二进制数据编译存储，区分大小写，而且可以存二进制的内容。<br> 
<strong>utf8mb4_0900_ai_ci</strong>：<br> 
MySQL 8.0 默认的是 utf8mb4_0900_ai_ci，属于 utf8mb4_unicode_ci 中的一种，具体含义如下：<br> 
uft8mb4 表示用 UTF-8 编码方案，每个字符最多占 4 个字节。<br>
0900 指的是 Unicode 校对算法版本。（Unicode 归类算法是用于比较符合 Unicode 标准要求的两个 Unicode 字符串的方法）。<br> ai 指的是口音不敏感。也就是说，排序时 e，è，é，ê 和 ë 之间没有区别。<br>
ci 表示不区分大小写。也就是说，排序时 p 和 P 之间没有区别。<br>
utf8mb4 已成为默认字符集，在 MySQL 8.0.1 及更高版本中将 utf8mb4_0900_ai_ci 作为默认排序规则。以前，utf8mb4_general_ci 是默认排序规则。由于 utf8mb4_0900_ai_ci 排序规则现在是默认排序规则，因此默认情况下新表格可以存储基本多语言平面之外的字符。现在可以默认存储表情符号。如果需要重音灵敏度和区分大小写，则可以使用 utf8mb4_0900_as_cs 代替。</p> 
</blockquote>


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
