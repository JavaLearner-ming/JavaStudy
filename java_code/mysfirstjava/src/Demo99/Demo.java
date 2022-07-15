package Demo99;
/*
    需求：写一个99乘法表
    使用for循环嵌套思想
 */
public class Demo {
    public static void main(String[]args){
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + "X" + j + "=" +(i*j) + "\t");
            }
            System.out.println();
        }
    }
}
