/*Q13) Write a Java program to count the frequency of each digit of a number.*/


public class Q13 {
    public static void countDigitFrequency(int n) {
        int[] freq = new int[10];
        n = Math.abs(n); // Handle negatives

        while (n != 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println("Digit " + i + ": " + freq[i] + " times");
        }
    }

    public static void main(String[] args) {
        int n = 122345;
        countDigitFrequency(n);
    }
}
