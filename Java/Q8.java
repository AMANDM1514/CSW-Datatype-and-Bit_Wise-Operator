/*Q8) Write a program to find the reverse of a number. For example, if the input is
123 output is 321, and if the input is -245 output is -542.*/


public class Q8 {
    public static int reverseNumber(int n) {
        int reversed = 0, sign = 1;

        if (n < 0) {
            sign = -1;
            n = -n;
        }

        while (n != 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }

        return reversed * sign;
    }

    public static void main(String[] args) {
        int n = -655;
        System.out.println("Reversed number: " + reverseNumber(n));
    }
}
