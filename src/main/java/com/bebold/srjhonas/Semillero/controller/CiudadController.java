package com.bebold.srjhonas.Semillero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bebold.srjhonas.Semillero.service.CiudadService;

@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class CiudadController {
	@Autowired
	CiudadService ciudadService;

	@GetMapping("/ciudades/{depto}")
	public ResponseEntity<?> filtrarCiudadesxDepto(@PathVariable("depto") String depto){
		return ResponseEntity.ok().body(ciudadService.ciudadesXdpto(depto));
	}
}
