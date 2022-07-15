package Sample;
/*
    需求：用 while 在控制台打印1-10之前所有的数,比较和for的区别
 */
public class WhileTest1 {
    public static void main(String[] args){
//        for(int i=1; i<=10; i++){
//            System.out.print(i + " ");
//        }
       int i = 1;
       while(i <= 10){
            System.out.print(i + " ");
            i++;
       }
    }
}
