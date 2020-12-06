public class ex16 {
    public static void main(String[] args) {
        float bmi = 25.0f;
        if (bmi > 25.0){
            System.out.println("nadwaga.");
        } else if (bmi >= 18.5 && bmi <= 25.0) {
            System.out.println("Norma.");
        } else if (bmi >=30.0 && bmi < 35.0){
            System.out.println("Waga prawidlowa.");
        } else {
            System.out.println("Niedowaga.");
        }
    }
}


