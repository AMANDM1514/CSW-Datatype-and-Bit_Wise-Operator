/*Q17) Write a program that returns true if the number is even else returns false.
Note: don’t use if else.*/


import java.util.Scanner;

public class EvenNumberCheck {
    public static boolean isEven(int num) {
        return (num % 2) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Is the number even? " + isEven(number));
        
        scanner.close();
    }
}
