# 迭代器（Iterator）的作用？
用来遍历集合元素。

# 如何获取迭代器（Iterator）对象？
`Collection` 接口的抽象方法：`iterator()`
`Iterator iterator = coll.iterator();`

# 如何实现遍历（代码实现）
```
while(iterator.hasNext()) {
    // ① 指针下移
    // ② 将下移以后集合位置上的元素返回
    System.out.println(iterator.next())
};
```

# 增强 for 循环（foreach 循环）的使用（jdk5.0新特性）

### 增强 for 循环的作用：
用来遍历数组、集合。
### 增强 for 循环的格式：
```
for(要遍历的集合或数组元素的类型 临时变量 : 要遍历的集合或数组变量){
    操作临时变量的输出
}

int[] arr = {1,2,3};
for(int i : arr){
    System.out.println(i);
}
```
### 增强 for 循环的说明：
* 针对于集合来讲，增强 for 循环的底层仍然使用的是迭代器。
* 增强 for 循环的执行过程中，是将集合或数组中的元素依次赋值给临时变量。注意：循环体中对临时变量的修改，可能不会导致原有集合或数组中元素的修改。