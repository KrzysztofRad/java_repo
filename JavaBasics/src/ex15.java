public class ex15 {
    public static void main(String[] args) {
        float temperature = 40.0f;
        if (temperature > 37.0f) {
            System.out.print("Masz gorączkę/stan podgorączkowy!");
        } else if (temperature >= 36.6f && temperature < 37.0) {
            System.out.println("jesteś zdrowa/zdrowy");

        } else {
            System.out.print("Jesteś osłabiona/osłabiony");
        }
    }
}

