import java.io.*;
import java.util.*;

class GetCodeThroughStringsV2 {
    public int getCodeThroughStrings(String input1) {
        String[] words = input1.split(" ");
        int pin = 0;

        for (String word : words) {
            pin += word.length();
        }

        while (pin >= 10) {
            int pin2 = 0;
            while (pin > 0) {
                pin2 += pin % 10;
                pin /= 10;
            }
            pin = pin2;
        }

        return pin;
    }
}
