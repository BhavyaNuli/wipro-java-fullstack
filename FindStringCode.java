import java.io.*;
import java.util.*;

class FindStringCodeV2 {
    public int findStringCode(String input1) {
        String[] words = input1.split(" ");
        String output = "";

        for (String word : words) {
            int sum = 0;
            for (int i = 0; i < word.length() / 2; i++) {
                int diff = Math.abs(letterToNo(word.charAt(i)) - letterToNo(word.charAt(word.length() - i - 1)));
                sum += diff;
            }
            if (word.length() % 2 == 1) {
                sum += letterToNo(word.charAt(word.length() / 2));
            }
            output += sum;
        }
        return Integer.parseInt(output);
    }

    public static int letterToNo(char ch) {
        return (Character.isLetter(ch)) ? Character.toLowerCase(ch) - 'a' + 1 : 0;
    }
}
