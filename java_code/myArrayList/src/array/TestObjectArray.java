package array;

import domain.Student;

/*
    需求:将(张三23)(李四，24)(王五，25)封装为3个学生对象并存入数组
    随后遍历数组，将学生信息输出在控制台


    思路:
        1. 定义学生类准备用于封装数据
        2. 动态初始化长度为3的组，类型为Student类型
        3. 根据需求创建3个学生对象
        4. 将学生对象存入数组
        5. 遍历数组，取出每一个学生对象
        6. 调用对象的getX方法获取学生信息，并输出在控制台

 */
public class TestObjectArray {
    public static void main(String[] args) {
        // 2. 动态初始化长度为3的组，类型为Student类型
        /* int[]arr = new int[3]; 先创建 int类型 再把int改成Student【不是同一个包，要是用别的包的类，需要导包 】
            导包快捷键： 光标放在类名前面 alt + 回车 选择 import class
            IDEA 自动导包
         */

        // 3. 根据需求创建3个学生对象
        Student[] arr = new Student[3];
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 24);
        Student stu3 = new Student("王五", 25);

        // 4. 将学生对象存入数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        // 5. 遍历数组，取出每一个学生对象
        for (int i = 0; i < arr.length; i++) {
            Student temp = arr[i];
            System.out.println(temp.getName() + "..." + temp.getAge());
        }


    }
}
