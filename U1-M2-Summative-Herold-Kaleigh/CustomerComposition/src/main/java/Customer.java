public class Customer implements CustomerInterface{
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Address shippingAddress;
    private Address billingAddress;
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

    public boolean getRewardsMember() {

        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {

        this.rewardsMember = rewardsMember;
    }

    public Customer(String getFirstName, String getLastName, String getEmail, String getPhoneNumber, Address shippingAddress, Address billingAddress, boolean rewardsMember) {
        this.firstName = getFirstName;
        this.lastName = getLastName;
        this.email = getEmail;
        this.phoneNumber = getPhoneNumber;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.rewardsMember = rewardsMember;
    }
}
