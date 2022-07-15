package Object2;

/*
    定义学生类
 */
public class Student {
    // 成员变量
    String name;
    private int age;

    // 设置值set
    public void setAge(int a) {
        if (a >= 0 && a <= 120) {
            age = a;
        } else {
            System.out.println("您输入的年龄有误");
        }
    }

    // 获取值get
    public int getAge() {
        return age;
    }

    // 成员方法
    public void show() {
        System.out.println(name + "..." + age);
    }
}
