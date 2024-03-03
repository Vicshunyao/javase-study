package com.atguigu1.one;

public class onearry {
    public static void main(String[] args) {
        int num1=10;
        int num2;
        num2=20;
        //todo 数组初始化
        double[] prices;
        prices=new double[]{20.32,43.21,43.22,222.23};//静态
        String []food;
        food=new String[4];//动态
        int []arr1={1,2,3,4};
        //数组调用
        System.out.println(prices[0]);
        food[1]="ddd";
        //数组长度
        System.out.println(food.length);

        //数组遍历
        for (int i=0;i<prices.length;i++){
            System.out.println(prices[i]);
        }



    }
}
