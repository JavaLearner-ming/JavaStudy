package tempSample;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        System.out.print("请输入称呼：");
        Scanner sc =  new Scanner(System.in);
        String name = sc.next();



        System.out.println(name + "的生日是：4月20日，农历三月初三。");
        System.out.println(name + "的属相是：可爱的老鼠");
        System.out.println(name + "的性别是：女生");
    }
}
