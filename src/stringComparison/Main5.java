package stringComparison;

import java.util.Scanner;

public class Main5 {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("строки одинаковые");
            //напишите тут ваш код
        } else {
            System.out.println("строки разные");
        }

        System.out.println();
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        if (string1 == string2) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
        if (string2 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
        if (string1 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (secret.equalsIgnoreCase(string)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
    }
}
