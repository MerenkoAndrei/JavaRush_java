package arrays;

import java.util.Scanner;

public class TaskArrays {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        //1)инициализация массива
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];

        //2)заполняем массив
        System.out.println();
        strings[0] = EVEN;
        strings[1] = ODD;
        strings[2] = EVEN;
        strings[3] = ODD;
        strings[4] = EVEN;
        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);

        //3)меняем знак на противоположный
        System.out.println();
        if (array[0] % 2 == 0) {
            array[0] = -array[0];
        }
        if (array[1] % 2 == 0) {
            array[1] = -array[1];
        }
        if (array[2] % 2 == 0) {
            array[2] = -array[2];
        }
        if (array[3] % 2 == 0) {
            array[3] = -array[3];
        }
        if (array[4] % 2 == 0) {
            array[4] = -array[4];
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        //4)собираем из двух один
        System.out.println();
        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            resultArray[i + firstArray.length] = secondArray[i];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }

        //5)задание заполнение массива
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        if (n % 2 == 0) {
            for (int i = data.length - 1; i >= 0; i--) {
                System.out.println(data[i]);
            }
        } else {
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
        }

        //6)удаляем одинаковые строки
        System.out.println();
        Scanner s = new Scanner(System.in);

        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = s.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

