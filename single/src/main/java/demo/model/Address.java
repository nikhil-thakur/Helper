package demo.model;

/**
 * Created by nikhi_000 on 6/30/2015.
 */
public class Address {
    String flastNumber;
    String apartmentName;
    String areaName;
    String city;
    String zip;
    String country;

    public String getFlastNumber() {
        return flastNumber;
    }

    public void setFlastNumber(String flastNumber) {
        this.flastNumber = flastNumber;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (getFlastNumber() != null ? !getFlastNumber().equals(address.getFlastNumber()) : address.getFlastNumber() != null)
            return false;
        if (getApartmentName() != null ? !getApartmentName().equals(address.getApartmentName()) : address.getApartmentName() != null)
            return false;
        if (!getAreaName().equals(address.getAreaName())) return false;
        if (!getCity().equals(address.getCity())) return false;
        if (getZip() != null ? !getZip().equals(address.getZip()) : address.getZip() != null) return false;
        return !(getCountry() != null ? !getCountry().equals(address.getCountry()) : address.getCountry() != null);

    }

    @Override
    public int hashCode() {
        int result = getFlastNumber() != null ? getFlastNumber().hashCode() : 0;
        result = 31 * result + (getApartmentName() != null ? getApartmentName().hashCode() : 0);
        result = 31 * result + getAreaName().hashCode();
        result = 31 * result + getCity().hashCode();
        result = 31 * result + (getZip() != null ? getZip().hashCode() : 0);
        result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flastNumber='" + flastNumber + '\'' +
                ", apartmentName='" + apartmentName + '\'' +
                ", areaName='" + areaName + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
