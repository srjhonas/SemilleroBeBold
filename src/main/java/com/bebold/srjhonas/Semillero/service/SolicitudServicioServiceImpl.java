package com.bebold.srjhonas.Semillero.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Optional<SolicitudServicio> solicitudServicioById(Integer id_sol_serv) {
		return solicitudServicioRepository.findById(id_sol_serv);
	}

	@Override
	public List<Object> ListadoSolServicios(Integer id_hacedor) {
		return solicitudServicioRepository.ListadoSolicitudesServ(id_hacedor);
	}

	@Override
	public Integer numSolServicio() {
		return solicitudServicioRepository.numSolicitud();
	}

//	@Override
//	public List<Object> ListadoSolServiciosCli(Integer id_cliente) {
//		return solicitudServicioRepository.ListadoSolicitudesServ(id_cliente);
//	}

//	@Override
//	public List<SolicitudServicio> ServiciosSolicitados(Integer cliente) {
//		
//		return solicitudServicioRepository.findByCliente(cliente);
//	}

	@Override
	public List<Object> PanelSolicitudesCliente(Integer id_cliente) {
		
		return solicitudServicioRepository.PanelSolicitudesCliente(id_cliente);
	}

	
}
