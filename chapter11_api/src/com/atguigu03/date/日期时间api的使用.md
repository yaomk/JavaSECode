## JDK8之前的api：
* System 类的 currentTimeMillis()
  * 获取当前时间对应的毫秒数，long类型，时间戳
  * 当前时间与1970年1月1日0分0秒之间的毫秒数
  * 常用来计算时间差

## 两个 Date 类

```
|--java.util.Date
  两个构造器的使用
  两个方法的使用：① toString(), ② getTime()
    |----java.sql.Date: 对应着数据库中的date的类型
```

## SimpleDateFormat 类
* SimpleDateFormat：用于日期时间的格式化和解析
  * 格式化：日期 -> 字符串 `String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())`
  * 解析：字符串 -> 日期 `Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2025-09-22 11:26:00")`

## Calendar类（日历类）：抽象类
* ① 由于 Calendar 是一个抽象类，所以我们需要创建其子类的实例。这里我们通过 Calendar 的静态方法 getInstance() 即可获取
* ② 常用方法：
  * get(int field) 
  * set(int filed, xx)
  * add(int field, xx)
  * getTime()
  * setTime()

## JDK8: 新的日期时间API
> JDK 1.0 中包含了一个 java.util.Date 类，但是它的大多数方法已经在 JDK 1.1 引入 Calendar 类之后被弃用了，而 Calendar 也存在问题：
> 1. 可变性：像日期和时间这样的类应该是不可变的
> 2. 偏移性：Date 中的年份是从 1900 年开始的，而月份都从 0 开始
> 3. 格式化：格式化（SimpleDateFormat）只对 Date 有用，Calendar 则不行
> 4. 此外，他们也不是线程安全的，不能处理闰秒等

### 新的日期时间 API 包含：
* java.time - 包含值对象的基础包
* java.time.chrono - 提供对不同的日历系统的访问
* java.time.format - 格式化和解析时间和日期
* java.time.temporal - 包括底层框架和扩展特性
* java.time.zone - 包含时区支持的类

说明：新的 java.time 中包含了所有关于时钟（Clock），本地日期（LocalDate），本地时间（LocalTime），本地日期时间（LocalDateTime），时区（ZonedDateTime
）和持续时间（Duration）的类。

#### 本地日期时间：LocalDate、LocalTime、LocalDateTime

|                                   方法                                    |               描述               |
|:-----------------------------------------------------------------------:|:------------------------------:|
|                        now() / now(ZoneId zone)                         |   静态方法，根据当前时间创建对象 / 指定时区的对象    |
|                                 of(xx)                                  |       静态方法，根据指定日期，时间创建对象       |
|                    getDayOfMonth() / getDayOfYear()                     |  获取月份天数（1-31）/ 获取年份天数（1-366）   |
|                             getDayOfWeek()                              |    获取星期几，返回一个 DayOfWeek 枚举值    |
|                               getMonth()                                |      获取月份，返回一个 Month 枚举值       |
|                       getMonthValue() / getYear()                       |        获取月份（1-12）/ 获取年份        |
|                 getHours() / getMinute() / getSecond()                  |        获取当前对象对应的小时/分钟/秒        |
|      withDayOfMonth() / withDayOfYear() / withMonth() / withYear()      | 将月份天数/年份天数/月份/年份修改为指定的值并返回新的对象 |
|                        with(TemporalAdjuster t)                         |      将当前日期时间设置为校对器指定的日期时间      |
|   plusDays() / plusWeeks() / plusMonths() / plusYears() / plusHours()   |     向当前对象添加几天/几周/几月/几年/几小时     |
| minusMonths() / minusWeeks() / minusDays() / minusYear() / minusHours() |     从当前对象减去几月/几周/几天/几年/几小时     |
|            plus(TemporalAmount t) / minus(TemporalAmount t)             |   添加或减去一个 Duration 或 Period    |
|                         isBefore() / isAfter()                          |         比较两个 LocalDate         |
|                              isLeapYear()                               |   判断是否是闰年（在 LocalDate 类中声明）    |
|                       format(DateTimeFormatter t)                       |       格式化本地日期、时间，返回一个字符串       |
|                        parse(CharSequence text)                         |       将指定格式的字符串解析为日期、时间        |

#### 瞬时：Instant，类似于 Date
* Instant：时间线上的一个瞬时点。这可能被用来记录应用程序的事件时间戳。
  * 时间戳：格林尼治时间1970-01-01 00:00:00（北京时间1970-01-01 08:00:00）起至现在的总秒数。
* java.time.Instant: 表示时间线上的一点，而不需要任何上下文信息，例如：时区。概念上讲：它只是简单的表示自 1970-01-01 00:00:00 (UTC) 开始的秒数。

|              方法               |               描述               |
|:-----------------------------:|:------------------------------:|
|             now()             | 静态方法，返回默认 UTC 时区的 Instant 类的对象 |
| ofEpochMilli(long epochMilli) | 静态方法，返回加上指定毫秒数之后的 Instant 类的对象 |
|  atOffset(ZoneOffset offset)  |  结合即时的偏移来创建一个 OffsetDateTime   |
|        toEpochMilli()         |       返回到当前时间的毫秒数，即为时间戳        |

#### 日期时间格式化：DateTimeFormatter，类似于 SimpleDateFormat
用于格式化和解析

该类提供了三种格式化方法：
* 预定义的标准格式。如：`ISO_LOCAL_DATE_TIME`,`ISO_LOCAL_DATE`,`ISO_LOCAL_TIME`
* 本地化相关的格式。如：`ofLocalizedDate(FormatStyle.LONG)`
* 自定义的格式。如：`ofPattern("yyyy-MM-dd hh:mm:ss")`

|             方法             |                 描述                  |
|:--------------------------:|:-----------------------------------:|
| ofPattern(String pattern)  | 静态方法，返回一个指定字符串格式的 DateTimeFormatter |
| format(TemporalAccessor t) |          格式化一个日期、时间，返回字符串           |
|  parse(CharSequence text)  |        将指定格式的字符序列解析为一个日期、时间         |

##### 与传统日期处理的转换
|                             类                             |                 To遗留类                 |           From遗留类           |
|:---------------------------------------------------------:|:-------------------------------------:|:---------------------------:|
|            java.time.Instant 与 java.util.Date             |          Date.from(instant)           |      date.toInstant()       |
|          java.time.Instant 与 java.sql.Timestamp           |        Timestamp.from(instant)        |    timestamp.toInstant()    |
|   java.time.ZonedDateTime 与 java.util.GregorianCalendar   | GregorianCalendar.from(zonedDateTime) |    cal.toZonedDateTime()    |
|            java.time.LocalDate 与 java.sql.Time            |        Date.valueOf(localDate)        |     date.toLocalDate()      |
|            java.time.LocalTime 与 java.sql.Time            |        Date.valueOf(localDate)        |     date.toLocalTime()      |
|       java.time.LocalDateTime 与 java.sql.Timestamp        |   Timestamp.valueOf(localDateTime)    | timestamp.toLocalDateTime() |
|           java.time.ZonId 与 java.util.TimeZone            |       TimeZone.getTimeZone(id)        |     timeZone.toZoneId()     |
| java.time.format.DateTimeFormatter 与 java.text.DateFormat |         formatter.toFormat()          |              无              |