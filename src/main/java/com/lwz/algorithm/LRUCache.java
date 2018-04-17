package com.lwz.algorithm;

/*
* 设计和实现一个  LRU（最近最少使用）缓存 数据结构，使它应该支持以下操作： get 和 put 。

get(key) - 如果密钥存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
put(key, value) - 如果密钥不存在，请设置或插入值。当缓存达到其容量时，它应该在插入新项目之前使最近最少使用的项目作废。

后续:

你是否可以在 O(1) 时间复杂度中进行两种操作？
 */

/*案例:

LRUCache cache = new LRUCache( 2 /* 容量 */

        /*cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作，会将 key 2 作废
        cache.get(2);       // 返回 -1 (结果不存在)
        cache.put(4, 4);    // 该操作，会将 key 1 作废
        cache.get(1);       // 返回 -1 (结果不存在)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4*/


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LRUCache {
    Map<Integer, Integer> map;
    Stack<Integer> stack;
    int size;

    public LRUCache(int capacity) {
        stack = new Stack<>();
        map = new HashMap<>(capacity);
        size = capacity;
    }

    public int get(int key) {
        if (!stack.contains(key)) {
            return -1;
        }
        boolean flag = stack.remove(Integer.valueOf(key));
        stack.push(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (stack.contains(key)) {
            stack.remove(Integer.valueOf(key));
        } else {
            if (stack.size() == size) {
                stack.remove(0);
                map.remove(key);
            }
        }
        stack.push(key);
        map.put(key, value);
    }

    public static void main() {

    }
}
