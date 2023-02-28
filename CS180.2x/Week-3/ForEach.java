/*
Purpose: to pratice using arrays
Name: Vishesh Goel
Date: 02/23/2023
 */

public class ForEach {
    public static void main(String[] args) {
        double[] distance = {35.3, 17.8, 21.3, 104.0, 55.9, 59.7, 44.3};
        double totalDistance = 0;

        for (double d : distance) {
            totalDistance += d;
        }

        System.out.println("The total distance was " + totalDistance);
    }
}