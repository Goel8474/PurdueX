/*
 * Purpose: To complete CodingBat exercise 1
 * Name: Vishesh Goel
 * Date: 02/01/2023
 */

public class CodingBat1 {
  
  //Thingy3() {}
  
  String nTwice(String a, int b) {
    String c = a.substring(0, b);
    int h = a.length();
    String d = a.substring((h-b), (h));
    return c + d;
  }
     public static void main(String[] args) {
       
       CodingBat1 w = new CodingBat1();
       System.out.println(w.nTwice("Chocolate", 3));
       
     }
}