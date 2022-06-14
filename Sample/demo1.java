package Sample;
/*
    自增自减运算符
    1、单独使用时：
            ++/-- 不管在前在后都是直接进行运算，结果都一样
    2、参与操作时：
            ++/-- 在前：先对该变量进行自增(++)/自减(--)，再拿变量进行操作
            ++/-- 在后：先拿变量原本的值取出来进行操作，再对该变量进行自增(++)/自减(--)
    3、最常见用法：单独使用
    4、注意事项： ++/-- 只能操作变量不能操作常量
 */
public class demo1 {
    public static  void main(String[] args){
        int c = 10;
        c++;// 同 ++c
        System.out.println(c);//11
        c--;// 同 --c
        System.out.println(c);//10

        int a = 10;
                    // b = 10
        int b = a++;// ++/-- 在前，先自增/减，再赋值； ++/-- 在后，先赋值，再自增/减；
        System.out.println(a);//11
        System.out.println(b);//10

        int aa = 10;
        int bb = --aa;// ++/-- 在前，先自增/减，再赋值； ++/-- 在后，先赋值，再自增/减；
        System.out.println(aa);//9
        System.out.println(bb);//9

        int num = 123;
        System.out.println(num++);// 123
        System.out.println(num);// 124

//        System.out.println(10++);// 意外的类型，只能操作变量 ，不能操作常量
    }
}


