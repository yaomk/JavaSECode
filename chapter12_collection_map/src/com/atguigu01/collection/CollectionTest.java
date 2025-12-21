package com.atguigu01.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * ClassName: CollectionTest
 * Description: 测试 Collection 中方法的使用
 *
 * @Author yao
 * @Create 2025/12/20 10:44
 * @Version 1.0
 */
public class CollectionTest {
    @Test
    public void test1() {
        /*
        * 添加相关：
        * 一、add(E obj): 添加元素对象到当前集合中
        * 二、addAll(Collection other): 添加 other 集合中的所有元素对象到当前集合中，即 this = this ∪ other
        * */
        Collection coll = new ArrayList();

        coll.add("a");
        coll.add(123); // 自动装箱
        coll.add(true);
        coll.add(new Object());
        coll.add(new Person("Tom", 12));
        System.out.println(coll);

        // addAll(Collection other)
        Collection coll1 = new ArrayList();
        coll1.add("B");
        coll1.add(false);

        System.out.println(coll.size());
        coll.add(coll1);
        coll.addAll(coll1);
        System.out.println(coll);
        System.out.println(coll.size());
    }

    @Test
    public void test2() {
        /*
        * 判断相关：
        * 三、int size(): 获取当前集合中实际存储的元素的个数
        * 四、boolean isEmpty(): 判断当前集合是否为空集合
        * 五、boolean contains(Object obj): 判断当前集合中是否存在一个与 obj 对象 equals 返回 true 的元素
        * 六、boolean containsAll(Collection coll): 判断 coll 集合中的元素是否在当前集合中都存在。即 coll 集合是否当前集合的子集
        * 七、boolean equals(Object obj): 判断当前集合与obj是否相等
        * */
        Collection coll = new ArrayList();

        coll.add("a");
        coll.add(123); // 自动装箱
        coll.add(128); // [-128,127]之间的整数会进行缓存，超过127时相当于 new Integer(128)
        coll.add(true);
        Person p1 = new Person("Tom", 12);
        coll.add(p1);

        System.out.println(coll.isEmpty()); // false
        // contains() 使用 obj 的 equals 方法比较
        System.out.println(coll.contains("a")); // true
        System.out.println(coll.contains(128)); // true
        System.out.println(coll.contains(p1)); // true
        System.out.println(coll.contains(new Person("Tom", 12))); // false, Person中未重写父类的equals，重写后为 true

        Collection coll1 = new ArrayList();
        coll1.add("a");
        coll1.add(128);
        System.out.println(coll.containsAll(coll1)); // true
    }
    @Test
    public void test3() {
        /*
        * 删除相关：
        * 八、void clear(): 清空集合元素
        * 九、boolean remove(Object obj): 从当前集合中删除第一个找到的与 obj 对象 equals 返回 true 的元素。
        * 十、boolean removeAll(Collection coll): 从当前集合中删除所有与 coll 集合中相同的元素。即 this = this - this ∩ coll。
        * 十一、boolean retainAll(Collection coll): 从当前集合中删除两个集合中不同的元素，
        *      使得当前集合中仅保留与 coll 集合中的元素相同的元素，即当前元素中仅保留两个集合的交集。即this = this ∩ coll。
        * */
        Collection coll = new ArrayList();

        coll.add("a");
        coll.add(123); // 自动装箱
        coll.add(128); // [-128,127]之间的整数会进行缓存，超过127时相当于 new Integer(128)
        coll.add(true);
        coll.add(new Person("Tom", 12));
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.size()); // 0

        // remove(Object obj)
        coll.add(123);
        coll.add(123);
        coll.add(new Person("Tom", 12));
        coll.remove(123); // 只删除第一个找到的与 obj 对象 equals 返回 true 的元素
        System.out.println(coll);
        coll.remove(new Person("Tom", 12));
        System.out.println(coll);
    }

    @Test
    public void test4() {
        /*
        * 其他：
        * 十二、Object[] toArray(): 返回包含当前集合中所有元素的数组
        * 十三、hashCode(): 获取集合对象的哈希值
        * 十四、iterator(): 返回迭代器对象，用于遍历集合
        * */
        Collection coll = new ArrayList();

        coll.add("a");
        coll.add(123); // 自动装箱
        coll.add(true);
        coll.add(new Person("Tom", 12));

        // 集合 ---> 数组
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));

        int hashCode = coll.hashCode();
        System.out.println(hashCode);
    }

    @Test
    public void test5() {
        String[] arr = new String[]{"a", "b", "c"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list); // [a, b, c]
        List<String> list1 = Arrays.asList("AA", "BB", "cc");
        System.out.println(list1); // [AA, BB, cc]
    }

    @Test
    public void test6() {
        Integer[] arr = new Integer[]{1,2,3};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(Arrays.asList(1, 2, 3).size()); // 3 自动装箱
        System.out.println(list.size()); // 3
        System.out.println(list); // [1,2,3]

        int[] arr1 = {1,2,3};
        // Arrays.asList(Object... a) 可变个数形参，需要传递 Object 的可变个数形参，当传递 new int[]{1,2,3}时，所以只有一个
        List<int[]> list1 = Arrays.asList(arr1);
        System.out.println(list1.size()); // 1
        System.out.println(list1); // [[I@4520ebad]
    }
}
