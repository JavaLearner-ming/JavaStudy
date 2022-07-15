package Sample;

public class demo8 {
    /*
        三元运算符：
            格式： 关系表达式? 表达式1 : 表达式2;
            执行流程：
                首先计算关系表达式的值
                如果值为true,取表达式1 的值
                如果值为false,取表达式2 的值

            需求: 求两个变量的最大值
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max =  a > b ? a : b;
        System.out.println("max:" + max);

        int c = 10;
        int d = 20 ;
        int min = c < d ? c : d;
        System.out.println("min:" + min);

        // 变一种写法
//        int c = 10;
//        int d = 20 ;
//        int min = c > d ? d : c;
//        System.out.println("min:" + min);
    }
}
