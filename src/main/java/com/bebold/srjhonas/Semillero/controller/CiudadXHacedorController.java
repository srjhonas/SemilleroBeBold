package com.bebold.srjhonas.Semillero.controller;

import java.util.List;

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

import com.bebold.srjhonas.Semillero.model.CiudadXHacedor;
import com.bebold.srjhonas.Semillero.model.Cliente;
import com.bebold.srjhonas.Semillero.repository.CiudadXHacedorRepository;

@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class CiudadXHacedorController {
	@Autowired
	CiudadXHacedorRepository ciudadXHacedorRepository;
	
	@GetMapping("/ciudadxhacedor")
	public List<CiudadXHacedor> getAllCiudadesXHacedor() {
		return ciudadXHacedorRepository.findAll();	
	}
	
	@PostMapping("/ciudadxhacedor")
	public ResponseEntity<CiudadXHacedor> agregarCiudadHacedor(@RequestBody CiudadXHacedor cxh) {
		try {
			CiudadXHacedor _cxh = ciudadXHacedorRepository.save(cxh);		
			return new ResponseEntity<>(_cxh, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/ciudadxhacedor/{id}")
	public ResponseEntity<HttpStatus> eliminarCiudadHacedor(@PathVariable("id") Integer id_ciudadxhacedor) {
		try {
			ciudadXHacedorRepository.deleteById(id_ciudadxhacedor);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
