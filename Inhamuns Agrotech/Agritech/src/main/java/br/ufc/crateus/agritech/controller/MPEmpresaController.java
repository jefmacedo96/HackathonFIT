package br.ufc.crateus.agritech.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.crateus.agritech.service.MPEmpresaService;
import br.ufc.crateus.agritech.model.MPEmpresa;

@CrossOrigin	
@RestController
@RequestMapping(path = "/api/agritech/empresa")
public class MPEmpresaController {
	
	@Autowired
	private MPEmpresaService mpempresaService;

	
	@GetMapping
	public ResponseEntity<Set<MPEmpresa>> getAll(){
		return new ResponseEntity<>(mpempresaService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<MPEmpresa> get(@PathVariable("id") Integer id){
		return new ResponseEntity<>(mpempresaService.get(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<MPEmpresa> add(@RequestBody MPEmpresa empresa){
		return new ResponseEntity<>(mpempresaService.add(empresa), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<MPEmpresa> update(@PathVariable("id") Integer id, @RequestBody MPEmpresa empresa){
		return new ResponseEntity<>(mpempresaService.update(id, empresa), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id){
		return new ResponseEntity<>(mpempresaService.delete(id), HttpStatus.OK);
	}
	
}
