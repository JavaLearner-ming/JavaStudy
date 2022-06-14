package Sample;

/*
    需求：打印5次 我最爱吃糖醋排骨
    注意： do while 循环至少会打印一次。【先执行，再判断】
 */
public class doWhile {
    public static void main(String[] args) {
//        for(int i=1; i<=5; i++){
//            System.out.println("我最爱吃糖醋排骨");
//        }
        int i = 1;
        do {
            System.out.println("我最爱吃糖醋排骨");
            i++;
        } while (i <= 5);
    }
}

