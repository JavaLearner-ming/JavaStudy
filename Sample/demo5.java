package Sample;

public class demo5 {
    /*
        逻辑运算符的作用： 用于【整合】多个表达式的条件
            1、连接多个表达式
            2、连接ture或false
            
        最终得到的结果都是boolean类型的ture或false
        
        逻辑运算符：
        在数学中，一个数x,大于5,小于20,可以这样表示： 5 <x< 20;
        在Java中，需要把式子先拆解,再合并;
        ===>>> 拆解为： x>5 和 x<20;
        ===>>> 合并为： x>5 & x<20;
     */
    public static void main(String[] args) {
        int x = 10;
                           //ture & ture
        System.out.println(x > 5 & x <15);// 结果 : ture
    }
}
