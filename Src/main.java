
import java.util.ArrayList;
import java.util.Scanner;

import models.TelephoneSubscriber;
import task.task1;
import task.task2;
import task.task3;
import task.task4;

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
                case 3: {
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
                System.out.print(
                        "\n 1 - Условия \n 2 - Нахождение D \n 3 - Одномерный массив\n 4 - Двумерный массив\n " +
                                "5 - Завершить программу \n");
                int num = in.nextInt();
                switch (num) {
                    case 1: {
                        System.out.printf("При a = 5 и b = 5: " + task1.tripleTangence(5, 5) + "\n");
                        break;
                    }
                    case 2: {
                        System.out.printf("При a = 5 и b = 5: " + task2.D(5, 5) + "\n");
                        break;
                    }
                    case 3: {
                        task3.oneDimensionalArray();
                        break;
                    }
                    case 4: {
                        task4.twoDimensionalArray();
                        break;
                    }
                    case 5: {
                        flag = false;
                        break;
                    }
                }
            }
        }
    }

    public static void MenuStructure() {
        String menu = "Выберите действие:\n 1 - Заполнить список в ручную\n 2 - Заполнить список из файла" +
                "\n 3 - Записать список в файл\n 4 - Вывести список\n " +
                "5 - Осортировать список по имени\n " +
                "6 - Осортировать список по розничной цене\n " +
                "7 - Завершить программу\n";
        Scanner in = new Scanner(System.in);
        ArrayList<TelephoneSubscriber> TelephoneSubscriberArrayList = new ArrayList<>();
        StorageProducts storageProducts = new StorageProducts(TelephoneSubscriberArrayList);
        boolean flag = true;
        while (flag) {
            System.out.print(menu);
            int num = in.nextInt();
            switch (num) {
                case 1: {
                    RecordData(storageProducts);
                    break;
                }
                case 2: {
                    ReadDataFile(storageProducts);
                    storageProducts.printArrayCommodity();
                    break;
                }
                case 3: {
                    WriteDataFile(storageProducts);
                    break;
                }
                case 4: {
                    storageProducts.printArrayCommodity();
                    break;
                }
                /*
                 * case 5: {
                 * MethodsCommodity.sortByName(storageProducts.getCommodityArrayList());
                 * storageProducts.printArrayCommodity();
                 * break;
                 * }
                 * case 6: {
                 * MethodsCommodity.sortByRetailPrice(storageProducts.getCommodityArrayList());
                 * storageProducts.printArrayCommodity();
                 * break;
                 * }
                 */
                case 7: {
                    flag = false;
                    break;
                }
            }
        }
    }

}
