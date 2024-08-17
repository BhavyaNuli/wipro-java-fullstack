import java.io.*;
import java.util.*;

class IdentifyPossibleWords {
    public String identifyPossibleWords(String input1, String input2) {
        input1 = input1.toUpperCase();
        String[] words = input2.split(":");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            word = word.toUpperCase();
            if (word.length() == input1.length()) {
                boolean isMatch = true;
                for (int i = 0; i < word.length(); i++) {
                    if (input1.charAt(i) != '_' && input1.charAt(i) != word.charAt(i)) {
                        isMatch = false;
                        break;
                    }
                }
                if (isMatch) {
                    output.append(word).append(":");
                }
            }
        }

        return output.length() > 0 ? output.substring(0, output.length() - 1) : "ERROR-009";
    }
}
