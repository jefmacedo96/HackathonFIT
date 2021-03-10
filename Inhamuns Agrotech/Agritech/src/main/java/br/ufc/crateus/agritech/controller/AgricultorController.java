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

import br.ufc.crateus.agritech.model.Agricultor;
import br.ufc.crateus.agritech.service.AgricultorService;


@CrossOrigin	
@RestController
@RequestMapping(path = "/api/agritech/agricultor")
public class AgricultorController {
	
	@Autowired
	private AgricultorService agriService;
	
	@GetMapping
    public ResponseEntity<Set<Agricultor>> getAll() {
		return new ResponseEntity<>(agriService.getAll(),HttpStatus.OK);
    }
	
	@GetMapping("/{id}")
	public ResponseEntity<Agricultor> get(@PathVariable("id") Integer id){
		return new ResponseEntity<>(agriService.get(id), HttpStatus.OK);
	}
	
	@PostMapping
    public ResponseEntity<Agricultor> add(@RequestBody Agricultor agri){
   	 
   	  return new ResponseEntity<Agricultor>(agriService.add(agri), HttpStatus.OK);
   
    }
	
	@PutMapping("/{id}")
	public ResponseEntity<Agricultor> update(@PathVariable("id") Integer id, @RequestBody Agricultor agricultor){
		return new ResponseEntity<>(agriService.update(id, agricultor), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id){
		return new ResponseEntity<>(agriService.delete(id), HttpStatus.OK);
	}

}
