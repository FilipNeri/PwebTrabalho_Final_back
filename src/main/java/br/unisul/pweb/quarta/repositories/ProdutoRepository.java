package br.unisul.pweb.quarta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.pweb.quarta.domain.Insumo;
import br.unisul.pweb.quarta.domain.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
	List<Produto> findDistinctByNomeContainingAndInsumosIn(
			String nome,
			List<Insumo> insumos
	);
	
}