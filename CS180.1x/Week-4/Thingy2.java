/*
 * Purpose: To test out reference types
 * Name: Vishesh Goel
 * Date: 02/01/2023
 */

public class Thingy2 {
     public static void main(String[] args) {
          Thingy t1, t2;
          
          t1 = new Thingy(4);
          t2 = new Thingy(3);
          
          /*** TODO: Declare two new objects of type Thingy using the variables t1 and t2.
                     For t1, pass the value 4 to the constructor.
                     For t2, pass the value 3 to the constructor. ***/

          System.out.println("Doing the crazy calculation for t1 with input 4 gives " + t1.crazyCalc(3));
          System.out.println("Doing the crazy calculation for t2 with input 3 gives " + t2.crazyCalc(2));
     }
}