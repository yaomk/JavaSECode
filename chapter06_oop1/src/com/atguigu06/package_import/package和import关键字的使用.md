### package 关键字的使用

#### 定义
package: 称为包，用于指明该文件中定义的类、接口等结构所在的包。

#### 语法格式
`package 顶层报名.子包名;`

#### 举例：
```java
package pack1.pack2;

public class PackageTest{
    public void display() {
        System.out.println("in method display()");
    }
}
```
#### 说明：
* 一个源文件只能有一个声明包的package语句
* package语句作为Java源文件的第一条语句出现，若缺省该语句，则指定为无名包。
* 包名，属于标识符，满足标识符命名的规则和规范（全部小写）、见名知意
  * 包通常使用所在公司域名的倒置：com.baidu.xxx。
  * 大家取包名时不要使用 java.xx 包
* 包对应于文件系统的目录，package语句中使用“.”来指明包（目录）的层次，每“.”一次就表示一层文件目录。
* 同一个包下可以声明多个结构（类、接口），但是不能定义同名的结构（类、接口）。不同的包下可以定义同名的结构（类、接口）。

#### 包的作用
* 包可以包含类和子包，划分项目层次，便于管理
* 帮助**管理大型软件**系统：将功能相近的类划分到同一个包中。比如：**MVC**的设计模式
* 解决**类命名冲突**的问题
* 控制**访问权限**

#### 举例2:MVC设计模式
* MVC是一种软件构件模式，目的是为了降低程序开发中代码业务的耦合度。
* MVC设计模式将整个程序分为三个层次:`视图模型(Viewer)层`，`控制器(Controller)层`，与`数据模型(Model)层` 。这种将程序输入输出、数据处理，以及数据的展示分离开来的设计模式使程序结构变的灵活而且清晰，同时也描述了程序各个对象间的通信方式，降低了程序的耦合性。

```
视图层viewer:显示数据,为用户提供使用界面，与用户直接进行交互。
>相关工具类    view.utils
>自定义view   view.ui

控制层controller: 解析用户请求，处理业务逻辑，给予用户响应
>应用界面相关     controller.activity
>存放fragment    controller.fragment
>显示列表的适配器  controller.adapter
>服务相关的       controller.service
>抽取的基类       controller.base

模型层model: 主要承载数据、处理数据
>数据对象封装   model.bean/domain
>数据库操作类   model.dao
>数据库        model.db
```

#### JDK中主要的包
* `java.lang`: 包含一些Java语言的核心类，如String、Math、Integer、System和Thread，提供常用功能。
* `java.net`: 包含执行与网络相关的操作的类和接口。
* `java.io`: 包含能提供多种输入/输出功能的类。
* `java.util`: 包含一些实用工具类，如定义系统特性、接口的集合框架类、使用与日期日历相关的函数。
* `java.text`: 包含了一些java格式化相关的类。
* `java.sql`: 包含了java进行JDBC数据库编程的相关类/接口。
* `java.awt`: 包含了构成抽象窗口工具集(abstract window toolkits)的多个类，这些类被用来构建和管理应用程序的图形用户界面(GUI)。

### import关键字的使用

#### 定义
import: 导入。为了使用定义在其它包中的Java类，需用import语句来显式引入指定包下所需要的类。相当于`import语句告诉编译器到哪里去寻找这个类`。

#### 语法格式
`import 包名.类名;`

#### 举例：
```java
import pack1.pack2.Test;
// import pack1.pack2.*; 表示引入pack1.pack2包中的所有结构

public class PackageTest{
    public void display() {
        Test t = new Test(); // Test类在pack1.pack2包中定义
        t.display();
        System.out.println("in method display()");
    }
}
```

#### 注意事项
* import语句，声明在包的声明和类的声明之间。
* 如果需要导入多个类或接口，那么就并列显式多个import语句即可
* 如果使用`a.*`导入结构，表示可以导入a包下的所有的结构。举例:可以使用`java.util.*`的方式，一次性导入util包下所有的类或接口。
* 如果导入的类或接口是`java.lang`包下的，或者是当前包下的，则可以省略此import语句。
* 如果已经导入java.a包下的类，那么如果需要使用a包的子包下的类的话，仍然需要导入。
* 如果在代码中使用不同包下的同名的类，那么就需要使用类的全类名的方式指明调用的是哪个类。
* (了解)`import static`组合的使用:调用指定类或接口下的静态的属性或方法