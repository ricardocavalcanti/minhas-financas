package br.com.financas.minhasfinancas.service.impl;

import org.springframework.stereotype.Service;

import br.com.financas.minhasfinancas.exceptions.RegraNegocioException;
import br.com.financas.minhasfinancas.model.entity.Usuario;
import br.com.financas.minhasfinancas.model.repository.UsuarioRepository;
import br.com.financas.minhasfinancas.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{	
	
	private UsuarioRepository repository;	

	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

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
		if (repository.existsByEmail(email)) {
			throw new RegraNegocioException("Já existe um usuário cadastrado com esse e-mail.");
		}
	}

}
