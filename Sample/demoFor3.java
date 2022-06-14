package Sample;

/*
 * 需求：求1-5之间的数据和，并把求和结果在控制台输出
 * 示例代码：
 */
public class demoFor3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=5; i++) {
            sum += i;
        }
            System.out.println("数据1-5的和为：" +sum);
        }
    }

