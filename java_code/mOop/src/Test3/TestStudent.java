package Test3;

public class TestStudent {
    public static void main(String[]args){
        // 1.无参构造方法创建对象，通过set方法进行成员变量赋值
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(22);
        stu1.show();

        // 2.通过带参数构造方法，直接给属性进行赋值
        Student stu2 = new Student("张三",22);
        stu2.show();
    }
}