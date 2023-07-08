package br.com.popfood.dto;

import br.com.popfood.model.Cliente;

public class ClienteMapper {

  public static Cliente of(UsuarioCriacaoDto usuarioCriacaoDto) {
	  Cliente cliente = new Cliente();

    cliente.setEmail(usuarioCriacaoDto.getEmail());
    cliente.setNome(usuarioCriacaoDto.getNome());
    cliente.setSenha(usuarioCriacaoDto.getSenha());

    return cliente;
  }

  public static UsuarioTokenDto of(Cliente cliente, String token) {
    UsuarioTokenDto usuarioTokenDto = new UsuarioTokenDto();

    usuarioTokenDto.setUserId(cliente.getId());
    usuarioTokenDto.setEmail(cliente.getEmail());
    usuarioTokenDto.setNome(cliente.getNome());
    usuarioTokenDto.setToken(token);

    return usuarioTokenDto;
  }
}