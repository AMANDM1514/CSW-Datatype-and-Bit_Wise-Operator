/*Q17) Write a program that returns true if the number is even else returns false.
Note: don’t use if else.*/


import java.util.Scanner;

public class EvenNumberCheck {
    public static boolean isEven(int num) {
        return (num % 2) == 0; // Returns true if num is even, false otherwise
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is even and print the result
        System.out.println("Is the number even? " + isEven(number));
        
        scanner.close();
    }
}
