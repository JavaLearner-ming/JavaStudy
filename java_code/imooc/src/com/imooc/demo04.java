package com.imooc;

import sun.lwawt.macosx.CSystemTray;

import java.util.Arrays;
import java.util.Scanner;

/*
功能：实现接收三个班级的各四位学生的成绩信息，然后计算每个班级学生的平均分
知识点：二重循环 ， 外层循环控制班级数量，内层循环控制学员数量
 */
public class demo04 {
    public static void main(String[] args) {
        int classNum = 3;//班级数量
        int stuNum = 4;//每个班级学生数量
        int sum = 0;//每个班级成绩的总和
        double avg = 0;//成绩平均分
        for(int i = 1 ; i <= classNum ; i++ ){
            System.out.println("***请输入第" + i + "个班级的成绩***");
            sum = 0;//每进入一个新的班级时 sum的值为0 就可以避免sum是一直累加的
            for(int j = 1 ; j <= stuNum ; j++){
                System.out.print("请输入第" + j + "个学生的成绩：");
                int score = new Scanner(System.in).nextInt();
                  System.out.println("学生的成绩：" + score);
                sum = sum + score;//成绩累加求和
            }
            avg = sum / stuNum;
            System.out.println("第" + i + "个班级学生的平均分为：" + avg);

        }

    }
}
