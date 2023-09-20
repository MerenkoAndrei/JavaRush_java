package cyclesFor;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        for (int i = 1; i < 15; i++) {
            if (i % 2 == 0) System.out.println(i);
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('8');
            }

            System.out.println();
        }
    }
}
