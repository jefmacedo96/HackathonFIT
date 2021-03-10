package br.ufc.crateus.agritech.service;


import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.crateus.agritech.model.Produto;
import br.ufc.crateus.agritech.repository.ProdutoRepository;

@Service
public class ProdutoService implements RepositoryService<Produto> {
	
	@Autowired
	private ProdutoRepository produtoRep;

	@Override
	public Produto add(Produto e) {
		if(e == null) return null;
		return produtoRep.save(e);
	}

	@Override
	public Produto get(Integer id) {
		Optional<Produto> produto = produtoRep.findById(id);

		if(produto.isPresent()) return produto.get();
		return null;
	}

	@Override
	public Produto update(Integer id, Produto e) {
		
		Optional<Produto> produto = produtoRep.findById(id);
		
		if(produto.isPresent()){
			produto.get().setNome(e.getNome());
			produto.get().setQuantidade(e.getQuantidade());
			produto.get().setValorUnitario(e.getValorUnitario());
			produto.get().setTipo(e.getTipo());
			produto.get().setPesoKg(e.getPesoKg());
			
			return produtoRep.save(produto.get());
		}
		

		return null;
	}

	@Override
	public boolean delete(Integer id) {
		
		if(produtoRep.existsById(id)) {
			produtoRep.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public boolean exists(Produto e) {
		if(e == null) return false;
		return produtoRep.findAll().stream().anyMatch(p -> p.equals(e));
	}

	@Override
	public Set<Produto> getAll() {
		Set<Produto> produtos = new LinkedHashSet<Produto>(produtoRep.findAll());
		return produtos;
	}
	


}
