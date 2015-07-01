package demo.model;

import org.springframework.data.annotation.Id;


public class Customer {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;

    public Customer() {}

    public Customer(String firstName, String lastName, Address address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s, address=%s, phoneNumber=%s']",
                id, firstName, lastName, address.toString(), phoneNumber);
    }

}

