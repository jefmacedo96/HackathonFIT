package br.ufc.crateus.agritech.service;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.crateus.agritech.model.MPEmpresa;
import br.ufc.crateus.agritech.repository.MPEmpresaRepository;

@Service
public class MPEmpresaService implements RepositoryService<MPEmpresa>{
	
	@Autowired
	private MPEmpresaRepository mpempresaRep;

	@Override
	public MPEmpresa add(MPEmpresa e) {
		if(e == null) return null;
		return mpempresaRep.save(e);
	}


	@Override
	public MPEmpresa get(Integer id) {
		Optional<MPEmpresa> empresa = mpempresaRep.findById(id);
		if(empresa.isPresent()) return empresa.get();
		return null;
	}

	
	@Override
	public MPEmpresa update(Integer id, MPEmpresa e) {
		
		Optional<MPEmpresa> empresa = mpempresaRep.findById(id);
		
		if(empresa.isPresent()) {
			
			empresa.get().setRazaoSocial(e.getRazaoSocial());
			empresa.get().setEndereco(e.getEndereco());
			empresa.get().setLocalizacao(e.getLocalizacao());
			empresa.get().setUf(e.getUf());
			empresa.get().setCnpj(e.getCnpj());
			empresa.get().setTelefone(e.getTelefone());
			empresa.get().setEmail(e.getEmail());
			
			return mpempresaRep.save(empresa.get());
		}
	
		return null;
	}

	@Override
	public boolean delete(Integer id) {
	    
		 if(mpempresaRep.existsById(id)) {
			 mpempresaRep.deleteById(id);
			 return true;
		 }
  
		return false;
	}

	@Override
	public boolean exists(MPEmpresa e) {
		if(e == null) return false;
		return mpempresaRep.findAll().stream().anyMatch(f -> f.equals(e));
	}

	@Override
	public Set<MPEmpresa> getAll() {
		Set<MPEmpresa> empresas = new LinkedHashSet<MPEmpresa>(mpempresaRep.findAll());
		return empresas;
	}
	

}
