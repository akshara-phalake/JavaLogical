package com.examples.logical;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;

        for (i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println(num +" is a perfect number");
        } else {
            System.out.println(num +" is not a perfect number");
        }
    }
}
