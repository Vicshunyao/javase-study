package com.atguigu1.one.exer3;

public class arrayexer04 {
    public static void main(String[] args) {
    ///数组扩容
        int[]arr=new int[]{11,2,3,4,5};
        //扩容一倍容量
        int[]newarr=new int[arr.length<<1];
        //赋值
        for (int i = 0; i < arr.length; i++) {
            newarr[i]=arr[i];

        }
        newarr[arr.length]=10;
        newarr[arr.length+1]=20;
        newarr[arr.length+2]=30;

        arr=newarr;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
