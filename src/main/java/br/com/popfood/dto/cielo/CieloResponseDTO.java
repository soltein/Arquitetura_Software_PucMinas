package br.com.popfood.dto.cielo;

import java.util.List;

public class CieloResponseDTO {

    private String MerchantOrderId;
    private CustomerDTO Customer;
    private PaymentDTO Payment;
    private String Tid;
    private String ProofOfSale;
    private String AuthorizationCode;
    private String SoftDescriptor;
    private String Provider;
    private boolean IsQrCode;
    private int Amount;
    private String ReceivedDate;
    private int Status;
    private boolean IsSplitted;
    private String ReturnMessage;
    private String ReturnCode;
    private String PaymentId;
    private String Type;
    private String Currency;
    private String Country;
    private List<String> Links;

    // getters and setters

    public String getMerchantOrderId() {
        return MerchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        MerchantOrderId = merchantOrderId;
    }

    public CustomerDTO getCustomer() {
        return Customer;
    }

    public void setCustomer(CustomerDTO customer) {
        Customer = customer;
    }

    public PaymentDTO getPayment() {
        return Payment;
    }

    public void setPayment(PaymentDTO payment) {
        Payment = payment;
    }

    public String getTid() {
        return Tid;
    }

    public void setTid(String tid) {
        Tid = tid;
    }

    public String getProofOfSale() {
        return ProofOfSale;
    }

    public void setProofOfSale(String proofOfSale) {
        ProofOfSale = proofOfSale;
    }

    public String getAuthorizationCode() {
        return AuthorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        AuthorizationCode = authorizationCode;
    }

    public String getSoftDescriptor() {
        return SoftDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        SoftDescriptor = softDescriptor;
    }

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String provider) {
        Provider = provider;
    }

    public boolean isQrCode() {
        return IsQrCode;
    }

    public void setQrCode(boolean qrCode) {
        IsQrCode = qrCode;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getReceivedDate() {
        return ReceivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        ReceivedDate = receivedDate;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public boolean isSplitted() {
        return IsSplitted;
    }

    public void setSplitted(boolean splitted) {
        IsSplitted = splitted;
    }

    public String getReturnMessage() {
        return ReturnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        ReturnMessage = returnMessage;
    }

    public String getReturnCode() {
        return ReturnCode;
    }

    public void setReturnCode(String returnCode) {
        ReturnCode = returnCode;
    }

    public String getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(String paymentId) {
        PaymentId = paymentId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
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

    public List<String> getLinks() {
        return Links;
    }

    public void setLinks(List<String> links) {
        Links = links;
    }
}
