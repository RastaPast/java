package models;

import java.util.ArrayList;
import java.util.Comparator;

/*Абонентская плата TelephoneSubscriber: 
    Свойства: ФИО абонента; 
    к адрес 
    к телефон; 
    к месяц; 
    к год; 
    к количество минут; 
    стоимость; 
*/
public class TelephoneSubscriber {
    private String fio;
    private String adress;
    private String numberPhone;
    private String month;
    private int year;
    private int minutesCount;
    private double cost;

    public TelephoneSubscriber(String fio, String adress, String numberPhone2, String month, int year, int minutesCount,
            double cost) {
        this.setFio(fio);
        this.setAdress(adress);
        this.setNumberPhone(numberPhone2);
        this.setMonth(month);
        this.setYear(year);
        this.setMinutesCount(minutesCount);
        this.setCost(cost);
    }

    public String ToString() {
        return "FIO: '" + this.fio + "', adress: '" + this.adress + "' numberPhone: '" + this.numberPhone
                + "', month: '" + this.month + "'"
                + "', year: '" + this.year +
                "', minutesCount: '" + this.minutesCount + "минут', cost: '"
                + this.cost + "руб.'";
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getnumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
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