
package ObjectProject.sample4;


import  java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个三位数：");
        int num = sc.nextInt();
        int ge = num % 10;// 123 % 10 = 3
        int shi = num / 10 % 10;// 123 / 10 = 12, 12 % 10 = 2
        int bai = num / 100;
        System.out.println("整数" + num +"的个位是：" + ge);
        System.out.println("整数" + num +"的十位是：" + shi);
        System.out.println("整数" + num +"的百位是：" + bai);


    }
}
