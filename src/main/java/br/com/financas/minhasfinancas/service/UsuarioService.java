package br.com.financas.minhasfinancas.service;

import br.com.financas.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar (String email, String senha);
	
	Usuario salvarUsuario (Usuario usuario);
	
	void validarEmail(String email);

}
