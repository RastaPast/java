package Zadanie6;

import java.util.ArrayList;
import java.util.List;

import Zadanie6.SubscriptionFee;
import models.TelephoneSubscriber;

public class PaymentList {
    private List<SubscriptionFee> payments;

    public PaymentList(List<SubscriptionFee> payments) {
        this.payments = payments;
    }

    public void addPayment(SubscriptionFee payment) {
        payments.add(payment);
    }

    public void printAllPayments() {
        for (SubscriptionFee payment : payments) {
            System.out.println(payment);
        }
    }

    public List<SubscriptionFee> getPayments() {
        return getPayments();
    }


    public List<SubscriptionFee> getTelephoneSubscriberArrayList(){
        return payments;
    }

    public void setTelephoneSubscriberArrayList(List<SubscriptionFee> payments) {
        this.payments = payments;
    }
}
