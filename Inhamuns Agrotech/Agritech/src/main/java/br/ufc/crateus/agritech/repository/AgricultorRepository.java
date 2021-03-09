package br.ufc.crateus.agritech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.crateus.agritech.model.Agricultor;

public interface AgricultorRepository extends JpaRepository<Agricultor, Integer> {

}
