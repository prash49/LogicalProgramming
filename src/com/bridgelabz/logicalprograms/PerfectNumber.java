package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //variables
        int number;
        System.out.println("Enter number to Check Its Perfect number of Not");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        /* Perfect number is a Positive integer that equals sum of all its divisors(except  itself)
        ex: 6: where divisors of 6 are 1,2,3 sum of 1+2+3=6 so 6 is perfect number
                                          or
          Perfect number is a Positive integer that is half of the sum of all its divisor (including itself
          ex 28:  1,2,4,7,14,28(itself) 1+2+4+7+14+28=56 where half of 56 is 28 */
        int sum = 0, i = 1;
        while (i <= number / 2) {
            //checking the divisors
            if (number % i == 0) {
                //Adding the divisors
                sum = sum + i;
            }
            i++;
        }
        //comparing sum of divisors and number
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else
            System.out.println(number + " is not a perfect number.");
    }
}

