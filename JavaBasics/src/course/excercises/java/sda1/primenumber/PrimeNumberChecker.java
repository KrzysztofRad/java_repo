package course.excercises.java.sda1.primenumber;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        int numberToCheck = 11;
        boolean result = isPrime(numberToCheck);

        System.out.println("Czy liczba " + numberToCheck + " jest pierwsza? " + booleanToPolishString(result));
    }

    private static String booleanToPolishString(boolean result) {
        if (result) {
            return "tak";
        } else {
            return "nie";
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1 ){
            System.out.println("Podaj liczbe dodatnią");
            return false;
        }
        if (number == 2 || number == 3){
            return true;
        } else {
            for (int i = number -1 ; i >= 2; i--) {
                int divisionRest = number % i;
                System.out.println("Reszta z dzielenia " + number + " przez " + i + " jest rowna " + divisionRest);
                if (divisionRest == 0){
                    return false;
                }
            }
            return true;
        }
    }

}
