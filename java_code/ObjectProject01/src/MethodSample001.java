public class MethodSample001 {
    public int getSumOfSquares(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++ ) {
            sum += i * i;//求i的平方，并赋值给sum。
        }
        return sum;
        }
    public static void main(String[] args){
        MethodSample001 methodSample001 = new MethodSample001();//实例化对象MethodSample001
        int sumOfSquares = methodSample001.getSumOfSquares(11);//调用对象下的getSumOfSquares方法，用getSumOfSquares返回结果
        System.out.println("1到11的平方值累加之和为：" + sumOfSquares);

    }
}

