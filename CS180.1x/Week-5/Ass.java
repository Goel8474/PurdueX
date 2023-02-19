/*
 * Purpose: To test out assertions
 * Name: Vishesh Goel
 * Date: 02/14/2023
 */

public class Ass {
  
  double product(double one, double two) {
    return one * two;
    
  }
  public static void main (String[] args) {
    Ass one = new Ass();
    
    assert one.product(1, 3) == 3;
  }

}