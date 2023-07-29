package br.com.popfood.dto.cielo;

public class CustomerDTO {

    private String Name;
    private String Identity;
    private String IdentityType;
    private String Email;
    private String Birthdate;
    private AddressDTO Address;
    private AddressDTO DeliveryAddress;

    // getters and setters

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String identity) {
        Identity = identity;
    }

    public String getIdentityType() {
        return IdentityType;
    }

    public void setIdentityType(String identityType) {
        IdentityType = identityType;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public AddressDTO getAddress() {
        return Address;
    }

    public void setAddress(AddressDTO address) {
        Address = address;
    }

    public AddressDTO getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(AddressDTO deliveryAddress) {
        DeliveryAddress = deliveryAddress;
    }
}
