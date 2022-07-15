package stringmethod;
/*
    知识点：substring
        返回一个新的字符串，它是此字符串的一个子字符串。该子字符串从指定索引处的字符开始，直到此字符串末尾。
        public String substring(int beginIndex,int endIndex)
        从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。因此，该子字符串的长度为 endIndex-beginIndex。
        【包含头，不含尾】

    需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
        最终效果为：156****1234

        思路：
        1. 键盘录入一个字符串，用 Scanner 实现
        2. 截取字符串前三位
        3. 截取字符串后四位
        4. 将截取后的两个字符串，中间加上****进行拼接，输出结果
 */

import java.util.Scanner;

public class Demo2Substring {
    public static void main(String[] args) {
//        String a = "zhangsan";
//        String substring = a.substring(2);
//        System.out.println(substring);// angsan
//        String s1 = a.substring(0, 2);// zh
//        System.out.println(s1);
        // 1. 键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String telString = sc.nextLine();
        // 2. 截取字符串前三位
        String star = telString.substring(0, 3);
        // 3. 截取字符串后四位
        String end = telString.substring(7);
        // 4. 将截取后的两个字符串，中间加上****进行拼接，输出结果
        System.out.println(star + "****" + end);

    }
}
