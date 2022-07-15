package api;
import java.util.Scanner;
public class Demo2Scanner {
    /*
        nextInt和nextLine方法配合使用的时候, nextLine方法就没有键盘录入的机会了

        建议: 今后键盘录入数据的时候, 如果是字符串和整数一起接受, 建议使用next方法接受字符串.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int i = sc.nextInt();// 输入了10 + 回车换行【nextLine刚要执行就看到了回车换行 结束了，所以没执行】
        System.out.println("请输入字符串");
        //String s = sc.nextLine();
        String s = sc.next();

        System.out.println(i);
        System.out.println(s);

    }
}
