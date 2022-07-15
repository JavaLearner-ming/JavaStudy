package test;

import java.util.Scanner;

/*
    需求：键盘接收一个字符串，程序判断出该字符串是不是对称字符串，并在控制台打印是或不是。
    对称字符串： 12321、111
    非对称字符串： 123123


    思路：
        1.键盘录入一个字符串，用Scanner实现
        2.将字符串进行反转
        3.将反转后的字符串和原字符串进行对比
        4.如果结果相同则输出是对称字符串，如果结果不同则输出不是对称字符串


 */
public class Test8 {
    public static void main(String[]args){
        //  1.键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        // 2.将字符串进行反转[需要先将字符串封装为StringBuilder对象]
        // 将字符串封装为StringBuilder对象,目的是为了调用其反转的方法
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reverseStr = sb.toString();// 这一步很重要
        // s——String类型
        // sb——StringBuilder类型
        // 两个类型不同即使内容相同也不可能相等，所以需要把StringBuilder类型用toString方法转变成String类型
        if(s.equals(reverseStr)){
            System.out.println("是对称字符串");
        }else{
            System.out.println("不是对称字符串");
        }


    }
}
