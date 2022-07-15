package test;

import java.util.ArrayList;

/*
    案例需求 :
        创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建集合对象
        3:创建学生对象
        4:添加学生对象到集合中
        5:遍历集合，采用通用遍历格式实现
 */
public class Test2 {
    public static void main(String[]args){
        // 1:创建集合对象
        ArrayList<String> list = new ArrayList<>();
        // 2:往集合中添加字符串对象
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        // 3:遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
        for (int i = 0; i < list.size(); i++) {
            // i : 每一个索引值
            String s = list.get(i);
            System.out.println(s);

        }

    }
}
