public class ex23 {
    public class Case1 {
        public void main(String[] args) throws InterruptedException {
            int a = 0;
            System.out.println("zaczynam liczyć");
            while (a <= 10) {
                System.out.println("przed if-em");
                a++;
                if (a == 5) {
                    // break;
                    continue;
                }
                Thread.sleep(1000);
                System.out.println(a);
            }
            System.out.println("szukam");
        }
    }
}
