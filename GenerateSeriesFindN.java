public class GenerateSeriesFindN {
    public int generateSeriesFindN(int input1, int input2, int input3, int input4) {
        int[] gaps = new int[] { input2 - input1, input3 - input2 };
        int output = input1;

        for (int i = 1; i < input4; i++) {
            output += gaps[i % 2]; // Alternate between gap1 and gap2
        }
        return output;
    }
}
