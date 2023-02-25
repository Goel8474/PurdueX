/*
Purpose: to complete week 1 project
Name: Vishesh Goel
Date: 02/23/2023
 */

import java.util.Scanner;

public class Prime2 {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(isPrime(number));
    }
}