package DemoArray;
/*
        问题: 二维数组中存储的是一维数组, 那能不能存入 [提前创建好的一维数组] 呢 ?
        答 : 可以的
     */
public class Demo2Array {
    public static void main(String[] args) {
        // 1.创建3个一维数组
        int[] arr1 = {11,22,33};
        int[] arr2 = {44,55,66};
        int[] arr3 = {77,88,99};
        // 2，导入二维数组
        int[][] arr = new int [3][3];
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        // 打印二维数组中数据验证是否存储成功
        System.out.println(arr[0][1]);
        System.out.println(arr[1][2]);
        // 输出 arr1 中的第2个元素，arr2中第三个元素，说明存储成功了
    }
}
