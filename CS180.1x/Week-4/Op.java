/*
 * Purpose: To test out operators
 * Name: Vishesh Goel
 * Date: 01/30/2023
 */

public class Op {

  public static void main(String[] args) {
  
    int b = 1, c = 2, d = 3, f = 4;
    
    b++;
    c += 7;
    d -= 3;
    f *= 10;
    
    System.out.println("The result of postfix increment on b is " + b);
    System.out.println("The result of addition shortcut assignment on c is " + c);
    System.out.println("The result of subtraction shortcut assignment on d is " + d);
    System.out.println("The result of multiplication shortcut assignment on f is " + f);
    
  }
  
}