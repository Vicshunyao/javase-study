package com.atguigu1.one.exer3;

public class yanghui {

    public static void main(String[] args) {
        //创建二维数组
        int [][]yanghui=new int[10][];
        //外层初始化
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i]=new int[i+1];
            yanghui[i][0]= yanghui[i][i]=1;


            for (int j = 1; j < yanghui[i].length-1 ; j++) {
                //j从每行第二个元素开始，倒数第二个结束
                yanghui[i][j]=yanghui[i-1][j]+yanghui[i-1][j-1];

            }
        }



        //赋值
        //首某赋值为1

        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j]+"\t");
            }
            System.out.println();
        }


    }}
