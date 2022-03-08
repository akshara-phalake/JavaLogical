package com.examples.junittesting;
import java.util.Scanner;

public class BinaryRepresentation {
    static int[] list = { 0, 0, 0, 0, 0, 0, 0, 0 };
    static int index = 7;
    static void toBinary(int n, int index) {
        if (n == 0) {
            return;
        }
        int remainder = n % 2;
        n = n / 2;
        list[index] = remainder;
        toBinary(n, index - 1);
    }

    static int toDecimal(int[] list) {
        double sum = 0;
        int count = list.length - 1;
        for (int i : list) {
            sum += i * Math.pow(2, count);
            count -= 1;
        }
        return (int) sum;
    }
    static void checkPowerOf2(int number) {
        while(true) {
            if( number%2!=0) {
                System.out.println("This number in not a power of 2");
                break;
            }
            else if(number/2==1) {
                System.out.println("This number is power of 2");
                break;
            }
            else {
                number=number/2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number less than or equal to 256 : ");
            int a = scan.nextInt();
            if (a <= 256) {
                toBinary(a, index);
                for (int i = 0; i < list.length / 2; i++) {
                    int c = list[i + 4];
                    list[i + 4] = list[i];
                    list[i] = c;
                }
                System.out.println("Number after swapping nibble :"+toDecimal(list));
                checkPowerOf2(toDecimal(list));
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}