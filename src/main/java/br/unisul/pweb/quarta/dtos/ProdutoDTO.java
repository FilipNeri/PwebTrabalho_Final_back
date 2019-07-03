package br.unisul.pweb.quarta.dtos;

import java.io.Serializable;

import br.unisul.pweb.quarta.domain.Produto;

public class ProdutoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Integer qInsumo;
	private Double preco;

	public ProdutoDTO() {

	}
	
	public ProdutoDTO(Produto obj) {
		id = obj.getId();
		nome = obj.getNome();
		preco = obj.getPreco();
		qInsumo = obj.getqInsumo();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getqInsumo() {
		return qInsumo;
	}

	public void setqInsumo(Integer qInsumo) {
		this.qInsumo = qInsumo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}



	
	
	
	
	

}
