package task;

import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void oneDimensionalArray() {
        Random random = new Random();
        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = random.nextInt(11);
        }
        int count = 0;
        for (int value : c) {
            if (value != 0) {
                count++;
            }
        }

        int[] x = new int[count];

        int index = 0;
        for (int value : c) {
            if (value != 0) {
                x[index] = value * value;
                index++;
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(c));
        System.out.println("Новый массив: " + Arrays.toString(x));
    }
}