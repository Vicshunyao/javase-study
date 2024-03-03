package com.atguigu1.one.exer3;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[]arr=new int[]{1,52,12,55,23,58,7,49};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        
        //冒泡排序O(n^2)
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        //快速排序



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"\t");
//        }
        System.out.println(Arrays.toString(arr));

    }
}
