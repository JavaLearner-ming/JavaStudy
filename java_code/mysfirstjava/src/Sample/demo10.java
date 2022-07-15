package Sample;

public class demo10 {
    /*
        if 语句：
            格式 ：
            if( 关系表达式 ){执行语句体
            }
            注意书写规范，建议先写结构再填入表达式，和执行语句体，最后执行其他语句。
            --------------------------------------------
            如果if后面关系表达式的结果为true , 则执行后面的语句。
            如果if后面关系表达式的结果为false , 则不会执行后面的语句体，会直接执行其他语句。
            注意： if后面的表达式不能加 " ; " ===>>>  if (a > 10 );{ }【多了分号算分家了，上面的语句不会影响下面语句的执行】
            PS: if语句所控制的执行语句体如果是一条语句，后面的{ }可以省略不写，
                但是一般不建议这样写，因为难以判断后面是几条语句
                比如说： int a = 10 ;[这是两条语句：1、定义变量 a 算1条 2、赋值变量值= 10 算1条]。
     */
    public static void main(String[] args) {
        // true
        System.out.println("开始");
        int age1 = 18;
        if(age1 >= 18) {
            System.out.println("可以上网吧");
        }

        System.out.println("结束");
        System.out.println("=====================");
        // false 不执行后面执行语句体
        System.out.println("开始");
        int age2 = 16;
        if(age2 >= 18) {
            System.out.println("可以上网吧");
        }

        System.out.println("结束");
    }

    public static class demo11 {
        /*
            if 语句格式2
            if(关系表达式){
            语句体1
            }else{
            语句体2
            };
         */
        public static void main(String[] args) {
            int score = 95;
            if( score > 90 ){
                System.out.println("考的不错，奖励一顿麦当劳！");
            }else{
                System.out.println("考的不行，爱一顿揍吧！");
            }
        }

    // 定义一个在0~100之间的变量a, 90~100优秀，80~89良好，70~79中等，60~69及格，0~59请努力加油！
        public static class demo3If {
            public static void main(String[] args) {
                int score = 68;
                if(score >= 90 && score <= 100){
                    System.out.println("优秀");
                } else if (score >= 80 && score <= 89) {
                    System.out.println("良好");
                } else if (score >= 70 && score <= 79) {
                    System.out.println("中等");
                } else if (score >= 60 && score <=69 ) {
                    System.out.println("及格");
                } else if (score >= 0 && score <= 59) {
                    System.out.println("请努力加油");
                }else{
                    System.out.println("成绩有误！");
                }
            }
        }
    }
}
