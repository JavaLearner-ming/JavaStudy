package list;

import java.util.ArrayList;

/*
    ArrayList类常用方法【应用】

      集合常用成员方法 :

        添加：
            boolean add(E e)   将指定的元素追加到此集合的末尾
            void add(int index,E element)  在此集合中的指定位置插入指定的元素
        删除：
            public boolean remove(Object o)  删除指定的元素，返回删除是否成功
            public E remove(int index)   删除指定索引处的元素，返回被删除的元素
        修改：
            public E set(int index,E element)  修改指定索引处的元素，返回被修改的元素
        查询：
            public E get(int index)  返回指定索引处的元素
            public int size()  返回集合中的元素的个数

 */
public class Demo2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        // public E get(int index)  返回指定索引处的元素
        String s1 = list.get(0);
        String s2 = list.get(1);
        String s3 = list.get(2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // public int size()  返回集合中的元素的个数
        int size = list.size();
        System.out.println(size);


    }

    private static void testSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        // public E set(int index,E element)  修改指定索引处的元素，返回被修改的元素
        String s = list.set(0, "666");
        System.out.println(s);

        System.out.println(list);
    }

    private static void testRemove() {
        // 1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        // 2.调用集合对象的add方法添加元素
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        // public boolean remove(Object o)  删除指定的元素，返回删除是否成功
        boolean b1 = list.remove("abc");// 删除成功输出true
        boolean b2 = list.remove("zzz");// 不存在的元素无法执行删除 输出false
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(list);

        // public E remove(int index)   删除指定索引处的元素，返回被删除的元素
        String b3 = list.remove(0);
        System.out.println(b3);
        System.out.println(list);
    }
}
