/*
Purpose: to pratice using arrays
Name: Vishesh Goel
Date: 02/23/2023
 */

public class WordList {

    String[] words = new String[2];
    int count = 0;

    int findWord (String s) {
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                String lowerS = s.toLowerCase();
                String lowerWords = words[i].toLowerCase();
                if (lowerS.equals(lowerWords)) {
                    return i;
                }
            }
        }
        return -1;
    }

    int addWord (String s) {
        int findWordResult = findWord(s);
        if (findWordResult == -1) {
            for (int i = 0; i < words.length; i++) {
                if (words[i] != null) {
                    count++;
                    if (count == words.length) {
                        String[] newWords = new String[2 * words.length];
                        for (int j = 0; j < words.length; j++) {
                            newWords[j] = words[j];
                        }
                        newWords[words.length + 1] = s;
                        words = newWords;
                    }
                } else {
                    words[i] = s;
                    count++;
                    break;
                }
            }
        } else {
            for (int i = 0; i < words.length; i++) {
                if (words[i] != null) {
                    count++;
                }
            }
        }
        return count;
    }

    int addWord2 (String s) {
        int findWordResult = findWord(s);
        if (findWordResult == -1) {
            if (count == words.length) {
                String[] newWords = new String[2 * words.length];
                for (int j = 0; j < words.length; j++) {
                    newWords[j] = words[j];
                }
                //newWords[words.length] = s;
                words = newWords;
            }

            for (int i = 0; i < words.length; i++) {
                if (words[i] == null) {
                    words[i] = s;
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        WordList w = new WordList();
        System.out.println(w.addWord2("computer"));
        System.out.println(w.addWord2("vishesh"));
        System.out.println(w.addWord2("goel"));
        System.out.println(w.addWord2("rajesh"));
        System.out.println(w.addWord2("goel"));
    }
}