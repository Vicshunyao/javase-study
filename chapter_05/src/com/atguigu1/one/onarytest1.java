package com.atguigu1.one;

public class onarytest1 {
    public static void main(String[] args) {
        int [] arr1=new int[3];
        //默认初始化值，整型，浮点型，字符型；布尔，引用
        System.out.println(arr1[1]);
        short[] arr2 =new short[5];
        //double 0.0
        double[] arr3=new double[3];
        System.out.println(arr3[0]);
        //char 0
        char[] arr5=new char[5];
        if (arr5[0]=='0'){
            System.out.println(arr5[0]);
        }
        System.out.println("ss");
        boolean[] arr6 =new boolean[2];
        System.out.println(arr6[1]);
        //String null
        String[] arr7=new String[5];
        for (int i=0;i<arr7.length;i++){
            System.out.println(arr7[i]);
        }

        //数组内存解析
        int[] a1 =new int[]{1,23,3};
        int[] a3 =new int[]{1,2321,3};
        int []a2=a1;
        a2[1]=2;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
