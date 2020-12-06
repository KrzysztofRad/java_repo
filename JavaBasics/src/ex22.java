public class ex22 {
    public static void main(String[] args) throws InterruptedException {
        int a = 1;
        System.out.println("zaczynam liczyć");
        while (a <= 11) {
            System.out.println(a);
            Thread.sleep(1000);
            a++;
        }
        System.out.println("szukam");
    }
}