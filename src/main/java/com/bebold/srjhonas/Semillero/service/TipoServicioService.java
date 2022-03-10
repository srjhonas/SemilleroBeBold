package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import com.bebold.srjhonas.Semillero.model.TipoServicio;


public interface TipoServicioService {
	public List<TipoServicio> getAllTipoServicio();
	public TipoServicio CrearTipoServicio(TipoServicio tipoServicio);
	public void deleteTipoServicio(Integer id_tipoServicio);

}
