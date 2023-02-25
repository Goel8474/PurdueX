/*
Purpose: to practice nested loops
Name: Vishesh Goel
Date: 02/23/2023
*/

public class NestLoop2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || (6 - i) == j) {
                    System.out.print("#");
                } else {
                System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}