package br.com.financas.minhasfinancas.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.financas.minhasfinancas.exceptions.RegraNegocioException;
import br.com.financas.minhasfinancas.model.entity.Usuario;
import br.com.financas.minhasfinancas.model.repository.UsuarioRepository;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Profile("test")
class UsuarioServiceTest {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Test
	void testAutenticar() {
		// fail("Not yet implemented");
	}

	@Test
	void testSalvarUsuario() {
		// fail("Not yet implemented");
	}

	@Test
	void testValidarEmailNaoLancaErroSeNaoExisteCadastrado() {
		Assertions.assertDoesNotThrow(() -> {
			// Arrange
			usuarioRepository.deleteAll();
			// Act
			usuarioService.validarEmail("email@email.com");
			// Assert
		});
	}
	
	@Test
	void testValidarEmailLancaErroSeJaExisteCadastrado() {
		Assertions.assertThrows(RegraNegocioException.class, () -> {
			// Arrange
			Usuario usuario = Usuario.builder().nome("usuario").email("email@email.com").build();
			usuarioRepository.save(usuario);
			// Act
			usuarioService.validarEmail("email@email.com");
			// Assert			
		});		
	}

}
