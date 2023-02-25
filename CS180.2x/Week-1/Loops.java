/*
Purpose: To test out loops
Name: Vishesh Goel
Date: 02/22/2023
 */

public class Loops {
    public static void main(String[] args) {
        int x = 0, howMuch = 0;
        while (x < 6) {
            howMuch = howMuch + x;
            x++;
        }
        System.out.println("The final value of x is " + x + " and howMuch is " + howMuch);
    }
}