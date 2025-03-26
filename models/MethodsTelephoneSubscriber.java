package models;

import models.TelephoneSubscriber;
import Zadanie6.SubscriptionFee;
import Zadanie6.ChildClasses.*;
import java.util.ArrayList;
import java.util.List;

public class MethodsTelephoneSubscriber {
    public static void sortByFIO(ArrayList<TelephoneSubscriber> list) {
        list.sort((o1, o2) -> o1.getFio().compareTo(
                o2.getFio()));
    }

    public static void sortByCost(ArrayList<TelephoneSubscriber> list) {
        list.sort((o1, o2) -> Double.compare(o1.getCost(), o2.getCost()));
    }

    public static void sortByFIO1(List<SubscriptionFee> list) {
        list.sort((o1, o2) -> o1.getLastname().compareTo(
        o2.getLastname()));
    }

    public static void sortByCost(List<SubscriptionFee> list) {
        list.sort((o1, o2) -> Double.compare(o1.getPricePerMinute(), o2.getPricePerMinute()));
    }

    public static void sortByFIO3(List<SubscriptionFee> list) {
        list.sort((o1, o2) -> o1.getLastname().compareTo(
        o2.getLastname()));
    }

    // public static void sortByCost3(ArrayList<TelephoneSubscriber> list) {
    //     list.sort((o1, o2) -> Double.compare(o1.getCost(), o2.getCost()));
    // }


}
