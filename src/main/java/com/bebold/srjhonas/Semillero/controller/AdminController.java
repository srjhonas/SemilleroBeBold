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

import com.bebold.srjhonas.Semillero.model.Admin;
import com.bebold.srjhonas.Semillero.service.AdminService;


@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE } )
@RestController
@RequestMapping("/api")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@GetMapping("/admin")
	public ResponseEntity<?> TraerAdmin(){
		return ResponseEntity.ok().body(adminService.getAllAdmin());
	}
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
		try {
			Admin _admin = adminService.CrearAdmin(admin);		
			return new ResponseEntity<>(_admin, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<HttpStatus> deleteAdmin(@PathVariable("id") Integer id_admin) {
		try {
			adminService.deleteAdmin(id_admin);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
		
	

}
