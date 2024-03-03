package com.atguigu1.one.exer2;

import java.util.Scanner;

public class exec2 {
    public static void main(String[] args) {
        //从键盘输入学生人数，根据人数，创建数组（动态初始化）
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int count = scan.nextInt();
        int[] scores = new int[count];


        //根据提示依次计算学生成绩，将成绩保存在数组中，
        System.out.println("请输入" + count + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }

        //根据成绩获取最大值，
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        System.out.println("最高分是" + maxScore);

        //遍历数组，根据成绩与最高分差值，得到每个学生等级，并输出成绩和等级
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore - 10) {
                System.out.println("student" + i + "score is" + scores[i] + "A");
            } else if (scores[i] > maxScore - 20) {
                System.out.println("student" + i + "score is" + scores[i] + "B");
            } else if (scores[i] > maxScore - 30) {
                System.out.println("student" + i + "score is" + scores[i] + "C");
            } else {
                System.out.println("student" + i + "score is" + scores[i] + "D");
            }


        }

        scan.close();
    }
}
