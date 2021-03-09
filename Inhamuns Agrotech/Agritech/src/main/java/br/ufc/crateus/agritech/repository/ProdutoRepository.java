package br.ufc.crateus.agritech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.crateus.agritech.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
