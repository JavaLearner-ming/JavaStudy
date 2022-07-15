package test;

import domain.Student;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[]args){
        ArrayList<Student>list = new ArrayList<>();
        Student stu1 = new Student("ceshi001","张三",23,"1999-11-11");
        Student stu2 = new Student("ceshi002","李四",43,"1994-10-01");
        Student stu3= new Student("ceshi003","王五",18,"1998-08-01");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int index1 = getIndex(list,"ceshi001");
        int index2 = getIndex(list,"ceshi009");
        System.out.println(index1);// 0
        System.out.println(index2);

    }
    public static int getIndex(ArrayList<Student>list,String sid){
        // 1. 假设传入的学号, 在集合中不存在
        int index = -1;
        // 2. 遍历集合, 获取每一个学生对象, 准备进行查找
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            // 3. 获取每一个学生对象的学号
            String id = stu.getSid();
            // 4. 使用获取出的学生学号, 和传入的学号(查找的学号)进行比对
            if(id.equals(sid)){
                // 存在: 让index变量记录正确的索引位置
                index = i;

            }
        }
        return index;
    }
}
