package stringmethod;
/*
    #### 2.5.1 字符串的比较

- == 比较基本数据类型：比较的是具体的值
- == 比较引用数据类型：比较的是对象地址值

**String类 :  public boolean equals(String s)     比较两个字符串内容是否相同、区分大小写**
 */
public class Demo1Equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";

        // equals : 比较字符串内容, 区分大小写
        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equals(s3));// true

        // equalsIgnoreCase : 比较字符串内容, 忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));// true


    }
}
