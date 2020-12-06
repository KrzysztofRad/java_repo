public class ex18 {
    public static void main(String[] args) {
        String name = "Mike";
        switch (name) {
            case "Mike":
            case "John":
                System.out.println("Hello John");
                break;
            case "Kate":
                System.out.println("Hello Kate");
                break;
            default:
                System.out.println("Hello someone");
        }
    }
}
