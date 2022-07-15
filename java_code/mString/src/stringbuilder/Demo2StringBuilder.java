package stringbuilder;
/*
     StringBuilder 是一个可变的字符串类，我们可以把它看成是一个容器
     构造方法：
     public StringBuilder() ： 创建一个空白可变字符串对象，不含有任何内容
     public StringBuilder(String   str) ： 根据字符串的内容，来创建可变字符串对象

 */
public class Demo2StringBuilder {
    public static void main(String[]args){
        // public StringBuilder() ： 创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        // public StringBuilder(String   str) ： 根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);
    }
}
