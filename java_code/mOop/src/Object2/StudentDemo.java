package Object2;
/*
    定义学生测试类
 */
public class StudentDemo {
    public static void main(String[] args){
        // 创建对象 类名 对象名 = new 类名();
        Student stu = new Student();
        // 给成员变量赋值
        stu.name = "林青霞";
        // stu.age = -30;
        stu.setAge(30);// 您输入的年龄有误
        stu.show();// 林青霞...0

        stu.setAge(25);// 未报错
        stu.show();// 林青霞...25
    }
}
