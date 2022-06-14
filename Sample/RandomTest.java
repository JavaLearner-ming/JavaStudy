package Sample;
/*
    需求：

程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？

当猜错的时候根据不同情况给出相应的提示

A. 如果猜的数字比真实数字大，提示你猜的数据大了

B. 如果猜的数字比真实数字小，提示你猜的数据小了

C. 如果猜的数字与真实数字相等，提示恭喜你猜中了
 */

/*
		需求：程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
			当猜错的时候根据不同情况给出相应的提示
			如果猜的数字比真实数字大，提示你猜的数据大了
			如果猜的数字比真实数字小，提示你猜的数据小了
			如果猜的数字与真实数字相等，提示恭喜你猜中了

		1. 准备Random和Scanner对象, 分别用于产生随机数和键盘录入
		2. 使用Random产生一个1-100之间的数, 作为要猜的数
		3. 键盘录入用户猜的的数据
		4. 使用录入的数据(用户猜的数据)和随机数(要猜的数据)进行比较, 并给出提示

		5. 以上内容需要多次进行, 但无法预估用户输入几次可以猜测正确, 使用while(true)死循环包裹
		6. 猜对之后, break结束.

	*/

import java.util.Scanner;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        // 1. 准备Random和Scanner对象, 分别用于产生随机数和键盘录入
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        // 2. 使用Random产生一个1-100之间的数, 作为要猜的数
        int randomNum = r.nextInt(100) + 1;
        while (true) {
            //  3. 键盘录入用户猜的的数据
            System.out.println("请输入数字：");
            int num2 = sc.nextInt();
            // 4. 使用录入的数据(用户猜的数据)和随机数(要猜的数据)进行比较, 并给出提示
            if (num2 > randomNum) {
                System.out.println("猜大了！");
            } else if (num2 < randomNum) {
                System.out.println("猜小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
        System.out.println("感谢您的使用！");
    }
}
