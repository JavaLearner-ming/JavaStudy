package Object1;
// 测试类的代码格式
public class TestStudent {
     /*
        创建对象的格式:
                类名 对象名 = new 类名();
        调用成员变量的格式:
                对象名.变量名
        调用成员方法的格式:
                对象名.方法名();
     */
     public static void main(String[] args) {
         Student stu = new Student();
         //  创建对象
         // 默认初始化值
         System.out.println(stu.name);// null
         System.out.println(stu.age);// 0
         // 对象名.变量名【调用成员变量】
         stu.name = "张三";
         stu.age = 23;

         System.out.println(stu.name);  // 张三
         System.out.println(stu.age);   // 23

         // 对象名.方法名();【调用成员方法】
         stu.study();
         // Object1.Student@1540e19d
         // 全类名(包名 + 类名)
         System.out.println(stu);
     }



}
