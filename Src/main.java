
import java.util.Scanner;

import task.task1;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print(" 1 - Работа с задачами\n 2 - Работа с данными\n 3 - Завершение работы\n");
            int num = in.nextInt();
            switch (num) {
                case 1: {
                    MenuTasks();
                    break;
                }
                case 2: {
                    flag = false;
                    break;
                }
            }
        }
    }

    public static void MenuTasks() {
        try (Scanner in = new Scanner(System.in)) {
            boolean flag = true;
            while (flag) {
                System.out.print("\n 1 - Условия \n 2 - Одномерный массив\n 3- Двумерный массив\n 4 - Нахождение D\n " +
                        "5 - Завершить программу \n");
                int num = in.nextInt();
                switch (num) {
                    case 1: {
                        // Тут собственно всякие разные исходы для MultiplicationCondition
                        System.out.printf("При x = 5 и y = 5: " + task1.tripleTangence(5, 5) + "\n");
                        System.out.printf("При x = 12 и y = 12: " + task1.tripleTangence(12, 12) + "\n");
                        System.out.printf("При x = -5 и y = 12: " + task1.tripleTangence(-5, 12) + "\n");
                        System.out.printf("При x = -4 и y = -23: " + task1.tripleTangence(-4, -23) + "\n");
                        System.out.printf("При x = 16 и y = 15: " + task1.tripleTangence(16, 15) + "\n");
                        break;
                    }
                    case 2: {
                        flag = false;
                        break;
                    }
                }
            }
        }
    }

}
