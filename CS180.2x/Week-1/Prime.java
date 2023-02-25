/*
Purpose: to complete week 1 project
Name: Vishesh Goel
Date: 02/23/2023
 */

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int number) {
        int dividedBy = number - 1;
        for(int i = 0; i < number - 2; i++) {
            if (number % dividedBy == 0 && dividedBy > 1) {
                return false;
            } else if (dividedBy > 1) {
                dividedBy--;
            }
        }
        if (number == 1) {
            return false;
        } else if (number <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(isPrime(number)) {
            System.out.printf("The number %d is prime", number);
        } else {
            System.out.printf("The number %d is not prime", number);
        }
    }
}