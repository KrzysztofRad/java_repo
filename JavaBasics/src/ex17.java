public class ex17 {
    public static void main(String[] args) {
        float cenaZaMetr = 3500.0f;
        if (cenaZaMetr > 5000.0) {
            System.out.print("Cena za wysoka!");
            if (cenaZaMetr <= 5000.0 && cenaZaMetr >= 4000.0) {
                System.out.println("Cena jest konkurencyjna");
            } else {
                System.out.print("cena jest okazyjna");
            }
        } else {
            System.out.println("Jest ok");
        }
    }
}
