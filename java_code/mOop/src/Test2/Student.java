package Test2;

/*
    创建学生类
 */
public class Student {
    // 成员变量
    private String name;
    private int age;

    // get/set方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("您输入的年龄有误解");
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "..." + age);
    }
}
