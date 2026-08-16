## File 类的使用

> File 类位于 java.io 包下，本章节涉及到的相关流也都声明在 java.io 包下.
> <br/> File 类的一个对象，对应与操作系统下的一个文件或者一个文件目录（或文件夹）.
> <br/> File 类中声明了新建、删除、获取名称、重命名等方法，并没有涉及到文件内容的读写操作。要想实现文件内容的读写，就需要使用
> io 流。
> <br/> File 类的对象，通常是作为 io 流操作的文件的端点出现的。代码层面，将 File 类的对象作为参数传递到 IO 流相关类的构造器中。

### File 常用构造器

* `public File(String pathname)`: 以 `pathname` 为路径创建 `File` 对象，可以是绝对路径或者相对路径
* `public File(String parent, String child)`: 以 `parent` 为父路径，`child` 为子路径创建 `File` 对象
* `public File(File parent, String child)`: 根据一个父 `File` 对象和一个子文件路径创建 `File` 对象

### File 常用方法

* 获取文件和目录基本信息
    * `public String getName()`: 获取文件/目录的名称
    * `public String getPath()`: 获取文件/目录的路径
    * `public String getAbsolutePath()`: 获取文件/目录的绝对路径（不解析 `..` 或 `.`）
    * `public String getCanonicalPath()`: 获取规范路径（解析 `..` 和 `.`，处理符号链接）
    * `public String getParent()`: 获取文件/目录的上级目录路径，若无，返回 null
    * `public long length()`: 获取文件的长度（即：字节数），不能获取目录的长度
    * `public long lastModified()`: 获取文件/目录的最后修改时间，毫秒值

* 列出目录的下一级
    * `public String[] list()`: 返回一个 `String` 数组，表示该 `File` 目录中的所有子文件或目录
    * `public String[] list(FilenameFilter filter)`: 使用文件名称过滤器列出
    * `public File[] listFiles()`: 返回一个 `File` 数组，表示该 `File` 目录中的所有子文件或目录
    * `public File[] listFiles(FilenameFilter filter)`: 使用文件名称过滤器列出

* 重命名或移动
    * `public boolean renameTo(File dest)`: 重命名或移动文件（不建议使用，易失败；推荐 `Files.move`）

* 判断方法
    * `public boolean exists()`: 判断文件或目录是否存在
    * `public boolean isFile()`: 判断是否为文件
    * `public boolean isDirectory()`: 判断是否为目录
    * `public boolean isAbsolute()`: 判断是否为绝对路径
    * `public boolean canRead()`: 判断文件是否可读
    * `public boolean canWrite()`: 判断文件是否可写
    * `public boolean canExecute()`: 判断文件是否可执行
    * `public boolean isHidden`: 判断文件是否为隐藏文件

* 创建与删除
    * `public boolean createNewFile()`: 创建一个新文件，成功返回 true；若已存在返回 false
    * `public boolean mkdir()`: 创建单级目录（父目录必须存在）
    * `public boolean mkdirs()`: 创建多级目录（自动创建不存在的父目录）
    * `public boolean delete()`: 删除文件或空目录（如果不为空目录，则删除失败），成功返回 true
    * `public boolean deleteOnExit()`: 注册在 JVM 退出时删除该文件（用于临时文件）
    * 删除注意事项：
        * java 中的删除不走回收站。

### 注意点：

在 IDE 中，相对路径说明：

* 如果使用单元测试方法，相对于当前的 `module`
* 如果使用 `main()` 方法，相对于当前的 `project`






















