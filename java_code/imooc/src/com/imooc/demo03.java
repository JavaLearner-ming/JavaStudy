package com.imooc;

import java.util.Arrays;
import java.util.Scanner;

/*
使用Scanner工具类接收用户输入的信息
固定格式为：
String 变量 = new Scaneer(System.in).next();
或者
int 变量 = new Scaneer(System.in).nextInt();
 */
public class demo03 {
    public static void main(String[] args){
        /*int num = new Scanner(System.in).nextInt();
        System.out.println("您输入的数字：" + num);
         */
        System.out.print("请输入用户初始分数：");//加入提示
        int score = new Scanner(System.in).nextInt();//初始分数
        int count = 0;//初始次数
        System.out.println("加分前的分数：" + score);
        while (score <= 60) {// 只要成绩小于60，则循环进行加分操作【此处改动一下变<=,多执行以此循环以供调试做案例】
            score++;//每次循环加1分
            count++;//统计加分次数
        }
        System.out.println("加分后的分数： " + score);
        System.out.println("加分的次数：" + count + "次！");



    }
}