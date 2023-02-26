/*
Purpose: to try declaring arrays
Name: Vishesh Goel
Date: 02/25/2023
 */

public class ArrayD {
    public static void main(String[] args) {

        int[] myAry = new int[12];

        for (int i = 0; i < 12; i++) {
            myAry[i] = i % 6;
            System.out.println("myAry[" + i + "] stores " + myAry[i]);
        }
    }
}