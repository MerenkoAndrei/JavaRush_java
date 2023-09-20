package cyclesWhile;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int m = 0;
        String quote = "Я никогда не буду работать за копейки. Амиго";
        while (m < 100) {
            System.out.println(quote);
            m++;
        }

        System.out.println();
        String text = " любит меня.";
        String name = new Scanner(System.in).nextLine();
        int a = 0;
        while (a < 10) {
            System.out.println(name + text);
            a++;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
            } else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);

        System.out.println();
        int a1 = 0;
        while (a1 < 5) {
            int b = 0;
            while (b < 10) {
                System.out.print("Q");
                b++;
            }
            System.out.println();
            a1++;
        }

        System.out.println();
        int height = 1;
        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print('Б');
                } else if (width == 1 || width == 20) {
                    System.out.print('Б');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }

        System.out.println();
        Scanner console = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x % 2 == 0 && x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
