package Sample;
/*需求：

        程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？

        当猜错的时候根据不同情况给出相应的提示

        A. 如果猜的数字比真实数字大，提示你猜的数据大了

        B. 如果猜的数字比真实数字小，提示你猜的数据小了

        C. 如果猜的数字与真实数字相等，提示恭喜你猜中了
*/
import  java.util.Scanner;
import java.util.Random;
public class numberGame {
    public static void main(String[] args) {
        // 1. 准备Random和Scanner对象, 分别用于产生随机数和键盘录入
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum = r.nextInt(100) + 1;


    }

}
