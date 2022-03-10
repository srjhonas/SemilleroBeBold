package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bebold.srjhonas.Semillero.model.TipoServicio;
import com.bebold.srjhonas.Semillero.repository.TipoServicioRepository;

@Service
public class TipoServicioServiceImpl implements TipoServicioService {
	@Autowired
	private TipoServicioRepository tipoServicioRepository;

	@Override
	@Transactional(readOnly = true)
	public List<TipoServicio> getAllTipoServicio() {
		return tipoServicioRepository.findAll();
	}

	@Override
	public TipoServicio CrearTipoServicio(TipoServicio tipoServicio) {
		return tipoServicioRepository.save(tipoServicio);
	}

	@Override
	public void deleteTipoServicio(Integer id_tipoServicio) {
		tipoServicioRepository.deleteById(id_tipoServicio);
	}

}
