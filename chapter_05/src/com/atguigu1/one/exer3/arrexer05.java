package com.atguigu1.one.exer3;

public class arrexer05 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int deleteIndex=4;
        for (int i = deleteIndex; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }

        arr[arr.length-1]=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
