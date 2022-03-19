package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bebold.srjhonas.Semillero.model.CiudadXHacedor;

import com.bebold.srjhonas.Semillero.repository.CiudadXHacedorRepository;

@Service
public class CiudadXHacedorImpl implements CiudadXHacedorService{
	@Autowired
	private CiudadXHacedorRepository ciudadXHacedorRepository;

	@Override
	@Transactional(readOnly = true)
	public List<CiudadXHacedor> getAllCiudadXHacedor() {
		return ciudadXHacedorRepository.findAll();
	}

	@Override
	public CiudadXHacedor CrearCiudadXHacedor(CiudadXHacedor ciudadXHacedor) {
		return ciudadXHacedorRepository.save(ciudadXHacedor);
	}

	@Override
	public void deleteCiudadXHacedor(Integer id_ciudadXHacedor) {
		ciudadXHacedorRepository.deleteById(id_ciudadXHacedor);
	}

	@Override
	public List<Object> ciudadesXHacedor(Integer id_hacedor) {
		return ciudadXHacedorRepository.listadoCiudadesXHacedor(id_hacedor);
	}

}
