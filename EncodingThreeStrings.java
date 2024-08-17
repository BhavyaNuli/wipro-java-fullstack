import java.io.*;
import java.util.*;

class EncodingThreeStrings {
    public class Result {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String out1, String out2, String out3) {
            output1 = out1;
            output2 = out2;
            output3 = out3;
        }
    }

    public Result encodeThreeStrings(String input1, String input2, String input3) {
        String[] segments1 = splitIntoThree(input1);
        String[] segments2 = splitIntoThree(input2);
        String[] segments3 = splitIntoThree(input3);

        String combined1 = segments1[0] + segments2[0] + segments3[0];
        String combined2 = segments1[1] + segments2[1] + segments3[1];
        String combined3 = swapCase(segments1[2] + segments2[2] + segments3[2]);

        return new Result(combined1, combined2, combined3);
    }

    private String[] splitIntoThree(String str) {
        int length = str.length();
        int firstEnd = (length + 2) / 3;
        int secondEnd = (2 * (length + 1)) / 3;

        return new String[]{
            str.substring(0, firstEnd),
            str.substring(firstEnd, secondEnd),
            str.substring(secondEnd)
        };
    }

    private String swapCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i])
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}
