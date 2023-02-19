/*
 * Purpose: To test out String
 * Name: Vishesh Goel
 * Date: 01/31/2023
 */

public class StringClass {
     public static void main(String[] args) {
          
          String s1 = new String("West Lafayette, Indiana, USA");
          int length = s1.length();
          char c1 = s1.charAt(0);
          char c5 = s1.charAt(4);
          String s2 = String.valueOf(c1) + String.valueOf(c5);
          /*** TODO: Create a new String, s1, that contains "West Lafayette, Indiana, USA".
                     Store the length of s1 in the integer variable "length".
                     Store the character in position 1 of s1 in the character variable "c1".
                     Store the character in position 5 of s1 in the character variable "c5".
                     Store a new String in s2 which is composed of the concatenation of c1 and c5. ***/

          System.out.println("The string is " + length + " characters long.");
          System.out.println("Character 1 of s1 is '" + c1 + "' and character 5 is '" + c5 + "'.");
          System.out.println("The new string s2 is \"" + s2 + "\".");
     }
}
