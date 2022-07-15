package constructor2;
/*
  格式注意
    方法名与类名相同，大小写也要一致
    没有返回值类型，连void都没有
    没有具体的返回值（不能由 retrun 带回结果数据）
 */
public class Student {
    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("我是Student类中的构造方法");
    }
    public void show(){
        System.out.println(name + "..." + age);
    }
}
