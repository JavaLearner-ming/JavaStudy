package DemoArray;
/*
    二维数组的静态初始化：
       完整格式：数据类型[][] 变量名 = new 数据类型[][]{ {元素1, 元素2...} , {元素1, 元素2...} ...};

       简化格式: 数据类型[][] 变量名 = { {元素1, 元素2...} , {元素1, 元素2...} ...};
    */
public class Demo3Array {
    public static void main (String[] args){
        int[] arr1 = {11,22,33,44};
        int[] arr2 = {55,66,77,88,99};
        int[][] arr ={{11,22,33,44},{55,66,77,88,99}};
        System.out.println(arr[0][2]);

        // 也可以先创建一位数组，再把一位数组直接放进去
        int[][] array = {arr1,arr2};
        System.out.println(array[0][2]);
    }
}
