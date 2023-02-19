/*
 * Purpose: To practice the stuff in week 5 
 * Name: Vishesh Goel
 * Date: 02/15/2023
 */

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int currentYear = s.nextInt();
    System.out.println(isLeapYear(currentYear));
  }
  
  public static boolean isLeapYear (int currentYear) {
    if ((currentYear % 4) == 0) {
      if ((currentYear % 100) == 0 && (currentYear % 400) != 0) {
        return false;
      } else {
        return true;
      }
    } else {
      return false;
    }
  }
}