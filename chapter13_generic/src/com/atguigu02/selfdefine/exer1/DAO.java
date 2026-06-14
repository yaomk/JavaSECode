package com.atguigu02.selfdefine.exer1;

import java.util.*;

/**
 * ClassName: DAO
 * Description:
 *
 * @Author yao
 * @Create 2026/6/13 11:17
 * @Version 1.0
 */
public class DAO<T> {
    Map<String, T> map;

    // 代码块方式赋值
    {
        map = new HashMap<>();
    }

    // 保存 T 类型的对象到 Map 成员变量中
    public void save(String id, T entity) {
        if (!map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    // 从 map 中获取 id 对应的对象
    public T get(String id) {
        return map.get(id);
    }

    // 替换 map 中的key 为 id 的内容，改为 entity 对象
    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    // 返回 map 中存放的所有 T 对象
    public List<T> list() {
        Collection<T> values = map.values();
        System.out.println(values.getClass());
        // return (List<T>) values; // 报错：ClassCastException 异常

        // ArrayList<T> arrayList = new ArrayList<>();
        // 使用 addAll() 方法
        // arrayList.addAll(values);
        // return arrayList;

        // 构造器的方式
        return new ArrayList<>(values);

    }

    // 删除指定 id 对象
    public void delete(String id) {
        map.remove(id);
    }

}
