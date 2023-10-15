package br.com.financas.minhasfinancas.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.financas.minhasfinancas.model.entity.Usuario;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Profile("test")
public class UsuarioRepositoryTest {
	
	/**
	 * Padrão Triple A : Arrange, Act, Assert (Cenário, Execução, Validação)
	 * 
	 */
	
	@Autowired
	UsuarioRepository repository;

	@Test
	public void testExistEmail() {
		// Arrange
		Usuario usuario = Usuario.builder().nome("usuario").email("usuario@email.com").build();
		repository.save(usuario);		
		// Act
		boolean result = repository.existsByEmail("usuario@email.com");
		// Assert
		Assertions.assertThat(result).isTrue();		
	}
	
	@Test
	public void testExistUser() {
		// Arrange
		repository.deleteAll();
		// Act
		boolean result = repository.existsByEmail("usuario@email.com");
		// Assert
		Assertions.assertThat(result).isFalse();
	}

}
