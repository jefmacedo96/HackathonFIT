package br.ufc.crateus.agritech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.crateus.agritech.model.Produto;
import br.ufc.crateus.agritech.service.ProdutoService;

@CrossOrigin	
@RestController
@RequestMapping(path = "/api/agritech/Produto")
public class ProdutoController {
	@Autowired
	ProdutoService prodService;
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Produto>> getProdutos() {
		return new ResponseEntity<List<Produto>>(prodService.getProdutos(),HttpStatus.OK);
    }
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Produto> add(@RequestBody Produto prod){
   	 	
   	
   	 return new ResponseEntity<Produto>(prodService.addProd(prod), HttpStatus.OK);
   	 
    }

}
