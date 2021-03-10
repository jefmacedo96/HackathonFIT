package br.ufc.crateus.agritech.service;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.crateus.agritech.model.Agricultor;
import br.ufc.crateus.agritech.repository.AgricultorRepository;

@Service
public class AgricultorService implements RepositoryService<Agricultor> {
	
	@Autowired
	private AgricultorRepository agricultorRep;
	

	@Override
	public Agricultor add(Agricultor e) {
		if(e == null) return null;
		return agricultorRep.save(e);
	}
	
	@Override
	public Agricultor get(Integer id) {
		
		Optional<Agricultor> agricultor = agricultorRep.findById(id);
		if(agricultor.isPresent()) return agricultor.get();
		return null;
	}
	
	@Override
	public Agricultor update(Integer id, Agricultor e) {
		
		Optional<Agricultor> agricultor = agricultorRep.findById(id);
		
		if(agricultor.isPresent()) {
			
			agricultor.get().setNome(e.getNome());
			agricultor.get().setRegistroRural(e.getRegistroRural());
			agricultor.get().setEndereco(e.getEndereco());
			agricultor.get().setLocalizacao(e.getLocalizacao());
			agricultor.get().setUf(e.getUf());
			agricultor.get().setCpf(e.getCpf());
			agricultor.get().setTelefone(e.getTelefone());
			agricultor.get().setEmail(e.getEmail());
			agricultor.get().setSenha(e.getSennha());
	        
			return agricultorRep.save(agricultor.get());
			
		}
		return null;
	}
	
	@Override
	public boolean delete(Integer id) {
		
		if(agricultorRep.existsById(id)) {
			agricultorRep.deleteById(id);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean exists(Agricultor e) {
		if(e == null) return false;
		return agricultorRep.findAll().stream().anyMatch(a -> a.equals(e));
	}
	
	@Override
	public Set<Agricultor> getAll() {
		
		Set<Agricultor> agricultores = new LinkedHashSet<Agricultor>(agricultorRep.findAll());
	
		return agricultores;
	}


}
