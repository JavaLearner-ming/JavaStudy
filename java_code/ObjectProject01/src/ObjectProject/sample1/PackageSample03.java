package ObjectProject.sample1;

import ObjectProject.sample2.PackageSample02;

public class PackageSample03 {
    public static void main(String[] args) {
        PackageSample01 packageSample01 = new PackageSample01();//同一个包下的类无需import导入
        PackageSample02 packageSample02 = new PackageSample02();//不同包下的类IDEA可以自动辅助导入包

        packageSample01.name = "Lily";
        packageSample01.sayGoodbye();
    }
}