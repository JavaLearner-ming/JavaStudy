package Sample;

import java.util.Scanner;
public class demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是周几：");
        int week = sc.nextInt();
        switch (week){
            case 1 :
                System.out.println("今天吃红烧肉!");
                break;
            case 2 :
                System.out.println("今天吃酸菜鱼!");
                break;
            case 3 :
                System.out.println("今天吃红烧鸡块!");
                break;
            case 4 :
                System.out.println("今天吃糖醋里脊！");
                break;
            case 5 :
                System.out.println("今天吃红烧牛腩！");
                break;
            case 6 :
                System.out.println("今天出去吃小炒黄牛肉！");
                break;
            case 7 :
                System.out.println("今天回乡下吃妈妈做的饭！");
                break;
            default:
                System.out.println("你输入的有误！");
        }
    }
}
