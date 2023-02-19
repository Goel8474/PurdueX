/*
 * Purpose: To complete project 3
 * Name: Vishesh Goel
 * Date: 02/05/2023
 */

import java.util.Scanner;

public class EmailGenerator {
  
  // Takes full name and makes the unique name for email
  static String makeUserName(String firstName, String lastName) {
    String firstLetter = firstName.substring(0,1);
    String uniqueName = firstLetter + lastName;
    return uniqueName.toLowerCase();
  }
  
  // Returns full email
  static String makeEmail(String name, String domain) {
    return name + "@" + domain;
  }
  
  public static void main(String[] args) {
    System.out.printf("Please type your full name: ");
    
    // Takes inputs from user and stores them
    Scanner input = new Scanner(System.in);
    String firstName = input.next();
    String lastName = input.next();
    input.close();
    
    // Returns full email to user
    String name = EmailGenerator.makeUserName(firstName, lastName);
    String domain = "purdue.edu";
    System.out.println("This user's email is: " + EmailGenerator.makeEmail(name, domain));
  }
}

