/*Q10) Write a Java program that reads two float numbers and checks whether the
difference between these two numbers is less than ϵ (ϵ < 1).*/


public class Q10 {
    public static boolean isDifferenceSmall(float a, float b) {
        float epsilon = 1.0f;
        return Math.abs(a - b) < epsilon;
    }

    public static void main(String[] args) {
        float a = 3.4f, b = 2.5f;
        System.out.println("Difference is less than epsilon: " + isDifferenceSmall(a, b));
    }
}
