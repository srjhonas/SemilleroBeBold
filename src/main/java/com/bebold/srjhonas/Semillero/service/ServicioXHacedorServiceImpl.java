package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bebold.srjhonas.Semillero.model.ServicioXHacedor;
import com.bebold.srjhonas.Semillero.repository.ServicioXHacedorRepository;

@Service
public class ServicioXHacedorServiceImpl implements ServicioXHacedorService {
	@Autowired
	private ServicioXHacedorRepository servicioXHacedorRepository;

	@Override
	@Transactional(readOnly = true)
	public List<ServicioXHacedor> getAllServicioXHacedor() {
		return servicioXHacedorRepository.findAll();
	}

	@Override
	public ServicioXHacedor CrearServicioXHacedor(ServicioXHacedor servicioXHacedor) {
		return servicioXHacedorRepository.save(servicioXHacedor);
	}

	@Override
	public void deleteServicioXHacedor(Integer id_servicioXHacedor) {
		servicioXHacedorRepository.deleteById(id_servicioXHacedor);
	}

	@Override
	public List<String> hacedoresAptos(Integer id_tipo_servicio, Integer id_ciudad, Integer precio_esperado) {
		return servicioXHacedorRepository.hacedoresAptos(id_tipo_servicio, id_ciudad, precio_esperado);
	}

	

}
