package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import com.bebold.srjhonas.Semillero.model.ServicioHacedorApto;

public interface ServicioHacedorAptoService {
	public ServicioHacedorApto CrearHacedorApto(ServicioHacedorApto servicioHacedorApto);
	public List<Object> MuroSolicitudes(Integer id_hacedor);
}
