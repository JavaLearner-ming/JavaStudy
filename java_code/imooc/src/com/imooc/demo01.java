package com.imooc;

import java.util.Arrays;

/*
功能描述：为指定成绩53分进行加分，直到分数大于等于 60 为止
输出:加分前和加分后的成绩，并统计加分的次数
步骤：
1.定义一个变量，用来保存分数
2.利用循环为成绩加分
3.每次执行循环加1分，并统计加分的次数
 */
public class demo01 {
    public static void main(String[] args){
        int score = 53;//初试分数
        int count = 0;//初始次数
        System.out.println("加分前的分数：" + score);
        while (score < 60) {// 只要成绩小于60，则循环进行加分操作
            score++;//每次循环加1分
            count++;//统计加分次数
        }
        System.out.println("加分后的分数： " + score);
        System.out.println("加分的次数：" + count + "次！");



    }
}
