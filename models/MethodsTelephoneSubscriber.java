package models;

import models.TelephoneSubscriber;

import java.util.ArrayList;

public class MethodsTelephoneSubscriber {
    public static void sortByFIO(ArrayList<TelephoneSubscriber> list) {
        list.sort((o1, o2) -> o1.getFio().compareTo(
                o2.getFio()));
    }

    public static void sortByCost(ArrayList<TelephoneSubscriber> list) {
        list.sort((o1, o2) -> Double.compare(o1.getCost(), o2.getCost()));
    }

}
