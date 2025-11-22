### System 类

#### 属性
* out：标准的输出流（The “standard” output stream）
* in：标准的输入流（The “standard” input stream）
* error：标准的错误输出流（The “standard” error output stream）
类型都为：static final PrintStream

#### 方法
* `native long currentTimeMillis()`：返回当前的计算机时间（时间戳）
* `void exit(int status)`：退出程序，status：0代表正常退出，非0代表异常退出
* `void gc()`：请求系统进行垃圾回收。不一定是立刻回收
* `String getProperty(String key)`：获取系统中属性名为key的属性对应的值。
  * 如："java.version"：java运行时环境版本
  * "java.home"：java安装目录
  * "os.name"：操作系统的名称
  * "os.version"：操作系统的版本
  * "user.name"：用户的账户名称
  * "user.home"：用户的主目录
  * "user.dir"：用户当前工作目录

### Runtime 类
> 每个java应用程序都有一个 Runtime 类实例，使应用程序能够与其运行的环境相连接。
> 是单例的（饿汉式）
#### 方法
* `public static Runtime getRuntime()`：返回与当前 java 应用程序相关的运行时对象。应用程序不能创建自己的 Runtime 类实例。
* `public long totalMemory()`：返回 java 虚拟机中初始化时的内存总量。返回值可能随时间的推移而变化。默认为电脑物理内存的 1/64。
* `public long maxMemory()`：返回 java 虚拟机中最大程度能使用的内存总量。默认为电脑物理内存的 1/4。
* `public long freeMemory()`：返回 java 虚拟机中的空闲内存量。调用 gc() 可能导致返回值增加。

### Math 类
> 包含用于执行基本数学运算的方法，其所有的方法均为静态方法，并且不会创建对象。
#### 常用方法
* `public static double abs(double a)`：返回参数的绝对值
* `public static double ceil(double a)`：返回大于等于参数的最小的整数
* `public static double floor(double a)`：返回小于等于参数最大的整数
* `public static long round(double a)`：返回最接近参数的long，相当于四舍五入方法
* `public static double random()`：返回[0,1)的随机值
* `public static double max(double x, double y)`：返回x，y中的最大值
* `public static double min(double x, double y)`：返回x，y中的最小值

#### 不常用方法/属性
* `public static double pow(double a, double b)`：返回a的b幂次方法
* `public static double sqrt(double a)`：返回a的平方根
* `public static final double PI`：返回圆周率
* 其他：acos，asin，atan，cos，sin，tan函数

### BigInteger 类和 BigDecimal 类

#### BigInteger
> Integer 类作为 int 的包装类，能存储的最大整型值为 2^31-1,Long 类也是有限的，最大为 2^63-1。如果要表示再大的整数，就需要 BigInteger 类。
> java.math 包的 BigInteger 表示不可变的任意精度的整数。

* 构造器
  * `BigInteger(String val)`：根据字符串构建 BigInteger 对象
* 方法
  * `public BigInteger abs()`：返回此 BigInteger 类的对象的绝对值
  * `BigInteger add(BigInteger val)`：返回 （this + val) 的 BigInteger
  * `BigInteger subtract(BigInteger val)`：返回 （this - val) 的 BigInteger
  * `BigInteger multiply(BigInteger val)`：返回 （this * val) 的 BigInteger
  * `BigInteger divide(BigInteger val)`：返回 （this / val) 的 BigInteger
  * `BigInteger remainder(BigInteger val)`：返回 （this % val) 的 BigInteger

#### BigDecimal （常用）
> 要求数字精度比较高，可以使用 java.math.BigDecimal 类
> BigDecimal 类支持不可变的、任意精度的有符号十进制定点数。

* 构造器
  * `public BigDecimal(double val)`
  * `public BigDecimal(String val)` -> 推荐
* 常用方法
  * `public BigDecimal add(BigDecimal augend)`
  * `public BigDecimal subtract(BigDecimal subtrahend)`
  * `public BigDecimal multiply(BigDecimal multiplicand)`
  * `public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)`
    * divisor 是除数
    * scale 指明保留几位小数
    * roundingMode 指明舍入模式（ROUND_UP: 向上加1，ROUND_DOWN：直接设区，ROUND_HALF_UP：四舍五入）

### Random 类
> java.util.Random 用于产生随机数

* 方法
  * `int nextInt()`：返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值
  * `int nextInt(int n)`：返回下一个伪随机数，它是取自此随机数生成器序列的，在0（包括）和指定值（不包括）之间均匀分布的的 int 值