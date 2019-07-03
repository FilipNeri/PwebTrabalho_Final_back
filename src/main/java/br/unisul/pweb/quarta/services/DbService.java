package br.unisul.pweb.quarta.services;
import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Insumo;
import br.unisul.pweb.quarta.domain.Produto;
import br.unisul.pweb.quarta.repositories.InsumoRepository;
import br.unisul.pweb.quarta.repositories.ProdutoRepository;


@Service
public class DbService {

	@Autowired
	private InsumoRepository insrepo;
	
	@Autowired
	private InsumoRepository insRep;

	@Autowired
	private ProdutoRepository proRep;



	public void inicializaBancoDeDados() throws ParseException {

		Insumo ins1 = new Insumo(null, "Pao",1,1.0);
		Insumo ins2 = new Insumo(null, "Carne",2,2.0);
		Insumo ins3 = new Insumo(null, "Queijo",3,3.0);
		
		insrepo.saveAll(Arrays.asList(ins1, ins2, ins3));

		Produto p1 = new Produto(null,"Xsalada",5,10.50);
		Produto p2 = new Produto(null, "Xbruguer",6,9.50 );
		Produto p3 = new Produto(null,"xespecial",7,15.50);

		p1.getInsumos().addAll(Arrays.asList(ins1));
		p2.getInsumos().addAll(Arrays.asList(ins2));
		p3.getInsumos().addAll(Arrays.asList(ins3));

		ins1.getProdutos().addAll(Arrays.asList(p1));
		ins2.getProdutos().addAll(Arrays.asList(p2));
		ins3.getProdutos().addAll(Arrays.asList(p3));

		
		proRep.saveAll(Arrays.asList(p1,p2,p3));	
		insRep.saveAll(Arrays.asList(ins1, ins2, ins3));

	}

}





