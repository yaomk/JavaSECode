## 异常处理的方式2：throws

### 格式

在方法的声明处，使用 `throws 异常类型1,异常类型2,...`

```
public void test() throws 异常类型1,异常类型2,... {
    可能存在编译时异常
}
```

### 是否真正处理了异常？

* 从编译是否能通过的角度看，看成是给出了异常万一要是出现的时候的解决方法。此方案就是：继续向上抛（throws）。
* 但是，此 throws 的方式，仅是将可能出现的异常抛给了此方法的调用者。此调用者仍然需要考虑如何处理相关异常。从这个角度来看，throws
  的方式不算是真正意义上处理了异常。

### 方法重写的要求：（针对编译时异常）

子类重写的方法抛出的异常类型可以与父类被重写的方法抛出的异常类型相同，或是父类被重写的方法抛出的异常类型的子类。

### 开发中，如何选择异常处理的两种方式？

* 如果程序代码中，涉及到资源的调用（流，数据库连接，网络连接等），则必须考虑使用 try-catch-finally 来处理，保证不出现内存泄漏。
* 如果父类被重写的方法没有 throws 异常类型，则子类重写的方法如果出现异常，只能考虑使用 try-catch-finally 进行处理，不能
  throws。
* 开发中，方法 a 依次调用了方法 b,c,d 等方法，方法 b,c,d 之间是递进关系。此时，如果方法 b,c,d 中有异常，通常选择使用
  throws，而方法 a 中通常选择使用 try-catch-finally。