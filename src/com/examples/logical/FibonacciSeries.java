package com.examples.logical;
import java.util.Scanner;

public class FibonacciSeries {
    public void fibonacciSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fibonacci series limit : ");
        int range = sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<range;i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        FibonacciSeries fObj = new FibonacciSeries();
        fObj.fibonacciSeries();
    }
}
