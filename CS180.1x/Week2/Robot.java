/*
 * Purpose: 
 * Author: Vishesh Goel
 * Date: 01/14/2023
 */

public class Robot {
  String name;
  Robot(String name) {
    this.name = name;
  }
  void speak(String msg) {
    System.out.println(msg + name);
  }
  public static void main(String[] args) {
    Robot r = new Robot("vishesh!");
    r.speak("hey there! its ");
    Robot b = new Robot("vasu");
    b.speak("hi! im ");
  }
}