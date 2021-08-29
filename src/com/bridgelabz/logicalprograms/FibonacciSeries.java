package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacci(int fibo) {
        if (fibo <= 1) {
            return fibo;
        }
        return fibonacci(fibo - 1) + fibonacci(fibo - 2);
    }

    public static void main(String[] args) {
        /*fibonacci series F0=0 F1=1 and rest adds up previous (n-1) (n-2)
        ex for 6: 0 , 1 ,(0+1) 1, (1+1) 2 ,(1+2) 3,(2+3) 5 like this so here 6 represents how many times
        the loop should iterate */
        System.out.println("Enter the number to Check Fibonacci series of it:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
