/*
 * Purpose: To test out String methods
 * Name: Vishesh Goel
 * Date: 01/31/2023
 */

public class Substring {
     public static void main(String[] args) {
          String s1 = "I am the very model of a modern major general";
          
          String s2 = s1.substring(14,19);
          String s3 = s1.substring(32,45);

          System.out.println("s2: " + s2 + "\ns3: " + s3);
     }
}