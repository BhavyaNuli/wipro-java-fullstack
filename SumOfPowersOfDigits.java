import java.io.*;
import java.util.*;

class SumOfPowersOfDigitsV2 {
    public int sumOfPowerOfDigits(int input1) {
        if (input1 <= 9) return 0;

        String num = String.valueOf(input1);
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            int currentDigit = Character.getNumericValue(num.charAt(i));
            if (i == num.length() - 1) {
                sum += 1;
                System.out.println(currentDigit + " ^ " + 0);
            } else {
                int nextDigit = Character.getNumericValue(num.charAt(i + 1));
                sum += Math.pow(currentDigit, nextDigit);
            }
        }
        return sum;
    }
}
