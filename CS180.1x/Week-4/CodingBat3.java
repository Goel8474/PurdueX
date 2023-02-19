/*
 * Purpose: To complete CodingBat exercise 3
 * Name: Vishesh Goel
 * Date: 02/02/2023
 */

public class CodingBat3 {

  String nonStart(String a, String b) {
  
    String c = a.substring(1);
    String d = b.substring(1);
    return c + d;
  
  }

  public static void main(String[] args) {
  
    CodingBat3 g = new CodingBat3();
    System.out.println(g.nonStart("Hello", "There"));
  
  }
  
}