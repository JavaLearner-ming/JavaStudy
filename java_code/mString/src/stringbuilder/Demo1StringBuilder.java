package stringbuilder;
/*
    StringBuilder 是一个可变的字符串类，我们可以把它看成是一个容器，这里的可变指的是 StringBuilder 对象中的内容是可变的
    作用：提高字符串的操作效率。
 */
public class Demo1StringBuilder  {
    public static void main(String[] args) {
        //7252
        long star = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 50000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long end = System.currentTimeMillis();
        System.out.println(end-star);
    }

    private static void method() {
        long star = System.currentTimeMillis();//获取19070年1月1日0时0分0秒 到当前时间经过的毫秒值
        System.out.println(star);
        String s = "";
        for (int i = 1; i < 50000; i++) {
            s+=i;
        }
        System.out.println(s);

        long end = System.currentTimeMillis();
        System.out.println(end-star);
    }
}
