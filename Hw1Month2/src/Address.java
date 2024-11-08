public class Address {

    private final String city;
    private final String street;
    private final int houseNumber;

    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString(){
        return city + ", " + street + " Kochosu, № " + houseNumber;
    }
}
