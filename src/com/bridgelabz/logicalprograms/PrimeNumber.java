package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        boolean isPrime = false;
        System.out.println("enter the Number to check it is a Prime number or not");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        //prime number is divided by 1 or itself ex 2, 3 ,5 ,7 ,11

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                //using boolean we breaking the for loop
                isPrime = true;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println(number + " is  not a Prime number");
        } else {
            System.out.println(number + " is a  Prime number");
        }
    }
}
