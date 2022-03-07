package com.examples.logical;
import java.util.Scanner;

public class Stopwatch {
    static double start = 0;
    static double stop = 0;

    static void startTime() {
        start = System.currentTimeMillis();
        System.out.println("Start Time = " + start);
    }

    static void stopTime() {
        stop = System.currentTimeMillis();
        System.out.println("Stop Time = " + stop);
    }

    static void elapsedTime() {
        System.out.println("Elapsed Time = " + (stop - start) / 1000 +" seconds");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any key to start");
        input.next();
        startTime();
        System.out.println("Enter any key to stop");
        input.next();
        stopTime();
        elapsedTime();
    }
}
