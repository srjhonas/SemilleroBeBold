package com.bebold.srjhonas.Semillero.service;

import java.util.List;
import java.util.Optional;

import com.bebold.srjhonas.Semillero.model.SolicitudServicio;


public interface SolicitudServicioService {
	public List<SolicitudServicio> getAllSolicitudServicio();
	public SolicitudServicio CrearSolicitudServicio(SolicitudServicio solicitudServicio);
	public void deleteSolicitudServicio(Integer id_sol_serv);
	
	
	//metodo para buscar Solicitud por ID
	public Optional<SolicitudServicio> solicitudServicioById(Integer id_sol_serv);

}
