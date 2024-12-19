/*Q9) Write a program to check whether a number is palindrome or not.*/


public class Q9 {
    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;

        while (n != 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int n = 165;
        System.out.println(n + " is palindrome: " + isPalindrome(n));
    }
}
