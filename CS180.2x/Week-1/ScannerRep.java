/*
Purpose: To test out repetition loops using Scanner
Name: Vishesh Goel
Date: 02/22/2023
 */

import java.util.Scanner;

public class ScannerRep {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 0, howMuch = 0;

        while (scn.hasNextInt()) {
            x = scn.nextInt();
            howMuch = howMuch + x;
            System.out.println("The final value of howMuch is " + howMuch);
        }
    }
}