package homework_week_1;
/**
 * 01/03/15 Homework ArtCode week 1
 */
    public class Address {
    private String country;
    private String city;
    private String street;
    private String building;

    public Address(String county, String city, String street, String building) {
        this.country = county;
        this.city = city;
        this.street = street;
        this.building = building;
    }

    /*Input name employee */
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getBuilding() {
        return building;
    }

    public String print() {
        return  ("Address : " + country + " ," + city + " ," + street + " , " + building);
    }

    public String toString (){
        return ("Country    City     Street   Building  \n"+getCountry()+"    "+getCity()+"     " + getStreet()+ "      " + getBuilding());
    }
}

