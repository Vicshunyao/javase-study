package com.atguigu1.one.exer3;

public class arrayExer01 {
    public static void main(String[] args) {
        //动态创建数组
        int[]arr =new int[10];

        //t通过循环赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*(99-10+1)+10);
            System.out.println(arr[i]);

        }
        //
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("最大值"+max);
        //最小值
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("最小值"+min);
        //综合
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        System.out.println("综合"+sum);

    }
}
