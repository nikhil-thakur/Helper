package demo.model;

import org.springframework.data.annotation.Id;

/**
 * Created by nikhi_000 on 7/27/2015.
 */
public class Helper {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Helper(String firstName, String lastName, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public Helper() {
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Helper{" +
                "address='" + address + '\'' +
                ", phone=" + phone +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Helper)) return false;

        Helper helper = (Helper) o;

        if (!getId().equals(helper.getId())) return false;
        if (!getFirstName().equals(helper.getFirstName())) return false;
        if (!getLastName().equals(helper.getLastName())) return false;
        if (!getPhone().equals(helper.getPhone())) return false;
        return getAddress().equals(helper.getAddress());

    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getPhone().hashCode();
        result = 31 * result + getAddress().hashCode();
        return result;
    }
}
