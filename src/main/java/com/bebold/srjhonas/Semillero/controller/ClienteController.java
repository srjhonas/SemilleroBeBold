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

import com.bebold.srjhonas.Semillero.model.Cliente;

import com.bebold.srjhonas.Semillero.service.ClienteService;



@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/clientes")
	public ResponseEntity<?> TraerClientes(){
		return ResponseEntity.ok().body(clienteService.getAllClientes());
	}
	
	@PostMapping("/clientes")
	public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
		try {
			Cliente _cliente = clienteService.CrearCliente(cliente);		
			return new ResponseEntity<>(_cliente, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping("/clientes/{id}")
	public ResponseEntity<HttpStatus> deleteCliente(@PathVariable("id") Integer id_cliente) {
		try {
			clienteService.deleteCliente(id_cliente);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
		
	@GetMapping("/clientes/login/{mail}")
	public ResponseEntity<?> loginCliente(@PathVariable("mail") String email_cliente){
		return ResponseEntity.ok().body(clienteService.validarLogin(email_cliente));
	}
	
	
}
