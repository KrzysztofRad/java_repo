package course.excercises.java.sda1.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        int result = sum(3,7);
        System.out.println(result);

    }
    private static int sum(int x,int y){
        int result = 0;
        for (int i = x; i!= y; i ++ ) {
         result = result + i;
        }
     return result;
    }
}
