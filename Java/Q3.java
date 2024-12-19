/*Q3) Write a program to swap the ith bit with jth bit of a number.*/


import java.util.Scanner;

public class Q3 {

    // Function to swap the ith and jth bits of a number
    public static int swapBits(int num, int i, int j) {
        // Extract the ith and jth bits
        int bitI = (num >> i) & 1; // Get the ith bit
        int bitJ = (num >> j) & 1; // Get the jth bit

        // If the bits are different, we need to flip them
        if (bitI != bitJ) {
            // Create bit masks for ith and jth positions
            int maskI = 1 << i;
            int maskJ = 1 << j;

            // Flip the ith and jth bits using XOR
            num = num ^ maskI;
            num = num ^ maskJ;
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        // Input the number
        System.out.print("Enter the number: ");
        int n = sk.nextInt();

        // Input the positions of bits to swap
        System.out.print("Enter the first bit position (i): ");
        int i = sk.nextInt();

        System.out.print("Enter the second bit position (j): ");
        int j = sk.nextInt();

        // Swap the bits
        int result = swapBits(n, i, j);

        // Display the result
        System.out.println("Number after swapping bits: " + result);

        sk.close();
    }
}
