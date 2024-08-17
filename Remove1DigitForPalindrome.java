import java.io.*;
import java.util.*;

public class  {
    public int digitRemove_Palin(int input1) {
        StringBuffer num = new StringBuffer(String.valueOf(input1));

        for (int i = 0; i < num.length(); i++) {
            String removedDigit = String.valueOf(num.charAt(i));
            num.deleteCharAt(i);
            if (isPalindrome(num.toString())) {
                return Integer.parseInt(removedDigit);
            }
            num.insert(i, removedDigit);
        }
        return -1;
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
