package ru.stqa.addressbook;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String companyName;
    private final String email;

    public ContactData(String firstName, String lastName, String phoneNumber, String companyName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }
}
