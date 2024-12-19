/*Q14) Write a Java program to check whether a number is prime or not.*/


public class Q14 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Prime numbers must be greater than 1
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Not prime if divisible by any i
            }
        }
        return true; // Prime number
    }

    public static void main(String[] args) {
        int n = 19; // Example input
        System.out.println(n + " is prime: " + isPrime(n));
    }
}
