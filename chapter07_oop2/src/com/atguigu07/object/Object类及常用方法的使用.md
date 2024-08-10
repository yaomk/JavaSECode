### Object 类的概述

#### Object 类的说明

* 明确：`java.lang.Object`
* 任何一个 Java 类（除 Object 类）都直接或间接的继承于 Object 类
* Object 类称为 Java 类的根父类
* Object 类中声明的结构（属性、方法等）就具有通用性。
    * Object 类中没有声明属性
    * Object 类提供了一个空参的构造器
    * 重点关注：Object 类中声明的**方法**

#### 常用方法

* 重点方法：`equals()`, `toString()`
* 了解方法：`clone()`, `finalize()`
* 其他的方法：`getClass()`, `hashCode()`, `notify()`, `notifyAll()`, `wait()`

##### 面试题：final、finally、finalize 的区别

### equals()的使用

* 适用性：任何引用数据类型都可以使用。

#### java.lang.Object 类中的 equals() 定义

```java
 public boolean equals(Object obj) {
      return (this == obj);
  }
```

#### 子类使用说明

* 自定义的类在没有重写 Object 中的 equals() 方法的情况下，调用的就是 Object 类中定义的 equals()
  ，比较两个对象的引用地址是否相同。（或比较两个对象是否指向了堆空间中的同一个对象实体）
* 对于像 String、File、Date和包装类等，它们都重写了Object类中的equals()方法，用于比较两个对象实体内容是否相等。

#### 开发中使用说明

* 实际开发中，针对于自定义的类，常常会判断两个对象是否equals()
  ，而此时主要是判断两个对象的属性值是否相等。所以，我们要重写Object类的equals()方法。
* 如何重写：
    * 手动自己实现
    * IDEA自动实现

#### 高频面试题：区分 `==` 和 `equals()`

`==`: 运算符

* 使用范围：基本数据类型、引用数据类型
* 基本数据类型：判断数据值是否相等

```
int i1 = 10;
int i2 = 10;
System.out.println(i1 == i2); //true

char c1 = 'A';
int i3 = 65;
System.out.println(c1 == i3); //true

float f1 = 12.0F;
int i4 = 12;
System.out.println(f1 == i4); //true
```

* 引用数据类型变量：比较两个引用变量的地址值是否相等。（或比较两个引用是否指向同一对象实体）

`equals()`: 方法

* 使用范围：只能使用在引用数据类型上。
* 具体使用：对于类来说，重写equals()和不重写equals()的区别。














