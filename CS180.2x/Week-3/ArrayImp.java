/*
Purpose: to pratice using arrays
Name: Vishesh Goel
Date: 02/23/2023
 */

public class ArrayImp {
    public static void main(String[] args) {
        boolean[] roomClean = {true, false, false, true, false, true, true, false};

        for (int i = 0; i < roomClean.length; i++) {
            if (roomClean[i] == true) {
                System.out.println("Room " + (i + 1) + " needs cleaning");
            }
        }
    }
}