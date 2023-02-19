/*
 * Pupose: To complete project 2
 * Author: Vishesh Goel
 * Date: 01/24/2023
 */

import java.util.Scanner;

public class Associative {
  
  int x;
  int y;
  int z;
  
  Associative(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  double firstTwo() {
    return (x + y) * z;
  }
  
  double lastTwo() {
    return y * z + x;
  }
  
  public static void main(String[] args) {
    System.out.println("Please enter three integers below:");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    
    Associative f = new Associative(a, b, c);
    
    System.out.println("Grouping the first two terms, (" + a + " + " + b + ") * " + c + " = " + f.firstTwo());
    System.out.println("Grouping the first two terms, " + a + " + (" + b + " * " + c + ") = " + f.lastTwo());
  }
}