/*Q12) Write a Java program that reads two integer number and create a third number
by taking the first two digits of the first number and the last two digits of the
second number.
Example: Input: 45678, 312 Output:4512*/



public class Q12 {
    public static int combine(int num1, int num2) {
        // Extract first two digits of num1
        int temp1 = num1;
        while (temp1 >= 100) {
            temp1 /= 10;
        }
        int firstTwo = temp1;

        // Extract last two digits of num2
        int lastTwo = num2 % 100;

        // Combine the digits
        return firstTwo * 100 + lastTwo;
    }

    public static void main(String[] args) {
        int num1 = 425678, num2 = 3162;
        System.out.println("Combined number: " + combine(num1, num2));
    }
}
