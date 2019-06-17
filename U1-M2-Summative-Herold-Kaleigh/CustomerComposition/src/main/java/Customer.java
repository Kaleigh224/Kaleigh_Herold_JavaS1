public class Customer implements CustomerInterface{
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipCode;

    private boolean rewardsMember;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public boolean isRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    public Customer(String getFirstName, String getLastName, String getEmail, String getPhoneNumber, String getStreet1, String getStreet2, String getCity, String getState, String getZipCode, boolean getRewardsMember) {
        this.firstName = getFirstName;
        this.lastName = getLastName;
        this.email = getEmail;
        this.phoneNumber = getPhoneNumber;
        this.street1 = getStreet1;
        this.street2 = getStreet2;
        this.city = getCity;
        this.state = getState;
        this.zipCode = getZipCode;
        this.rewardsMember = getRewardsMember;
    }


    @Override
    public void getCustomer() {

    }

    @Override
    public void shippingAddress() {

    }

    @Override
    public void billingAddress() {

    }
}
