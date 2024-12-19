/*Q16) Write a Java program to print the prime number in a range.*/


import java.util.Scanner;

public class PrimeNumberInRange {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if ((num & 1) == 0 && num > 2) {
            return false; // Exclude even numbers greater than 2
        }
        for (int i = 3; (i * i) <= num; i += 2) { // Check only odd numbers
            if ((num % i) == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input range
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        
        System.out.println("Prime numbers in the range [" + lowerBound + ", " + upperBound + "]:");
        
        // Loop through the range and print prime numbers
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}
