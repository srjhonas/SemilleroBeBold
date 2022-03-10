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

import com.bebold.srjhonas.Semillero.model.TipoServicio;
import com.bebold.srjhonas.Semillero.service.TipoServicioService;

@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class TipoServicioController {
	@Autowired
	TipoServicioService tipoServicioService;
	
	@GetMapping("/TipoServicio")
	public ResponseEntity<?> TraerTipoServicio(){
		return ResponseEntity.ok().body(tipoServicioService.getAllTipoServicio());
	}
	
	@PostMapping("/TipoServicio")
	public ResponseEntity<TipoServicio> createTipoServicio(@RequestBody TipoServicio tipoServicio) {
		try {
			TipoServicio _tipoServicio = tipoServicioService.CrearTipoServicio(tipoServicio);		
			return new ResponseEntity<>(_tipoServicio, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping("/TipoServicio/{id}")
	public ResponseEntity<HttpStatus> deleteCliente(@PathVariable("id") Integer id_tipoServicio) {
		try {
			tipoServicioService.deleteTipoServicio(id_tipoServicio);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
		
	
	
}
