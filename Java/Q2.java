/*Q2) The parity of a binary word is 1 if the number of 1s in the word is odd; otherwise,
it is 0. Write a Java program to count the parity of an integer number.*/


import java.util.Scanner;

public class Q2 {

    // Function to compute the parity of an integer
    public static int calculateParity(int n) {
        int parity = 0;

        while (n != 0) {
            parity ^= (n & 1); // XOR the parity with the least significant bit
            n = n >>> 1;       // Right shift the number (logical shift for unsigned)
        }

        return parity;
    }

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int n = sk.nextInt();

        // Calculate the parity
        int parity = calculateParity(n);

        // Display the result
        System.out.println("The parity of the given integer is: " + parity);

        sk.close();
    }
}
