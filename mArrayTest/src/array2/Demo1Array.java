package array2;

public class Demo1Array {
     /*
        数组静态初始化 : 初始化时指定每个数组元素的初始值，由系统决定数组长度

        完整格式:
                    数据类型[] 数组名 = new 数据类型[]{数据1,数据2,数据3...};
        简化格式:
                    数据类型[] 数组名 = {数据1,数据2,数据3...};
     */
    public static void main(String[] args){
        // 数据类型[] 数组名 = new 数据类型[]{数据1,数据2,数据3...};
        int[] arr1 = new int[]{11, 22, 33};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("---------------");
        int[] arr2 = {11, 22, 33};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
