package com.examples.logical;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                temp = 1;
            }
        }
        if ((num == 0) || (num == 1))
            System.out.println(num + " is neither prime nor composite number.");
        else if (temp == 1)
            System.out.println(num + " is not a prime number.");
        else
            System.out.println(num+" is a prime number");
    }
}
