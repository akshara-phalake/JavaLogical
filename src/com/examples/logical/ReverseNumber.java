package com.examples.logical;
import java.util.Scanner;

public class ReverseNumber {
    public void reverse(){
        int digit;
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse : ");
        int number = sc.nextInt();
        while (number > 0){
            digit = number % 10;
            number = number / 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("The reverse number is " +reverse);
    }
    public static void main(String[] args){
        ReverseNumber reverseObj = new ReverseNumber();
        reverseObj.reverse();
    }
}
