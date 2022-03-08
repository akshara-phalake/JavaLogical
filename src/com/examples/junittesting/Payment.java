package com.examples.junittesting;
import java.util.Scanner;

public class Payment {
    static void monthlyPayment(double P,double r,double n) {
        double result = P * r / (1 - Math.pow((1 + r),-n));
        System.out.println("The monthly payment is : "+result);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double P = scan.nextDouble();
        System.out.println("Enter the year : ");
        double Y = scan.nextDouble();
        System.out.println("Enter the rate of interest : ");
        double R = scan.nextDouble();
        double n = 12 * Y;
        double r=R / (12 * 100);
        monthlyPayment(P,r,n);
    }
}
