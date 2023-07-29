package br.com.popfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.popfood.dto.UsuarioLoginDto;
import br.com.popfood.dto.UsuarioTokenDto;
import br.com.popfood.service.ClienteService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
    @Autowired
    private ClienteService clienteService;	

	@GetMapping("/cliente")
	@SecurityRequirement(name = "Bearer")
	public String cliente() {
		return "Exemplo de retorno de acesso a área do cliente";
	}
	
    @PostMapping("/login")
    public ResponseEntity<UsuarioTokenDto> login(@RequestBody UsuarioLoginDto usuarioLoginDto) {
        UsuarioTokenDto usuarioTokenDto = this.clienteService.autenticar(usuarioLoginDto);

        return ResponseEntity.status(200).body(usuarioTokenDto);
    }	
	
}
