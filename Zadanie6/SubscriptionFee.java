package Zadanie6;

public class SubscriptionFee {
    private String lastname;
    private String firstname;
    private String middlename;
    private String address;
    private String city;
    private String passportDate;

    public SubscriptionFee(String lastname, String firstname, String middlename, String address, String city,
            String passportDate) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.address = address;
        this.city = city;
        this.passportDate = passportDate;
    }

    public String toString() {
        return String.format("Абонент: %s %s %s, Адрес: %s, %s, Паспорт: %s", lastname, firstname, middlename, address,
                city, passportDate);
    }

}
