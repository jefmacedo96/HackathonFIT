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

import br.ufc.crateus.agritech.model.Produto;
import br.ufc.crateus.agritech.service.ProdutoService;

@CrossOrigin	
@RestController
@RequestMapping(path = "/api/agritech/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService prodService;
	
	@GetMapping
	public ResponseEntity<Set<Produto>> getAll(){
		return new ResponseEntity<>(prodService.getAll(), HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> get(@PathVariable("id") Integer id){
		return new ResponseEntity<>(prodService.get(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Produto> add(@RequestBody Produto produto){
		return new ResponseEntity<>(prodService.add(produto), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Produto> update(@PathVariable("id") Integer id, @RequestBody Produto produto){
		return new ResponseEntity<>(prodService.update(id, produto), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id){
    	return new ResponseEntity<>(prodService.delete(id), HttpStatus.OK);
    }
	

}
