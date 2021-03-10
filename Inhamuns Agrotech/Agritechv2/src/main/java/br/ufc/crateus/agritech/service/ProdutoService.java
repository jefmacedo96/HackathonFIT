package br.ufc.crateus.agritech.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.crateus.agritech.model.Produto;
import br.ufc.crateus.agritech.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
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
