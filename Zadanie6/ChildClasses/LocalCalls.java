package Zadanie6.ChildClasses;

import Zadanie6.SubscriptionFee;

public class LocalCalls extends SubscriptionFee {
    private double tariff;
    private int durationMinutes;
    private double paymentAmount;
    private String month;
    private int year;

    public LocalCalls(String lastName, String firstName, String middleName,
            String address, String city, String passportData,
            double tariff, int durationMinutes, double paymentAmount, String month, int year) {
        super(lastName, firstName, middleName, address, city, passportData);
        this.tariff = tariff;
        this.durationMinutes = durationMinutes;
        this.paymentAmount = durationMinutes * tariff;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                ", Городской звонок: Тариф %.2f/мин, Длительность: %d мин, " +
                        "Сумма: %.2f, Месяц: %s, Год: %d",
                tariff, durationMinutes, paymentAmount, month, year);
    }

    public double getPaymentAmount(){
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

}
