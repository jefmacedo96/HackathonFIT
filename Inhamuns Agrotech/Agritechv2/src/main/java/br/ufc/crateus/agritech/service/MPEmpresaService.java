package br.ufc.crateus.agritech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.crateus.agritech.model.MPEmpresa;
import br.ufc.crateus.agritech.repository.MPEmpresaRepository;

@Service
public class MPEmpresaService {
	
	@Autowired
	private MPEmpresaRepository mpempresaRep;
	
	public MPEmpresa addMPE(MPEmpresa empre) {
		if(empre.getNomeFantasia() != "" && empre.getRazaoSocial() != "" && empre.getCnpj() != "" 
				&& empre.getEmail() != "" && empre.getEndereco() != "" 
				&& empre.getUf() != "" && empre.getLocalizacao() != ""
				&& empre.getTelefone() != "") {
			return mpempresaRep.save(empre);
		
			
		}
		return null;
	}
	public List<MPEmpresa> getMPEmpresas(){
		
		return mpempresaRep.findAll();
	}

}