package api;

import java.util.Scanner;

public class Demo1Scanner {
    public static void main(String[] args) {
        /*
        next() : 遇到了空格, 就不再录入数据了

                结束标记: 空格, tab键

        nextLine() : 可以将数据完整的接收过来

                结束标记: 回车换行符
         */
    // 1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        // 2.调用nextline方法接收字符串
        // 快速生成方法的返回值 快捷键 ctrl alt +v   mac : alt command + v
        String s = sc.nextLine();

        System.out.println(s);
    }
}
