package homework_week_3;

/**
 * Created by Администратор on 19.04.2015.
 */
public class Address {
    private String country;
    private String city;
    private String street;
    private String build;

    public Address() {
    }

    public Address(String country, String city, String street, String build) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.build = build;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String toString (){
        return ("Country = " + getCountry()
                + ", city = " + getCity()
                + ", street = " + getStreet()
                + ", build = "+ getBuild()
        );
    }
}
