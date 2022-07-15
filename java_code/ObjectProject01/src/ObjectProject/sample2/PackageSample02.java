package ObjectProject.sample2;
//import 关键字用于导入其他包的类
import ObjectProject.sample1.PackageSample01;

public class PackageSample02 {
    public static void main(String[] args) {
        PackageSample01 packageSample01 = new PackageSample01();//要使用其他包下的类必须事先导入import
 //       packageSample01.sayGoodbye();  这个调用了非公开的sayGoodbye 所以会报错，sayGoodbye 是 void 的默认修饰符
    }
}
