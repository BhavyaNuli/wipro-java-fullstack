import java.io.*;
import java.util.*;

public class NambiarNumberGenerator {
    public int nnGenerator(String input1) {
        String mobileNo = input1;
        StringBuilder numbiarNo = new StringBuilder();
        int length = mobileNo.length();
        int[] digits = new int[length];

        // Convert string to array of digits
        for (int i = 0; i < length; i++) {
            digits[i] = Character.getNumericValue(mobileNo.charAt(i));
        }

        int i = 0;
        while (i < length) {
            int digit = digits[i];
            int evenOdd = digit % 2 == 0 ? 0 : 1;
            int sum = digit;

            int j = i + 1;
            while (j < length && (sum % 2 == evenOdd)) {
                sum += digits[j];
                j++;
            }

            numbiarNo.append(sum);
            i = j;
        }
        return Integer.parseInt(numbiarNo.toString());
    }
}
