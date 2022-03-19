package com.bebold.srjhonas.Semillero.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.bebold.srjhonas.Semillero.model.SolicitudServicio;
import com.bebold.srjhonas.Semillero.service.SolicitudServicioService;


@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class SolicitudServicioController {
	@Autowired
	SolicitudServicioService solicitudServicioService;
	
	@GetMapping("/SolicitudServicio")
	public ResponseEntity<?> TraerSolicitudServicio(){
		return ResponseEntity.ok().body(solicitudServicioService.getAllSolicitudServicio());
	}
	
	@PostMapping("/SolicitudServicio")
	public ResponseEntity<SolicitudServicio> createSolicitudServicio(@RequestBody SolicitudServicio solicitudServicio) {
		try {
			SolicitudServicio _solicitudServicio = solicitudServicioService.CrearSolicitudServicio(solicitudServicio);		
			return new ResponseEntity<>(_solicitudServicio, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping("/SolicitudServicio/{id}")
	public ResponseEntity<HttpStatus> deleteSolicitudServicio(@PathVariable("id") Integer id_sol_serv) {
		try {
			solicitudServicioService.deleteSolicitudServicio(id_sol_serv);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//metodo para Aceptarsolicitud
	@PutMapping("/aceptarSolicitud/{id}")
	public ResponseEntity<?> aceptarServicio(@PathVariable("id") Integer id, @RequestBody SolicitudServicio solserv){
		Optional<SolicitudServicio> solServData = solicitudServicioService.solicitudServicioById(id);
		if(solServData.isPresent()) {
			SolicitudServicio _solicitudServicio = solServData.get();
			_solicitudServicio.setEstado_sol_serv(solserv.getEstado_sol_serv());
			_solicitudServicio.setHacedor(solserv.getHacedor());
			return new ResponseEntity<>(solicitudServicioService.CrearSolicitudServicio(_solicitudServicio), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/ListaSolicitudServicio")
	public ResponseEntity<?> ListaSolicitudServicio(){
		return ResponseEntity.ok().body(solicitudServicioService.ListadoSolServicios());
	}
	
	@GetMapping("/numSolicitud")
	public ResponseEntity<?> numSolicitud(){
		return ResponseEntity.ok().body(solicitudServicioService.numSolServicio());
	}
	
		

}
