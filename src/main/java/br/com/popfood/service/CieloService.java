package br.com.popfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.popfood.dto.cielo.CieloPedidoDTO;
import br.com.popfood.dto.cielo.CieloResponseDTO;

@Service
public class CieloService {

    private static final String CIELO_API_URL = "https://apisandbox.cieloecommerce.cielo.com.br/1/sales"; // URL da API da Cielo

    private RestTemplate restTemplate;

    @Autowired
    public CieloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fazerPedido(CieloPedidoDTO pedido) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("MerchantId", "241aadc8-4b85-41ba-be19-2e88593614b5");
        headers.set("MerchantKey", "NWNDOAHGMEIKUYPTKYBIXMNIEGWWEZBMLTQFKXSN");
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<CieloPedidoDTO> requestEntity = new HttpEntity<>(pedido, headers);
        
        System.out.println(CIELO_API_URL);
        
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                CIELO_API_URL,
                HttpMethod.POST,
                requestEntity,
                String.class
        );
        System.out.println(responseEntity.getStatusCode());
        System.out.println(responseEntity.getBody());
        if (responseEntity.getStatusCode() == HttpStatus.CREATED) {
            return responseEntity.getBody();
        } else {
            throw new RuntimeException("Falha na chamada à API da Cielo");
        }
    }
}
