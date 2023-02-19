/*
 * Purpose: To give the amount of change for an amount of money
 * Name: Vishesh Goel
 * Date: 01/30/2023
 */

import java.util.Scanner;

public class GiveChange {

  GiveChange() {}
  
  double getQuarters(double a) {
    return a / 0.25;
  }
  
  double getDimes(double a) {
    return a /= 0.10;
  }
  
  double getNickels(double a) {
    return a /= 0.05;
  }
  
  double getPennies(double a) {
    return a /= 0.01;
  }
  
  public static void main(String[] args) {
  
    System.out.print("Please enter your amount in dollars: $");
    Scanner s = new Scanner(System.in);
    double a = s.nextDouble();
    s.close();
    
    GiveChange g = new GiveChange();
    
    System.out.println("You need " + g.getQuarters(a) + " quarters or...");
    System.out.println("You need " + g.getDimes(a) + " dimes or...");
    System.out.println("You need " + g.getNickels(a) + " nickels or...");
    System.out.println("You need " + g.getPennies(a) + " pennies");
  
  }
  
}