package br.com.financas.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.financas.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
	

}
