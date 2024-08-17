public class SumOfNonPrimeIndexes {
    public int sumOfNonPrimeIndexes(int[] input1, int input2) {
        boolean[] isPrimeArray = new boolean[input2];
        for (int i = 0; i < input2; i++) {
            isPrimeArray[i] = isPrime(i);
        }
        int sum = 0;
        for (int i = 0; i < input2; i++) {
            if (!isPrimeArray[i]) {
                sum += input1[i];
            }
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
