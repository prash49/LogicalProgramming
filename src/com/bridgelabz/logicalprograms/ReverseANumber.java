package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println("enter number to reverse ");
        Scanner scanner = new Scanner(System.in);
        //variables
        int number = scanner.nextInt();
        int reversenumber = 0;
        while (number > 0) {
            // reversenumber store the remainder
            reversenumber = reversenumber * 10 + number % 10;
            // number here store the quotient
            number = number / 10;
        }
        System.out.println("Reverse of no. is " + reversenumber);
    }
}
