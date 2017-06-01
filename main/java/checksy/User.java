package checksy;

/**
 * Created by chris on 21/05/2017.
 */
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String nickName;
    private String streetName;
    private String houseNumber;
    private String city;
    private String country;
    private String phoneNumber;

    public User(long id, String firstName, String lastName, String nickName, String streetName, String houseNumber, String city, String country, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (nickName != null ? !nickName.equals(user.nickName) : user.nickName != null) return false;
        if (streetName != null ? !streetName.equals(user.streetName) : user.streetName != null) return false;
        if (houseNumber != null ? !houseNumber.equals(user.houseNumber) : user.houseNumber != null) return false;
        if (city != null ? !city.equals(user.city) : user.city != null) return false;
        if (country != null ? !country.equals(user.country) : user.country != null) return false;
        return phoneNumber != null ? phoneNumber.equals(user.phoneNumber) : user.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (streetName != null ? streetName.hashCode() : 0);
        result = 31 * result + (houseNumber != null ? houseNumber.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}
