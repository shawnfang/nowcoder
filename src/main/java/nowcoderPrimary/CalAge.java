package nowcoderPrimary;

/*
题目描述
 问题：一年约有3.156×10^7s，要求输入您的年龄，显示该年龄合多少秒。
输入描述:
一行，包括一个整数age(0<age<=200)。
输出描述:
一行，包含一个整数，输出年龄对应的秒数。
示例1
输入
20
输出
631200000
 */

import java.util.Scanner;

public class CalAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        long ageSecond = new Double(age*3.156*Math.pow(10,7)).longValue();
        System.out.println(ageSecond);
    }
}
