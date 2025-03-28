
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.MethodsTelephoneSubscriber;
import models.StorageAbonent;
import models.TelephoneSubscriber;
import Zadanie6.PaymentList;
import Zadanie6.SubscriptionFee;
import Zadanie6.ChildClasses.InternationalCalls;
import Zadanie6.ChildClasses.InternetConnection;
import Zadanie6.ChildClasses.LocalCalls;
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
                case 2: {
                    MenuStructure();
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
        String menu = "Выберите действие: \n 1 - Заполнить список в ручную\n 2 - Заполнить список из файла" +
                "\n 3 - Заполнить список из файла InternationalCalls\n 4 - Записать список в файл LocalCalls\n " +
                "5 - Заполнить список из файла InternetConnection\n " +
                "6 - Записать список в файл \n " +
                "7 - Вывести список \n" +
                "8 -  Заполнить список международные звонки \n" +
                "9 -  Заполнить список городские звонки \n" +
                "10 - Заполнить список подключение к Интернет\n" +
                "11 - Вывести список\n" +
                "12 - Осортировать список по имени\n" +
                "13 - Осортировать список по розничной цене\n " +
                "14 - Завершить программу\n";
        Scanner in = new Scanner(System.in);
        ArrayList<TelephoneSubscriber> telephoneSubscriberArrayList = new ArrayList<>();
        StorageAbonent StorageAbonent = new StorageAbonent(telephoneSubscriberArrayList);
        List<SubscriptionFee> payments = new ArrayList<>();
        PaymentList paymentList = new PaymentList(payments);
        boolean flag = true;
        while (flag) {
            System.out.print(menu);
            int num = in.nextInt();
            switch (num) {
                case 1: {
                    RecordData(StorageAbonent);
                    break;
                }
                case 2: {
                    ReadDataFile(StorageAbonent);
                    StorageAbonent.printArrayTelephoneSubscriber();
                    break;
                }
                case 3: {
                    ReadDataFile1(paymentList);
                    paymentList.printAllPayments();
                    break;
                }
                case 4: {
                    ReadDataFile2(paymentList);
                    paymentList.printAllPayments();
                    break;
                }
                case 5: {
                    ReadDataFile3(paymentList);
                    paymentList.printAllPayments();
                    break;
                }

                case 6: {
                    WriteDataFile(paymentList);
                    break;
                }
                case 7: {
                    StorageAbonent.printArrayTelephoneSubscriber();
                    break;
                }
                case 8: {
                    RecordData1(paymentList);
                    break;
                }
                case 9: {
                    RecordData2(paymentList);
                    break;
                }
                case 10: {
                    RecordData3(paymentList);
                    break;
                }
                case 11: {
                    paymentList.printAllPayments();
                    break;
                }
                case 12: {
                    MethodsTelephoneSubscriber.sortByFIO(StorageAbonent.gettelephoneSubscriberArrayList());
                    StorageAbonent.printArrayTelephoneSubscriber();
                    break;
                }
                case 13: {
                    MethodsTelephoneSubscriber.sortByCost(paymentList.getTelephoneSubscriberArrayList());
                    paymentList.printAllPayments();
                    break;
                }
                case 14: {
                    flag = false;
                    break;
                }

                case 15: {
                    MethodsTelephoneSubscriber.sortByFIO1(paymentList.getTelephoneSubscriberArrayList());
                    paymentList.printAllPayments();
                    break;
                }
            }
        }
    }

    public static void RecordData(StorageAbonent StorageAbonent) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите ФИО:");
            String fio = in.next();
            System.out.print("Введите адрес:");
            String adress = in.next();
            System.out.print("Введите номер телефона:");
            String numberPhone = in.next();
            System.out.print("Введите месяц:");
            String month = in.next();
            System.out.print("Введите год:");
            int year = in.nextInt();
            System.out.print("Введите количество минут:");
            int minutesCount = in.nextInt();
            System.out.print("Введите стоимость: ");
            double cost = in.nextInt();
            StorageAbonent
                    .addElement(new TelephoneSubscriber(fio, adress, numberPhone, month, year, minutesCount, cost));
            System.out.print("Ввести еще абонента (1 - да / 0 - нет):");
            if (in.nextInt() != 1)
                flag = false;
        }
    }

    public static void RecordData1(PaymentList paymentList) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите фамилию: ");
            String lastname = in.next();
            System.out.print("Введите имя: ");
            String firsname = in.next();
            System.out.print("Введите отчество: ");
            String middlename = in.next();
            System.out.print("Введите адрес: ");
            String address = in.next();
            System.out.print("Введите город: ");
            String city = in.next();
            System.out.print("Введите паспортные данные: ");
            String passportDate = in.next();
            System.out.print("Введите страну: ");
            String country = in.next();
            System.out.print("Введите город: ");
            String callCity = in.next();
            System.out.print("Введите длительность в минутах: ");
            int durationMinutes = in.nextInt();
            System.out.print("Введите цену: ");
            double pricePerMinute = in.nextDouble();
            System.out.print("Введите сумму оплаты: ");
            double paymentAmount = in.nextDouble();
            System.out.print("Введите месяц: ");
            String month = in.next();
            System.out.print("Введите год: ");
            int year = in.nextInt();
            paymentList.addPayment(new InternationalCalls(lastname, firsname, middlename, address, city, passportDate,
                    country, callCity, durationMinutes, pricePerMinute, paymentAmount, month, year));
            System.out.print("Ввести еще один международный звонок (1 - да / 0 - нет):");
            if (in.nextInt() != 1)
                flag = false;
        }
    }

    public static void RecordData2(PaymentList paymentList) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите фамилию: ");
            String lastname = in.next();
            System.out.print("Введите имя: ");
            String firsname = in.next();
            System.out.print("Введите отчество: ");
            String middlename = in.next();
            System.out.print("Введите адрес: ");
            String address = in.next();
            System.out.print("Введите город: ");
            String city = in.next();
            System.out.print("Введите паспортные данные: ");
            String passportDate = in.next();
            System.out.print("Введите тариф: ");
            double tariff = in.nextDouble();
            System.out.print("Введите длительность в минутах: ");
            int durationMinutes = in.nextInt();
            System.out.print("Введите сумма оплаты: ");
            double paymentAmount = in.nextDouble();
            System.out.print("Введите месяц: ");
            String month = in.next();
            System.out.print("Введите год: ");
            int year = in.nextInt();

            paymentList.addPayment(new LocalCalls(lastname, firsname, middlename, address, city, passportDate, tariff,
                    durationMinutes, paymentAmount, month, year));
            System.out.print("Ввести еще один городской звонок (1 - да / 0 - нет):");
            if (in.nextInt() != 1)
                flag = false;
        }
    }

    public static void RecordData3(PaymentList paymentList) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите фамилию: ");
            String lastname = in.next();
            System.out.print("Введите имя: ");
            String firsname = in.next();
            System.out.print("Введите отчество: ");
            String middlename = in.next();
            System.out.print("Введите адрес: ");
            String address = in.next();
            System.out.print("Введите город: ");
            String city = in.next();
            System.out.print("Введите паспортные данные: ");
            String passportDate = in.next();
            System.out.print("Введите название подключения: ");
            String connectionName = in.next();
            System.out.print("Введите предоставленый объем: ");
            String dataVolume = in.next();
            System.out.print("Введите сумму оплаты: ");
            double paymentAmount = in.nextDouble();
            System.out.print("Введите месяц: ");
            String month = in.next();
            System.out.print("Введите год: ");
            int year = in.nextInt();
            paymentList.addPayment(new InternetConnection(lastname, firsname, middlename, address, city, passportDate,
                    connectionName, dataVolume, paymentAmount, month, year));
            if (in.nextInt() != 1) {
                flag = false;
            }
        }
    }

    public static void ReadDataFile(StorageAbonent StorageAbonent) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("data.txt")))) {
            String str;
            while ((str = reader.readLine()) != null)
                StorageAbonent.addElement(ParseString(str));
            System.out.print("Успешно записано\n");
        } catch (IOException e) {
            System.out.print("Что-то пошло не так");
            e.printStackTrace();
        }
    }

    public static void ReadDataFile1(PaymentList PaymentList) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("InternationalCalls.txt")))) {
            String str;
            while ((str = reader.readLine()) != null)
                PaymentList.addPayment(ParseString1(str));
            System.out.print("Успешно записано\n");
        } catch (IOException e) {
            System.out.print("Что-то пошло не так");
            e.printStackTrace();
        }
    }

    public static void ReadDataFile2(PaymentList PaymentList) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("LocalCalls.txt")))) {
            String str;
            while ((str = reader.readLine()) != null)
                PaymentList.addPayment(ParseString2(str));
            System.out.print("Успешно записано\n");
        } catch (IOException e) {
            System.out.print("Что-то пошло не так");
            e.printStackTrace();
        }
    }

    public static void ReadDataFile3(PaymentList PaymentList) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("InternetConnection.txt")))) {
            String str;
            while ((str = reader.readLine()) != null)
                PaymentList.addPayment(ParseString3(str));
            System.out.print("Успешно записано\n");
        } catch (IOException e) {
            System.out.print("Что-то пошло не так");
            e.printStackTrace();
        }
    }

    public static void WriteDataFile(PaymentList paymentList) {
        try (FileWriter writer = new FileWriter("Abonent.txt")) {
            // запись всей строки
            for (SubscriptionFee commodity : paymentList.getTelephoneSubscriberArrayList()) {
                writer.write(commodity.toString());
                writer.append('\n');
            }
            writer.flush();
            System.out.print("Успешно записано\n");
        } catch (IOException ex) {
            System.out.print("Что-то пошло не так");
            System.out.println(ex.getMessage());
        }

    }

    public static TelephoneSubscriber ParseString(String str) {
        String[] arrayData = str.split(" ");
        return new TelephoneSubscriber(arrayData[0], arrayData[1], (arrayData[2]),
                arrayData[3], Integer.parseInt(arrayData[4]), Integer.parseInt(arrayData[5]),
                Integer.parseInt(arrayData[6]));
    }

    public static SubscriptionFee ParseString1(String str) {
        String[] arrayData1 = str.split(" ");
        return new InternationalCalls(arrayData1[0], arrayData1[1], arrayData1[2], arrayData1[3], arrayData1[4],
                arrayData1[5],
                arrayData1[6], arrayData1[7],
                Integer.parseInt(arrayData1[8]), Integer.parseInt(arrayData1[9]), Integer.parseInt(arrayData1[10]),
                arrayData1[11], Integer.parseInt(arrayData1[12]));
    }

    public static SubscriptionFee ParseString2(String str) {
        String[] arrayData1 = str.split(" ");
        return new LocalCalls(arrayData1[0], arrayData1[1], arrayData1[2], arrayData1[3], arrayData1[4], arrayData1[5],
                Integer.parseInt(arrayData1[6]), Integer.parseInt(arrayData1[7]),
                Integer.parseInt(arrayData1[8]), arrayData1[9], Integer.parseInt(arrayData1[10]));
    }

    public static SubscriptionFee ParseString3(String str) {
        String[] arrayData1 = str.split(" ");
        return new InternetConnection(arrayData1[0], arrayData1[1], arrayData1[2], arrayData1[3], arrayData1[4],
                arrayData1[5],
                arrayData1[6], arrayData1[7], Integer.parseInt(arrayData1[8]), arrayData1[9],
                Integer.parseInt(arrayData1[10]));
    }
}
