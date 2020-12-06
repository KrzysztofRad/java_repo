package course.excercises.java.casting;

public class CastingExcercise {
    public static void main(String[] args) {
        float a = 123;
        // rzutowanie niejawne
        int b = (int) a;
        // rzutowanie jawne
        int c = (int) a;
        System.out.println(b);
        System.out.println(c);
    }
}