package association;

public class AggregationDemo {
    public static void main(String[] args) {
        Address address = new Address();
        Employee employee = new Employee();
        employee.setAddress(address);

        System.out.println(employee.hashCode());
        System.out.println(address.hashCode());
        employee = null;
        System.out.println(address.hashCode());
    }
}


class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee() {}

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

class Address {
    private int buildingNo;
    private String streetName;
    private String locationName;
    private String city;
    private String state;
    private int zipCode;
    private String country;

    public Address() {}

    public Address(int buildingNo, String streetName, String locationName, String city, String state, int zipCode, String country) {
        this.buildingNo = buildingNo;
        this.streetName = streetName;
        this.locationName = locationName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
