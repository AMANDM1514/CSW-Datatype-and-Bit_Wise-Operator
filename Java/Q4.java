/*Q4) Write a program that takes a 64-bit word and returns the 64-bit word consisting
of the bits of the input word in reverse order. For example, if the input is
alternating 1s and 0s, i.e., (1010...10), the output should be alternating 0s and
1s, i.e.,(0101...01).*/


import java.util.Scanner;

public class Q4 {

    // Function to reverse the bits of a 64-bit word
    public static long reverseBits(long n) {
        long reversed = 0;

        // Loop through all 64 bits
        for (int i = 0; i < 64; i++) {
            // Extract the least significant bit (LSB) of n
            long lsb = n & 1;

            // Shift the LSB to its reverse position and OR it with the result
            reversed = (reversed << 1) | lsb;

            // Right shift n to process the next bit
            n >>>= 1;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        // Input a 64-bit integer
        System.out.print("Enter a 64-bit number: ");
        long n = sk.nextLong();

        // Reverse the bits
        long reversedNumber = reverseBits(n);

        // Display the result
        System.out.println("Reversed 64-bit word: " + reversedNumber);
        System.out.println("Reversed 64-bit word (binary): " + Long.toBinaryString(reversedNumber));

        sk.close();
    }
}
