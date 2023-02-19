/*
 * Pupose: To test out primitive types and their interactions
 * Author: Vishesh Goel
 * Date: 01/23/2023
 */

import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    System.out.println("Please enter an integer: ");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    s.close();
    
    System.out.println("Please enter annother integer: ");
    Scanner t = new Scanner(System.in);
    int b = t.nextInt();
    t.close();
    
    System.out.println("The sum would be " + (a + b));
  }
}