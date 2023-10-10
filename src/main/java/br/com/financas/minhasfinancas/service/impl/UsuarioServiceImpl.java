package br.com.financas.minhasfinancas.service.impl;

import br.com.financas.minhasfinancas.model.entity.Usuario;
import br.com.financas.minhasfinancas.model.repository.UsuarioRepository;
import br.com.financas.minhasfinancas.service.UsuarioService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository repository;

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		// TODO Auto-generated method stub
		
	}

}
