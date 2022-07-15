package Test1;

/*
 **需求 ：**首先定义一个手机类，然后定义一个手机测试类，在手机测试类中通过对象完成成员变量和成员方法的使用
 */
// 定义手机类
public class Phone {
    // 品牌，价格
    String brand;
    int price;

    // 打电话, 发短信
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }
    public void sendMessage() {
        System.out.println("群发短信");
    }
}
