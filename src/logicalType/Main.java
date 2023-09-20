package logicalType;
import java.util.Scanner;
public class Main {
    private static boolean isHigh;
    private static boolean isLow;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow) {
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }

        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        if (a == b && b == c){
            System.out.println(a + " " + b + " " + c);
        } else if(a == b && b!= c){
            System.out.println(a + " " + b);
        } else if(a == c && c!= b){
            System.out.println(a + " " + c);
        } else if(c == b && b!= a){
            System.out.println(c + " " + b);
        }
    }
}
