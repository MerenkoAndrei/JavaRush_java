package variableReferences;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));

        System.out.println();
        Integer[] arrayy = new Integer[5];
        fillArray(arrayy, 3, 1, 3);
        System.out.println(Arrays.toString(arrayy));
    }

    public static void fillArray(Integer[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        for (int i = begin; i < end; i++) {
            array[i] = value;
        }
    }
}
