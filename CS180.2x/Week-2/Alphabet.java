/*
Purpose: to practice complete the project for week 2
Name: Vishesh Goel
Date: 02/23/2023
*/

public class Alphabet {
    public static String whatsMissing (String sentence) {

        if (sentence == null) {
            return "Please enter a valid string input";
        } else if (sentence.length() == 0) {
            return "abcdefghijklmnopqrstuvwxyz";
        }

        int k = sentence.length();
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; // input "abc", output "defghijklmnopqrstuvwxyz"
        int y = alphabet.length();
        String lowerSentence = sentence.toLowerCase();

        for (int i = 0; i < k; i++) {
            char checking = lowerSentence.charAt(i);
            for (int j = 0; j < 26; j++) {
                char letter = (char)(97 + j);
                if (checking == letter) {
                    int indexAt = alphabet.indexOf(letter);
                    if (indexAt != -1) {
                        alphabet = alphabet.substring(0, indexAt) + alphabet.substring(indexAt + 1, y - 1);
                        y--;
                    }
                }
            }
        }
        return alphabet;
    }
    public static void main(String[] args) {
        System.out.println(whatsMissing(null));
        System.out.println(whatsMissing(""));
        System.out.println(whatsMissing("             "));
        System.out.println(whatsMissing("xyz"));
        System.out.println(whatsMissing("a c e g"));
    }
}