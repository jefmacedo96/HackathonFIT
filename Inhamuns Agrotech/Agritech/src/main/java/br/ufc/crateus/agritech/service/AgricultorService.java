package br.ufc.crateus.agritech.service;

import java.util.List;

import br.ufc.crateus.agritech.model.Agricultor;
import br.ufc.crateus.agritech.repository.AgricultorRepository;


public class AgricultorService {
	private AgricultorRepository agricultorRep;
	
	public Agricultor addAgricultor(Agricultor agri) {
		if(agri.getNome() != "" && agri.getCpf() != "" 
				&& agri.getRegistroRural() != "" && agri.getLocalizacao() != "" && agri.getEndereco() != "" 
				&& agri.getEmail() != "" && agri.getTelefone() != "" && agri.getUf() != "" && agri.getProdutos() != null) {
			return agricultorRep.save(agri);
		}
		return null;
		
		
	}
	public List<Agricultor> getAgricultores(){
		
		return agricultorRep.findAll();
	}

}
