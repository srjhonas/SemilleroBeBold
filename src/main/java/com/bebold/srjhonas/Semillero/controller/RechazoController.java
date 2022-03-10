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

import com.bebold.srjhonas.Semillero.model.Rechazo;
import com.bebold.srjhonas.Semillero.service.RechazoService;

@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class RechazoController {
	@Autowired
	RechazoService rechazoService;
	
	@GetMapping("/Rechazo")
	public ResponseEntity<?> TraerRechazo(){
		return ResponseEntity.ok().body(rechazoService.getAllRechazo());
	}
	
	@PostMapping("/Rechazo")
	public ResponseEntity<Rechazo> createRechazo(@RequestBody Rechazo rechazo) {
		try {
			Rechazo _rechazo = rechazoService.CrearRechazo(rechazo);		
			return new ResponseEntity<>(_rechazo, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping("/Rechazo/{id}")
	public ResponseEntity<HttpStatus> deleteRechazo(@PathVariable("id") Integer id_rechazo) {
		try {
			rechazoService.deleteRechazo(id_rechazo);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
		
}
