package br.com.popfood.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

	@GetMapping("/cliente")
	public String cliente() {
		return "teste";
	}
}
