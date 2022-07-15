package constructor;
/*
 执行时机 ：

 * 创建对象的时候调用，每创建一次对象，就会执行一次构造方法
 * 不能手动调用构造方法
 */
public class TestStudent {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        //s1.Student();不能手动调用构造方法 会报错
    }
}
