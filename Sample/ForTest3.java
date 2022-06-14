package Sample;
//需求：求1-100之间的偶数和，并把求和结果在控制台输出 }

public class ForTest3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i % 2 == 0){
                sum += i;
            }

        }
        System.out.println("1-100之间的偶数之和为：" +sum);
    }
}
