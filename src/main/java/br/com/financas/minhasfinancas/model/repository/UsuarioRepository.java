package br.com.financas.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.financas.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	

}
