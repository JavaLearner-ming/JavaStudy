package Sample;

/*
    案例：三个和尚
        需求： 一座庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm,请用程序实现获取这三个和尚的最高身高。
        分析：
            1、定义三个变量用于保存和尚的身高，单位为cm，这里仅体现数值即可。
                int height1 = 150;
                int height2 = 210;
                int height3 = 165;
            2、用三元运算符，比较前两个变量，获取较大值。
                int tempHeight = (height1 > height2) ? height1 : height2;
            3、用三元运算符，让较大值与第三个变量比较，获取最大值。
                (tempHeight > height3) ? tempHeight : height3;
 */
public class demo9 {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int tempMax = (height1 > height2) ? height1 : height2;
        int Max = tempMax > height3 ? tempMax : height3;
        System.out.println("maxHeight:" + Max + "cm");

//        int result = (height1 > height2) ? height1 : height2 > height3 ? (height1 > height2) ? height1 : height2 : height3;
//        System.out.println("maxHeight:" + result +"cm");
        // 虽然同样可以执行得到正确的结果，但是不建议用此种方法，不便于阅读代码。
    }
}
