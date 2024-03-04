package atguigu;

public class valueTransferTest {
    public static void main(String[] args) {
        //基本数据类型局部变量
        int m=10;
        int n=m;
        System.out.println("m="+m+",n="+n);
        m++;
        System.out.println("m="+m+",n="+n);
    }
}
