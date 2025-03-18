package task;

public class task2 {
    public static double D(double a, double b) {
        return (5 * Math.max(a, b) - 4 * Math.min(a, b)) / (8.3 + (Math.max(a, b) / (Math.min(a, b))));
    }
}
