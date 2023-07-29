package br.com.popfood.dto.cielo;

public class PaymentDTO {

    private String Type;
    private int Amount;
    private String Currency;
    private String Country;
    private String Provider;
    private int ServiceTaxAmount;
    private int Installments;
    private String Interest;
    private boolean Capture;
    private boolean Authenticate;
    private boolean Recurrent;
    private String SoftDescriptor;
    private CreditCardDTO CreditCard;

    // getters and setters

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String provider) {
        Provider = provider;
    }

    public int getServiceTaxAmount() {
        return ServiceTaxAmount;
    }

    public void setServiceTaxAmount(int serviceTaxAmount) {
        ServiceTaxAmount = serviceTaxAmount;
    }

    public int getInstallments() {
        return Installments;
    }

    public void setInstallments(int installments) {
        Installments = installments;
    }

    public String getInterest() {
        return Interest;
    }

    public void setInterest(String interest) {
        Interest = interest;
    }

    public boolean isCapture() {
        return Capture;
    }

    public void setCapture(boolean capture) {
        Capture = capture;
    }

    public boolean isAuthenticate() {
        return Authenticate;
    }

    public void setAuthenticate(boolean authenticate) {
        Authenticate = authenticate;
    }

    public boolean isRecurrent() {
        return Recurrent;
    }

    public void setRecurrent(boolean recurrent) {
        Recurrent = recurrent;
    }

    public String getSoftDescriptor() {
        return SoftDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        SoftDescriptor = softDescriptor;
    }

    public CreditCardDTO getCreditCard() {
        return CreditCard;
    }

    public void setCreditCard(CreditCardDTO creditCard) {
        CreditCard = creditCard;
    }
}
