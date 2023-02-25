/*
Purpose: To complete coding bat exercise 1 in week 1
Name: Vishesh Goel
Date: 02/22/2023
 */

public class CodingBat1 {
    public static boolean xyBalance(String str) {
        boolean xFound = false;
        boolean yFound = false;
        boolean yAfterX = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('x' == c) {
                xFound = true;
            }
            else if ('y' == c) {
                if (xFound == true) {
                    xFound = false;
                    yAfterX = true;
                }
                yFound = true;
            }
        }

        if (xFound == false && yFound == false) {
            return true;
        } else if (xFound == false && yFound == true && yAfterX == false) {
            return true;
        }

        if (yAfterX == true && xFound == false) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby") + " true");
        System.out.println(xyBalance("xyx") + " false");
        System.out.println(xyBalance("xxy") + " true");
        System.out.println(xyBalance("xyy") + " true");
        System.out.println(xyBalance("aaxbb") + " false");
        System.out.println(xyBalance("yaaxbb") + " false");

    }
}