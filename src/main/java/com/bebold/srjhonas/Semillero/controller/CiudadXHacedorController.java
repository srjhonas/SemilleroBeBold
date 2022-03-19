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

import com.bebold.srjhonas.Semillero.model.CiudadXHacedor;
import com.bebold.srjhonas.Semillero.service.CiudadXHacedorService;

@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class CiudadXHacedorController {

	@Autowired
	CiudadXHacedorService ciudadXHacedorService;
	
	@GetMapping("/CiudadXHacedor")
	public ResponseEntity<?> TraerCiudadXHacedor(){
		return ResponseEntity.ok().body(ciudadXHacedorService.getAllCiudadXHacedor());
	}
	
	@PostMapping("/CiudadXHacedor")
	public ResponseEntity<CiudadXHacedor> createCiudadXHacedor(@RequestBody CiudadXHacedor ciudadXHacedor) {
		try {
			CiudadXHacedor _ciudadXHacedor = ciudadXHacedorService.CrearCiudadXHacedor(ciudadXHacedor);		
			return new ResponseEntity<>(_ciudadXHacedor, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping("/CiudadXHacedor/{id}")
	public ResponseEntity<HttpStatus> deleteCiudadXHacedor(@PathVariable("id") Integer id_ciudadXHacedor) {
		try {
			ciudadXHacedorService.deleteCiudadXHacedor(id_ciudadXHacedor);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
		
	@GetMapping("/CiudadXHacedor/{idhacedor}")
	public ResponseEntity<?> CiudadesXHacedor(@PathVariable("idhacedor") Integer id_hacedor){
		return ResponseEntity.ok().body(ciudadXHacedorService.ciudadesXHacedor(id_hacedor));
	}

}
