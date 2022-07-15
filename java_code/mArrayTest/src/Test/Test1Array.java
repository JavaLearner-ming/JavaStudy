package Test;

public class Test1Array {
    public static void main(String[] args){
        // 定义数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
//        for(int i = 0; i < 7; i++){
//            System.out.print(arr[i]);
//        }
        System.out.println("数组arr中的元素个数为:" + arr.length + "个");
        // 使用通用的遍历格式
        for(int i = 0;i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
