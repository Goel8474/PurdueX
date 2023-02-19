/*
 * Purpose: To complete CodingBat exercise 2
 * Name: Vishesh Goel
 * Date: 02/02/2023
 */

public class CodingBat2 {
  
  Boolean frontAgain(String str) {
  
    int b = str.length();
    return str.substring(0,2).equals(str.substring((b-2), b));
    
  }
  
  public static void main(String[] args) {
  
    CodingBat2 c = new CodingBat2();
    System.out.println(c.frontAgain("edited"));
  
  }
}