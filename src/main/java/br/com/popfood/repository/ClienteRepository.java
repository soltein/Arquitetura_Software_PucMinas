package br.com.popfood.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.popfood.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	 Optional<Cliente> findByEmail(String email);
}
