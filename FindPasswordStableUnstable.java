import java.io.*;
import java.util.*;

public class FindPasswordStableUnstable {
    public int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] nums = {input1, input2, input3, input4, input5};
        int stable = 0, unstable = 0;

        for (int num : nums) {
            if (isStable(num)) stable += num;
            else unstable += num;
        }
        return stable - unstable;
    }

    public static boolean isStable(int num) {
        int[] freq = new int[10];
        String numStr = String.valueOf(num);
        
        for (char ch : numStr.toCharArray()) {
            freq[ch - '0']++;
        }
        
        int primaryFrequency = -1;
        boolean isStable = true;

        for (int i : freq) {
            if (i > 0) {
                if (primaryFrequency == -1) {
                    primaryFrequency = i;
                } else if (i != primaryFrequency) {
                    isStable = false;
                    break;
                }
            }
        }
        return isStable;
    }
}
