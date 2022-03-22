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

import com.bebold.srjhonas.Semillero.model.ServicioHacedorApto;

import com.bebold.srjhonas.Semillero.service.ServicioHacedorAptoService;

@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class ServicioHacedorAptoController {
	
	@Autowired
	ServicioHacedorAptoService servicioHacedorAptoService;
	
	@PostMapping("/ServicioHacedorApto")
	public ResponseEntity<ServicioHacedorApto> createServicioHacedorApto(@RequestBody ServicioHacedorApto servicioHacedorApto) {
		try {
			ServicioHacedorApto _servicioHacedorApto = servicioHacedorAptoService.CrearHacedorApto(servicioHacedorApto);		
			return new ResponseEntity<>(_servicioHacedorApto, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GetMapping("/MuroSolicitudes/{id_hacedor}")
	public ResponseEntity<?> MuroSolicitudesServicio(@PathVariable("id_hacedor")Integer id_hacedor){
		return ResponseEntity.ok().body(servicioHacedorAptoService.MuroSolicitudes(id_hacedor));
	}
	

	
	@DeleteMapping("/HacedoresAptosLimpiar/{idsolserv}")
	public ResponseEntity<HttpStatus> deleteSolAceptadas(@PathVariable("idsolserv") Integer idsolserv) {
		try {
			servicioHacedorAptoService.QuitarSS(idsolserv);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
