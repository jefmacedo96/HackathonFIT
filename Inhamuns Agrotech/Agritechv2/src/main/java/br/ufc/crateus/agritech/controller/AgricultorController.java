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

import br.ufc.crateus.agritech.model.Agricultor;
import br.ufc.crateus.agritech.service.AgricultorService;



@CrossOrigin	
@RestController
@RequestMapping(path="/api/agritech/agricultor")
public class AgricultorController {
	
	@Autowired
	private AgricultorService agriService;
	
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Agricultor>> getAgricultores() {
		return new ResponseEntity<List<Agricultor>>(agriService.getAgricultores(),HttpStatus.OK);
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Agricultor> add(@RequestBody Agricultor agri){
   	 	
   	
   	 return new ResponseEntity<Agricultor>(agriService.addAgricultor(agri), HttpStatus.OK);
   	 
    }

}
