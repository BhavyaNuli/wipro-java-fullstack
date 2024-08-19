import java.io.*;
import java.util.*;

public class AlternateAddSub {
    public int AddSub(int input1, int input2) {
        int result = input1;

        for (int i = input1 - 1, j = 0; i >= 1; i--, j++) {
            result = (j % 2 == input2 - 1) ? result + i : result - i;
        }
        return result;
    }
}
