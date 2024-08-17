import java.io.*;
import java.util.*;

class SumOfSumsOfDigitsInCyclicOrderV2 {
    public int sumOfSumsOfDigits(int input1) {
        String num = String.valueOf(input1);
        int sum = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < num.length(); i++) {
            cumulativeSum += Character.getNumericValue(num.charAt(i));
            sum += cumulativeSum;
        }
        return sum;
    }
}
