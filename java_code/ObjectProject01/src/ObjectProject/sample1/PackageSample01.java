//package 关键字说明当前类归属于哪个包
//package 后面的包名与实际存储的目录要保持一致
package ObjectProject.sample1;

public class PackageSample01 {
    //public 代表其他任何类都能访问的成员变量
    public String name;
    //private 代表只能在当前类中使用
    private  void sayHello(){
        System.out.println("Hello World!");
    }
    //不写访问修饰符代表默认修饰符，表示只能被包中其他类访问
    void sayGoodbye(){
        System.out.println("Good bye!");
    }
    //开始测试在PackageSample01中新增main方法
    public static void main(String[] args){
        PackageSample01 packageSample01 = new PackageSample01();//实例化 PackageSample01
        packageSample01.sayHello();
    }
}
