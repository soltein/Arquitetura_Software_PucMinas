package br.com.popfood.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.popfood.configuration.security.jwt.GerenciadorTokenJwt;
import br.com.popfood.dto.UsuarioCriacaoDto;
import br.com.popfood.dto.UsuarioLoginDto;
import br.com.popfood.dto.UsuarioMapper;
import br.com.popfood.dto.UsuarioTokenDto;
import br.com.popfood.model.Usuario;
import br.com.popfood.repository.UsuarioRepository;

@Service
public class UsuarioService {

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private GerenciadorTokenJwt gerenciadorTokenJwt;

  @Autowired
  private AuthenticationManager authenticationManager;

  public void criar(UsuarioCriacaoDto usuarioCriacaoDto) {
    final Usuario novoUsuario = UsuarioMapper.of(usuarioCriacaoDto);

    String senhaCriptografada = passwordEncoder.encode(novoUsuario.getSenha());
    novoUsuario.setSenha(senhaCriptografada);

    this.usuarioRepository.save(novoUsuario);
  }

  public UsuarioTokenDto autenticar(UsuarioLoginDto usuarioLoginDto) {

    final UsernamePasswordAuthenticationToken credentials = new UsernamePasswordAuthenticationToken(
            usuarioLoginDto.getEmail(), usuarioLoginDto.getSenha());

    final Authentication authentication = this.authenticationManager.authenticate(credentials);

    Usuario usuarioAutenticado =
            usuarioRepository.findByEmail(usuarioLoginDto.getEmail())
                    .orElseThrow(
                            () -> new ResponseStatusException(404, "Email do usuário não cadastrado", null)
                    );

    SecurityContextHolder.getContext().setAuthentication(authentication);

    final String token = gerenciadorTokenJwt.generateToken(authentication);

    return UsuarioMapper.of(usuarioAutenticado, token);
  }
}