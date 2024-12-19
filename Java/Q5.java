/*Q5) Write a java program to copmute x × y without arithmetic operators.*/


import java.util.Scanner;
public class Q5 {

    // Function to add two integers without using +
    private static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;  // Calculate carry bits
            a = a ^ b;          // Perform bitwise addition
            b = carry << 1;     // Shift carry to the left
        }
        return a;
    }

    // Function to multiply x and y without using * operator
    public static int multiply(int x, int y) {
        int result = 0;

        // Iterate through all bits of y
        while (y != 0) {
            // Check if the least significant bit of y is 1
            if ((y & 1) == 1) {
                result = add(result, x);  // Add x to result
            }

            x <<= 1;  // Left shift x (equivalent to multiplying x by 2)
            y >>>= 1; // Right shift y (unsigned shift)
        }

        return result;
    }

    public static void main(String[] args) {
    	Scanner sk = new Scanner(System.in);
    	System.out.print("Enter x: ");
        int x = sk.nextInt();
        System.out.print("Enter y: ");
        int y = sk.nextInt();
        int product = multiply(x, y);

        System.out.println("The product of " + x + " and " + y + " is: " + product);
        sk.close();
    }
}
