package logicalOperations;
import java.util.Scanner;
public class Main {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        if((a + b) > c && (b + c) > a && (a + c) > b){
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }

        int age = new Scanner(System.in).nextInt();
        if(age < 20 || age > 60 ) {
            System.out.println("можно не работать");
        }

        int f = new Scanner(System.in).nextInt();
        int g = new Scanner(System.in).nextInt();
        if(f > 0 && g > 0){
            System.out.println(1 + " четверть");
        } else if(f < 0 && g > 0){
            System.out.println(2 + " четверть");
        } else if(f < 0 && g < 0){
            System.out.println(3 + " четверть");
        } else if( f > 0 && g < 0){
            System.out.println(4 + " четверть");
        }

    }
}
