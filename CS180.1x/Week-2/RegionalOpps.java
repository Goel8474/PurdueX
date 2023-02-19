/* 
 * Purpose: To practice regional operators and if statements
 * Name: Vishesh Goel
 * Date: 02/13/2023
 */

public class RegionalOpps {
     public static void main(String[] args) {
          int b = 103, c = 42, d = 4, f = 66; 
          
          if(b > (c * d - f)) {
               System.out.println("The number " + b + " is the biggest!");
          } 
          else {
               System.out.println("The scales are not tipped in your favor, " + b + "...");
          }
     }
}