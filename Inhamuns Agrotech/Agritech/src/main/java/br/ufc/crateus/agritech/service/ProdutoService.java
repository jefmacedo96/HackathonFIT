package br.ufc.crateus.agritech.service;


import java.util.List;

import br.ufc.crateus.agritech.model.Produto;
import br.ufc.crateus.agritech.repository.ProdutoRepository;

public class ProdutoService {
	private ProdutoRepository produtoRep;
	
	public Produto addProd(Produto prod) {
		if(prod.getNome() != "" && prod.getPesoKg() != 0 && prod.getQuantidade() != 0 && prod.getValorUnitario() != 0) {
			return produtoRep.save(prod);
			
		}
		return null;
		
	}
	public List<Produto> getProdutos(){
		return produtoRep.findAll();
	}

}
