package models;

import java.util.ArrayList;
import java.util.Comparator;

/*Абонентская плата TelephoneSubscriber: 
    Свойства: ФИО абонента; 
    к адрес к телефон; 
    к месяц; 
    к год; 
    к количество минут; 
    стоимость; 
*/
public class TelephoneSubscriber {
    private String fio;
    private int numberPhone;
    private int month;
    private int year;
    private int minutesCount;
    private double cost;

    public TelephoneSubscriber(String fio, int numberPhone, int month, int year, int minutesCount, double cost) {
        this.SetFio(fio);
        this.setNumberPhone(numberPhone);
        this.setMonth(month);
        this.setYear(year);
        this.setMinutesCount(minutesCount);
        this.setCost(cost);
    }

    public String ToString() {
        return "FIO: '" + this.fio + "', numberPhone: '" + this.numberPhone + "', month: '" + this.month + "'"
                + "', year: '" + this.year +
                "', minutesCount: '" + this.minutesCount + "', cost: '"
                + this.cost + "'";
    }

    public String getFio() {
        return fio;
    }

    public void SetFio(String fio) {
        this.fio = fio;
    }

    public int getnumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMinutesCount() {
        return minutesCount;
    }

    public void setMinutesCount(int minutesCount) {
        this.minutesCount = minutesCount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}