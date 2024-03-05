package atguigu.digui1;

public class exer1 {
    public int f(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
        }

    }
    public int func(int n){
        if (n == 0) {

            return 1;
        }else if (n==1){
            return 2;
        }else {
            return func(n-1)+func(n-2);
        }
    }
}
