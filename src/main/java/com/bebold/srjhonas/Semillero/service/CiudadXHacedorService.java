package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import com.bebold.srjhonas.Semillero.model.CiudadXHacedor;



public interface CiudadXHacedorService {
	public List<CiudadXHacedor> getAllCiudadXHacedor();
	public CiudadXHacedor CrearCiudadXHacedor(CiudadXHacedor ciudadXHacedor);
	public void deleteCiudadXHacedor(Integer id_ciudadXHacedor);
}
