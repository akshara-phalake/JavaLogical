package com.examples.logical;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    int[] couponArray;
    int  pos = 0;
    int randomCount = 0;
    public static void main(String[] args){
        CouponNumbers couponNumbers = new CouponNumbers();
        couponNumbers. takeInput();
    }

    void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Coupons: ");
        int couponCount = scanner.nextInt();
        scanner.close();
        couponArray = new int[couponCount];
        random(couponCount);
    }

    void random(int couponCount){
        randomCount++;
        Random random = new Random();
        int randomInteger = random.nextInt(couponCount) + 1;
        if (isPresent(randomInteger))
            random(couponCount);
        else {
            couponArray[pos] = randomInteger;
            pos++;
            if(pos == couponCount){
                System.out.println("Number of trials required : " + randomCount);
                return;
            }
            random(couponCount);
        }
    }

    boolean isPresent(int n){
        for (int i =0; i < couponArray.length; i++){
            if(couponArray[i] == n)
                return true;
        }
        return false;
    }
}
