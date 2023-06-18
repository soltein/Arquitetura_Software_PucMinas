package br.com.popfood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

	@GetMapping("cliente")
	public String cliente() {
		return "teste";
	}
}
