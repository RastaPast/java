package Zadanie6.ChildClasses;

import Zadanie6.SubscriptionFee;

public class InternationalCalls extends SubscriptionFee {
    private String country;
    private String callCity;
    private int durationMinutes;
    private double pricePerMinute;
    private double paymentAmount;
    private String month;
    private int year;

    public InternationalCalls(String lastname, String firstname, String middlename, String address, String city,
            String passportDate, String country, String callCity, int durationMinutes, double pricePerMinute,
            double paymentAmount, String month, int year) {
        super(lastname, firstname, middlename, address, city, passportDate);
        this.country = country;
        this.callCity = callCity;
        this.durationMinutes = durationMinutes;
        this.pricePerMinute = pricePerMinute;
        this.paymentAmount = paymentAmount;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                ", Международный звонок: %s, %s, Длительность: %d мин, Цена: %.2f/мин, " +
                        "Сумма: %.2f, Месяц: %s, Год: %d",
                country, callCity, durationMinutes, pricePerMinute,
                paymentAmount, month, year);
    }
}
