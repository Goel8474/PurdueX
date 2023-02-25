/*
Purpose: to test out do-while loops
Name: Vishesh Goel
Date: 02/22/2023
 */

public class DoWhile {
    public static void main(String[] args) {
        int x = 0;

        do {
            x += 5;
        } while (x % 4 != 0);
        System.out.println("The final value of x is " + x);
    }
}