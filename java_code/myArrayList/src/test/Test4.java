package test;

import java.util.ArrayList;

/*
    需求：
        创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
    思路：
        1:创建集合对象
        2:往集合中添加字符串对象
        3:遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
        4:遍历集合，其次要能够获取到集合的长度，这个通过size()方法实现
        5:遍历集合的通用格式

         // 注意：根据元素进行删除，只能删除集合中的第一个指定元素
        list.remove("test");
 */
public class Test4 {
    public static void main(String[] args) {
        // 1:创建集合对象
        ArrayList<String> list = new ArrayList<>();
        // 2:往集合中添加字符串对象
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

        // 3:遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
        // 4:遍历集合，其次要能够获取到集合的长度，这个通过size()方法实现
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            // 5.加入判断是否为test 是的话删除
            // if(s.equals("test"){}  可能会导致空指针问题出现；建议把常量放外面去和里面的变量做比较
            if("test".equals(s)){
                list.remove(i);
                i--;// 这一步非常重要  可以把漏掉需要删除的元素删除【让元素删除之后index回到删除之前的大小】
            }
        }
        System.out.println(list);
    }
}
