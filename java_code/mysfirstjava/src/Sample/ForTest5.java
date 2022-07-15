package Sample;

	/*
		需求：在控制台输出所有的“水仙花数”，要求每行打印2个

		System.out.print (打印内容);	打印后不换行
		System.out.println(打印内容);	打印后换行

		分析:

			1. 定义变量count，用于保存“打印过”的数量，初始值为0
			2. 在判定和打印水仙花数的过程中，拼接空格, 但不换行，并在打印后让count变量+1，记录打印过的数量
			3. 在每一次count变量+1后，判断是否到达了2的倍数，是的话，换行。

	*/

public class ForTest5 { public static void main(String[] args) {
    // 定义变量count，用于保存“打印过”的数量，初始值为0
    int count = 0;
    //输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
    for(int i=100; i<=999; i++) {
        //在计算之前获取三位数中每个位上的值
        int ge = i % 10;
        int shi = i / 10 % 10;
        int bai = i / 10 / 10 % 10;
        //判定条件是将三位数中的每个数值取出来，计算立方和后与原始数字比较是否相等
        if((ge*ge*ge + shi*shi*shi + bai*bai*bai == i )) {
            //输出满足条件的数字就是水仙花数
            //在判定和打印水仙花数的过程中，拼接空格, 但不换行，并在打印后让count变量+1，记录打印过的数量
            System.out.print(i +" ");
            count++;
            //在每一次count变量+1后，判断是否到达了2的倍数，是的话，换行。
            if(count % 2 == 0){
                System.out.println();
                }
            }
        }
    }
}
