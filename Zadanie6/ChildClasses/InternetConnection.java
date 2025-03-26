package Zadanie6.ChildClasses;

import Zadanie6.SubscriptionFee;

public class InternetConnection extends SubscriptionFee {
    private String connectionName;
    private String dataVolume;
    private double paymentAmount;
    private String month;
    private int year;

    public InternetConnection(String lastname, String firstname, String middlename, String address, String city,
            String passportDate, String connectionName, String dataVolume, double paymentAmount, String month,
            int year) {
        super(lastname, firstname, middlename, address, city, passportDate);
        this.connectionName = connectionName;
        this.dataVolume = dataVolume;
        this.paymentAmount = paymentAmount;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                ", Интернет: %s, Объем: %s, Сумма: %.2f, Месяц: %s, Год: %d",
                connectionName, dataVolume, paymentAmount, month, year);
    }

    public double getPaymentAmount(){
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
