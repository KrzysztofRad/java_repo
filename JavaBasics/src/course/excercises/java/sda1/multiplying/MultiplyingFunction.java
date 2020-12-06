package course.excercises.java.sda1.multiplying;

public class MultiplyingFunction {

    private final static int NUMBER_FIVE = 5;

    public static void main(String[] args) {
        System.out.println(NUMBER_FIVE);
        for (int i = 1; i <= 4; i++) {
            printNumberMultipliedByFive(i);
        }
    }

    private static void printNumberMultipliedByFive(int number) {
        System.out.println(NUMBER_FIVE * number);
    }
}
