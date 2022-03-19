package com.bebold.srjhonas.Semillero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.bebold.srjhonas.Semillero.model.Hacedor;

import com.bebold.srjhonas.Semillero.service.HacedorService;

@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class HacedorController {
	
	@Autowired
	HacedorService hacedorService;
	
	@GetMapping("/hacedores")
	public ResponseEntity<?> TraerHacedores(){
		return ResponseEntity.ok().body(hacedorService.getAllHacedores());
	}
	
	@PostMapping("/hacedores")
	public ResponseEntity<Hacedor> createHacedor(@RequestBody Hacedor hacedor) {
		try {
			Hacedor _hacedor = hacedorService.CrearHacedor(hacedor);		
			return new ResponseEntity<>(_hacedor, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping("/hacedores/{id}")
	public ResponseEntity<HttpStatus> deleteHacedor(@PathVariable("id") Integer id_hacedor) {
		try {
			hacedorService.deleteHacedor(id_hacedor);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/hacedores/login/{mail}")
	public ResponseEntity<?> loginHacedor(@PathVariable("mail") String emailHacedor){
		return ResponseEntity.ok().body(hacedorService.validarLoginH(emailHacedor));
	}
		

}
