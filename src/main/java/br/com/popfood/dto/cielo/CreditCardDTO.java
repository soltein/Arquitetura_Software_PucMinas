package br.com.popfood.dto.cielo;

public class CreditCardDTO {

    private String CardNumber;
    private String Holder;
    private String ExpirationDate;
    private String SecurityCode;
    private boolean SaveCard;
    private String Brand;

    // getters and setters

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String holder) {
        Holder = holder;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getSecurityCode() {
        return SecurityCode;
    }

    public void setSecurityCode(String securityCode) {
        SecurityCode = securityCode;
    }

    public boolean isSaveCard() {
        return SaveCard;
    }

    public void setSaveCard(boolean saveCard) {
        SaveCard = saveCard;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}
