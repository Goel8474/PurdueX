/*
Purpose: to complete codingbat exercise 2 in week 1
Name: Vishesh Goel
Date: 02/23/2023
 */

public class CodingBat2 {
    public String repeatFront(String str, int n) {
        //for loop that runs til n reaches 0
        String solution = "";
        while (n > 0) {
            solution = solution + str.substring(0, n);
            n--;
        }
        return solution;
    }

    public static void main(String[] args) {
        CodingBat2 c = new CodingBat2();
        System.out.println(c.repeatFront("Chocolate Cocoa Puffs", 6));
    }
}