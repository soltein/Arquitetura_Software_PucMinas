package br.com.popfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.popfood.dto.cielo.AddressDTO;
import br.com.popfood.dto.cielo.CieloPedidoDTO;
import br.com.popfood.dto.cielo.CieloResponseDTO;
import br.com.popfood.dto.cielo.CreditCardDTO;
import br.com.popfood.dto.cielo.CustomerDTO;
import br.com.popfood.dto.cielo.PaymentDTO;
import br.com.popfood.service.CieloService;

@RestController
@RequestMapping("/cielo")
public class CieloController {

    private CieloService cieloService;

    @Autowired
    public CieloController(CieloService cieloService) {
        this.cieloService = cieloService;
    }

    @PostMapping("/pedido")
    public ResponseEntity<String> fazerPedido() {
        CieloPedidoDTO pedido = new CieloPedidoDTO();
        pedido.setMerchantOrderId("2014111701");

        CustomerDTO customer = new CustomerDTO();
        customer.setName("Comprador Teste");
        customer.setIdentity("11225468954");
        customer.setIdentityType("CPF");
        customer.setEmail("compradorteste@teste.com");
        customer.setBirthdate("1991-01-02");

        AddressDTO address = new AddressDTO();
        address.setStreet("Rua Teste");
        address.setNumber("123");
        address.setComplement("AP 123");
        address.setZipCode("12345987");
        address.setCity("Rio de Janeiro");
        address.setState("RJ");
        address.setCountry("BRA");

        customer.setAddress(address);
        customer.setDeliveryAddress(address);

        pedido.setCustomer(customer);

        PaymentDTO payment = new PaymentDTO();
        payment.setType("CreditCard");
        payment.setAmount(15700);
        payment.setCurrency("BRL");
        payment.setCountry("BRA");
        payment.setProvider("Simulado");
        payment.setServiceTaxAmount(0);
        payment.setInstallments(1);
        payment.setInterest("ByMerchant");
        payment.setCapture(false);
        payment.setAuthenticate(false);
        payment.setRecurrent(false);
        payment.setSoftDescriptor("123456789ABCD");

        CreditCardDTO creditCard = new CreditCardDTO();
        creditCard.setCardNumber("4024007197692931");
        creditCard.setHolder("Teste Holder");
        creditCard.setExpirationDate("12/2021");
        creditCard.setSecurityCode("123");
        creditCard.setSaveCard(false);
        creditCard.setBrand("Visa");

        payment.setCreditCard(creditCard);

        pedido.setPayment(payment);

        String response = cieloService.fazerPedido(pedido);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
