package sample;
/*
    需求：键盘录入一个三位数，将其拆分为个位，十位，百位，打印在控制台
    思路：
        1、使用Scanner键盘录入一个三位数
        2、个位的计算：数值 % 10
        3、十位的计算：数值 / 10 % 10
        4、百位的计算：数值 / 100
        5、将个位, 十位, 百位拼接上正确的字符串, 打印即可
 */
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        // 1、使用Scanner键盘录入一个三位数
    Scanner sc = new Scanner(System.in);
    System.out.print("请输入一个三位数：");
    int num = sc.nextInt();
    // 2、个位的计算：数值 % 10
    int ge = num % 10;
    // 3、十位的计算：数值 / 10 % 10
    int shi = num / 10 % 10;
    // 4、百位的计算：数值 / 100
    int bai = num / 100;
        System.out.println("整数" + num + "个位：" + ge);
        System.out.println("整数" + num + "十位：" + shi);
        System.out.println("整数" + num + "百位：" + bai);
    }
}
