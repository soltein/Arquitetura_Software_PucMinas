package br.com.popfood.dto.cielo;

public class CieloPedidoDTO {

    private String MerchantOrderId;
    private CustomerDTO Customer;
    private PaymentDTO Payment;

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
}
