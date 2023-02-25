/*
Purpose: to pratice using loops to build strings
Name: Vishesh Goel
Date: 02/23/2023
 */

public class StrLoops {
    public static void main(String[] args) {
        String buildMe = "";
        char letter;
        for (int i = 0; i < 6; i++) {
            letter = (char)(80 + i);
            buildMe = buildMe + letter;
        }
        /*** TODO: Write a for loop that constructs a String using the
         ASCII characters 'P' through 'U'  ***/
        System.out.println("String: " + buildMe + " ");
    }
}