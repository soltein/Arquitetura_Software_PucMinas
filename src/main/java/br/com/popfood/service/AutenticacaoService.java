package br.com.popfood.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.popfood.dto.UsuarioDetalhesDto;
import br.com.popfood.model.Cliente;
import br.com.popfood.model.Usuario;
import br.com.popfood.repository.ClienteRepository;
import br.com.popfood.repository.UsuarioRepository;

import java.util.Optional;

@Service
public class AutenticacaoService implements UserDetailsService {

  @Autowired
  private UsuarioRepository usuarioRepository;
  
  @Autowired
  private ClienteRepository clienteRepository;

  // Método da interface implementada
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    Optional<Usuario> usuarioOpt = usuarioRepository.findByEmail(username);
    Optional<Cliente> clienteOpt = clienteRepository.findByEmail(username);

    if (usuarioOpt.isEmpty() && clienteOpt.isEmpty()) {

      throw new UsernameNotFoundException(String.format("usuario: %s nao encontrado", username));
    } else if (usuarioOpt.isEmpty()) {
    	return new UsuarioDetalhesDto(clienteOpt.get());
    } else {
    	return new UsuarioDetalhesDto(usuarioOpt.get());
    }

    
  }
}