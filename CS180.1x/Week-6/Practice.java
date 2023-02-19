/*
 * Purpose: To test out null pointers and avoid them
 * Name: Vishesh Goel
 * Date: 02/19/2023
 */

public class Practice {
  public static void main(String[] args) {
    String s1 = "", s2 = "alacazam", s3 = "abracadabra";
    firstLastCheck(s1);
    firstLastCheck(s2);
    firstLastCheck(s3);
  }
  public static void firstLastCheck(String s) {
    
    if (s.length() > 0) {
      if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
        System.out.println(s + ": Same start and finish letter!");
      } else {
        System.out.println(s + ": Not same start and finish letter!");
      }
    } else {
      System.out.println(s + ": Doesn't contain anything!");
    }
  }
  
  
  
  
  
  
  
  public static void firstLastCheckRajesh(String s) {
    if (s.length() == 0) {
      printDoNotMatch(s);
      return;
    }
    
    final char FIRST_CHAR = s.charAt(0);
    final char LAST_CHAR = s.charAt(s.length() - 1);
    System.out.printf("First Char: %c, Last Char: %c\n", FIRST_CHAR, LAST_CHAR);
    
    if (FIRST_CHAR == LAST_CHAR) {
      printMatch(s);
    } else {
      printDoNotMatch(s);
    }
  }
  
  public static void printMatch(String s) {
   System.out.println(s + ": Same start and finish letter!"); 
  }

  public static void printDoNotMatch(String s) {
   System.out.println(s + ": Not same start and finish letter!"); 
  }

}