/*
Purpose: to pratice using loops to build strings
Name: Vishesh Goel
Date: 02/23/2023
 */

public class StrLoops2 {
    public static void main(String[] args) {
        String doubles = "I'll hurry to kitty, Jess";

        for (int i = 0; i < doubles.length() - 1; i++) {
            if (doubles.charAt(i) == doubles.charAt(i+1)) {
                System.out.println("Double " + doubles.charAt(i) + "'s");
            }
        }
    }
}