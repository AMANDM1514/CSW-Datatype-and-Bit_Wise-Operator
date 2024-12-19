/*Q11) Write a Java program that reads an integer number and counts the number of
digits that are even.*/


public class Q11 {
    public static int countEvenDigits(int n) {
        int count = 0;

        while (n != 0) {
            int digit = Math.abs(n % 10);
            if (digit % 2 == 0)
            	count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 45678;
        System.out.println("Number of even digits: " + countEvenDigits(n));
    }
}

