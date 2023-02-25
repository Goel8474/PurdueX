/*
Purpose: To test out for-loops
Name: Vishesh Goel
Date: 02/22/2023
 */

public class ForLoops {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 23; i++) {
            if (i % 12 == 0) {
                x++;
                System.out.println("Time to start over again! Repetition number : " + x);
            }
        }
    }
}