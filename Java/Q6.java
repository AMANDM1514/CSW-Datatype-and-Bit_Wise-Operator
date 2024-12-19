/*Q6) Write a java program to copmute x/y without arithmetic operators.*/


public class Q6 {
    public static int divide(int x, int y) {
        int result = 0;
        while (x >= y) {
            int tempY = y, multiple = 1;
            while (x >= (tempY << 1)) { // Find the largest multiple of y
                tempY <<= 1;
                multiple <<= 1;
            }
            x -= tempY;
            result += multiple;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 42, y = 7;
        System.out.println("Quotient: " + divide(x, y));
    }
}
