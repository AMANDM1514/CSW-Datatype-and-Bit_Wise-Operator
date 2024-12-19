/*Q7) Write a program to find xy.*/



public class Q7 {
    public static int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result = multiply(result, x); // Use bitwise multiply
        }
        return result;
    }

    public static int multiply(int x, int y) {
        int result = 0;
        while (y != 0) {
            if ((y & 1) == 1) result += x;
            x <<= 1;
            y >>>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 2, y = 6;
        System.out.println(x + " raised to the power " + y + " is: " + power(x, y));
    }
}
