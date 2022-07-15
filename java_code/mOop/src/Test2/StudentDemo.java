package Test2;

/*
 *定义标准的学生类，要求name和age使用private修饰
 * 并提供set和get方法以及便于显示数据的show方法
 * 测试类中创建对象并使用，最终控制台输出 林青霞，30

 */
// 学生测试类
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student stu = new Student();
        //使用set方法给成员变量赋值
        stu.setName("林青霞");
        stu.setAge(30);

        // 调用方法
        stu.show();


        //使用get方法获取成员变量的值
        System.out.println(stu.getName() + "---" + stu.getAge());
        System.out.println(stu.getName() + "," + stu.getAge());
    }
}
