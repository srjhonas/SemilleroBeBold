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

import com.bebold.srjhonas.Semillero.model.ServicioXHacedor;
import com.bebold.srjhonas.Semillero.service.ServicioXHacedorService;

@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class ServicioXHacedorController {

	@Autowired
	ServicioXHacedorService servicioXHacedorService;
	
	@GetMapping("/ServicioXHacedor")
	public ResponseEntity<?> TraerServicioXHacedor(){
		return ResponseEntity.ok().body(servicioXHacedorService.getAllServicioXHacedor());
	}
	
	@PostMapping("/ServicioXHacedor")
	public ResponseEntity<ServicioXHacedor> createServicioXHacedor(@RequestBody ServicioXHacedor servicioXHacedor) {
		try {
			ServicioXHacedor _servicioXHacedor = servicioXHacedorService.CrearServicioXHacedor(servicioXHacedor);		
			return new ResponseEntity<>(_servicioXHacedor, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping("/ServicioXHacedor/{id}")
	public ResponseEntity<HttpStatus> deleteServicioXHacedor(@PathVariable("id") Integer id_servicioXHacedor) {
		try {
			servicioXHacedorService.deleteServicioXHacedor(id_servicioXHacedor);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	/// COdigo Nuevo
	@GetMapping("/HacedoresAptos/{ciudad}&{servicio}&{valor}")
	public ResponseEntity<?> buscarHacedoresAptos(@PathVariable("ciudad") Integer id_ciudad, 
			@PathVariable("servicio") Integer id_tipo_servicio,
			@PathVariable("valor") Integer precio_esperado){
		return ResponseEntity.ok().body(servicioXHacedorService.hacedoresAptos(id_tipo_servicio, id_ciudad, precio_esperado));
	}
	
}
