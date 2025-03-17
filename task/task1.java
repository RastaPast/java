package task;

public class task1 {
    /*
     * Написать программу, получающую на вход в качестве аргумента два параметра -
     * числа а и b.
     * Если произведение двух чисел больше 100, то вычислить утроенный
     * тангенс второго числа, в противном случае первое число умножить на 5. Вывести
     * результат на экран.
     */
    public static double tripleTangence(double a, double b) {
        if (a * b > 100) {
            return Math.tan(Math.tan(Math.tan(a)));
        } else {
            return a * 5;
        }
    }
}
