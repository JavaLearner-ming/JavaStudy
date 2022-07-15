package Sample;
import java.util.Scanner;
public class demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入考试成绩：");
        int score = sc.nextInt();
        if(score >= 0 && score <= 100){
            if(score >= 95 && score <= 100){
                System.out.println("奖励一辆自行车！");
            } else if (score >= 90 && score <= 94) {
                System.out.println("奖励游乐园玩一天！");
            } else if (score >=80 && score <= 89) {
                System.out.println("奖励肯德基一顿！");
            }else{
                System.out.println("没有奖励，挨妈妈一顿打吧，爸爸无能为力！");
            }
        }else{
            System.out.println("输入的成绩不对啊！");
        }
    }
}
