package com.bebold.srjhonas.Semillero.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bebold.srjhonas.Semillero.model.SolicitudServicio;
import com.bebold.srjhonas.Semillero.repository.SolicitudServicioRepository;

@Service
public class SolicitudServicioServiceImpl implements SolicitudServicioService{
	@Autowired
	private SolicitudServicioRepository solicitudServicioRepository;

	@Override
	@Transactional(readOnly = true)
	public List<SolicitudServicio> getAllSolicitudServicio() {
		return solicitudServicioRepository.findAll();
	}

	@Override
	public SolicitudServicio CrearSolicitudServicio(SolicitudServicio solicitudServicio) {
		return solicitudServicioRepository.save(solicitudServicio);
	}

	@Override
	public void deleteSolicitudServicio(Integer id_sol_serv) {
		solicitudServicioRepository.deleteById(id_sol_serv);
	}

}
