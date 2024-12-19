/*Q1) Write a Java program to count the number of bits that are set to 1 in an integer.*/


import java.util.Scanner;

public class Q1 {
    // Function to count the number of bits set to 1
    public static int countSetBits(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1); // Check if the least significant bit is 1
            n = n >>> 1;      // Right shift the number (logical shift for unsigned)
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int n = sk.nextInt();

        // Call the method to count set bits
        int result = countSetBits(n);

        // Display the result
        System.out.println("Number of bits set to 1: " + result);

        sk.close();
    }
}
