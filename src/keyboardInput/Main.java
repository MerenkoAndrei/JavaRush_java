package keyboardInput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        System.out.println(name);
        System.out.println(age);

        String str = new Scanner(System.in).nextLine();
        String str1 = new Scanner(System.in).nextLine();
        String str2 = new Scanner(System.in).nextLine();
        System.out.println(str2);
        System.out.println(str1.toUpperCase());
        System.out.println(str.toLowerCase());

        int number1 = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();
        int number3 = new Scanner(System.in).nextInt();
        System.out.println((number1 + number2 + number3)/3);

        String s = "10 20 40 60";
        Scanner scanner = new Scanner(s);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
