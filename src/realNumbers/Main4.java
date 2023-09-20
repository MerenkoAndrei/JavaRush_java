package realNumbers;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        double d = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        if (Math.abs(d - b) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
