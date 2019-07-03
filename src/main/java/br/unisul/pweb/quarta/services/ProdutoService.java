package br.unisul.pweb.quarta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Insumo;
import br.unisul.pweb.quarta.domain.Produto;
import br.unisul.pweb.quarta.repositories.InsumoRepository;
import br.unisul.pweb.quarta.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	@Autowired
	private InsumoRepository insrepo;
	
	public Produto find(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Produto> search(String nome, List<Integer> ids) {
		List<Insumo> insumos = insrepo.findAllById(ids);
		return repo.findDistinctByNomeContainingAndInsumosIn(nome, insumos);
	}
}
