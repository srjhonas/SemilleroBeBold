package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bebold.srjhonas.Semillero.model.Ciudad;
import com.bebold.srjhonas.Semillero.repository.CiudadRepository;

@Service
public class CiudadServiceImpl implements CiudadService {
	
	@Autowired
	CiudadRepository ciudadRepository;
	
	@Override
	public List<Ciudad> ciudadesXdpto(String Depto) {	
		return ciudadRepository.ciudadesXdpto(Depto);
	}

}
