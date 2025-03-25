package models;

import java.util.ArrayList;
import models.TelephoneSubscriber;

public class StorageAbonent {
    private ArrayList<TelephoneSubscriber> telephoneSubscriberArrayList;

    public StorageAbonent(ArrayList<TelephoneSubscriber> telephoneSubscriberArrayList) {
        this.telephoneSubscriberArrayList = telephoneSubscriberArrayList;
    }

    public void addElement(TelephoneSubscriber TelephoneSubscriber) {
        telephoneSubscriberArrayList.add(TelephoneSubscriber);
    }

    public void printArrayTelephoneSubscriber() {
        for (TelephoneSubscriber a : telephoneSubscriberArrayList)
            System.out.printf("FIO: '" + a.getFio() + "', adress: '" + a.getAdress() + "' numberPhone: '"
                    + a.getnumberPhone() + "', month: '" + a.getMonth() + "'"
                    + "', year: '" + a.getYear() +
                    "', minutesCount: '" + a.getMinutesCount() + " минуты', cost: '" + a.getCost() + " руб.'");
    }

    public ArrayList<TelephoneSubscriber> gettelephoneSubscriberArrayList() {
        return telephoneSubscriberArrayList;
    }

    public void setTelephoneSubscriberArrayList(ArrayList<TelephoneSubscriber> telephoneSubscriberArrayList) {
        this.telephoneSubscriberArrayList = telephoneSubscriberArrayList;
    }

}
