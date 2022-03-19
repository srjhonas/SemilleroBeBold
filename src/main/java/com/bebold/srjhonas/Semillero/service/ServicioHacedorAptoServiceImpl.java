package com.bebold.srjhonas.Semillero.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bebold.srjhonas.Semillero.model.ServicioHacedorApto;
import com.bebold.srjhonas.Semillero.repository.ServicioHacedorAptoRepository;


@Service
public class ServicioHacedorAptoServiceImpl implements ServicioHacedorAptoService  {

	@Autowired
	private ServicioHacedorAptoRepository servicioHacedorAptoRepository; 
	
	@Override
	public ServicioHacedorApto CrearHacedorApto(ServicioHacedorApto servicioHacedorApto) {
		return servicioHacedorAptoRepository.save(servicioHacedorApto);
	}

	@Override
	public List<Object> MuroSolicitudes(Integer id_hacedor) {
		
		return servicioHacedorAptoRepository.MuroSolicitudes(id_hacedor);
	}

	

}
