package stringbuilder;
/*
    成员方法：
        public StringBuilder   append(任意类型)  ：  添加数据，并返回对象本身
        public StringBuilder   reverse()       ：  返回相反的字符序列
        public int length()     : 返回长度（字符出现的个数）
        public String toString()  : 通过 toString 可以把 StringBuilder 转为String【打印内容相同，类型转变】
 */
public class Demo3StringBuilder {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder();
//        sb.append(123);
//        sb.append("ABC");
//        sb.append(true);
//        System.out.println(sb);  输出：123ABCtrue
//        sb.append("红色");
//        System.out.println(sb);//输出： 红色
//        sb.append("蓝色");
//        System.out.println(sb);//输出： 红色蓝色
//        sb.append("黄色");
//        System.out.println(sb);//输出： 红色蓝色黄色

        // public StringBuilder   append(任意类型)  ：  添加数据，并返回对象本身
//        StringBuilder sb2 = sb.append("红色");
//        StringBuilder sb3 = sb.append("蓝色");
//        System.out.println(sb);
//        System.out.println(sb2);
//        System.out.println(sb3);
//        System.out.println(sb==sb2);// true
//        System.out.println(sb2==sb3);// true
//
        sb.append("红色").append("蓝色").append("黄色");//链式编程  如果一个方法返回的是对象类型，对象就可以继续向下调用方法
        System.out.println("反转前："+ sb);

        // public StringBuilder   reverse()       ：  返回相反的字符序列
        sb.reverse();
        System.out.println("反转后："+sb);

        // public int length()     : 返回长度（字符出现的个数）
        System.out.println("sb中字符的个数位为："+sb.length());

        // public String toString()  : 通过 toString 可以把 StringBuilder 转为String【打印内容相同，类型转变】
        String s = sb.toString();
        System.out.println(s);

    }

}
