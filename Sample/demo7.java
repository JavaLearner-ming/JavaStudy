package Sample;

public class demo7 {
    /*
        短路逻辑运算符
            & —— 逻辑与
            && —— 短路与
            | —— 逻辑或
            || —— 短路或
            & 和 && 的区别：
                & ：无论符号左边是true还是false,右边都要执行。
                &&：具有短路效果，符号左边为false 右边就不执行了。
                    如果左边符号为true,右边要继续执行。
                | : 无论符号左边真假，右边都要执行。
                || : 如果左边为假,右边执行;如果左边为真,右边不执行。
     */
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        //false & true  ====>>>false
        System.out.println(++x > 4 & y-- <5);
        System.out.println("x=" + x);// 4
        System.out.println("y=" + y);// 3

        x = 3;
        y = 4;
        System.out.println(++x > 4 && y-- < 5);
        System.out.println("x=" + x);// 4
        System.out.println("y=" + y);// 4



    }
}
