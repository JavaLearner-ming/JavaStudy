package Sample;

public class demo3 {
    public static void main(String[] args) {

        //例子1 需要强转
        short s = 1;
        //s = s + 1;
        /*  s 是 short 数据类型 此运算实则为 short + int ,在此运算中 short需要先转为int 才能进行运算
            变成 short = short + int ===> short = int + int
            其中 int + int 结果还是 int 数据类型
            所以变成 short = int ===>  错误点：int 给 short 类型赋值【不兼容的类型，int 转为 short 会有损失】
            【int 大 ， short 小】 大给小赋值 需要强转
        */
        s = (short)(s + 1);// 把右边整体强转成 short 数据类型
        System.out.println(s);// 运行成功，结果：2

        //例子2 自带强转
        short ss = 1;
        ss += 1; // "ss += 1" 等效于 "ss = (short)(ss + 1)" 所以无需再强转
                 //注意扩展赋值运算符，底层会自带强转功能
        System.out.println(ss);// 结果：2

    }
}
