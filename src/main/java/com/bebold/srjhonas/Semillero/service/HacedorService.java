package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import com.bebold.srjhonas.Semillero.model.Hacedor;



public interface HacedorService {
	public List<Hacedor> getAllHacedores();
	public Hacedor CrearHacedor(Hacedor hacedor);
	public void deleteHacedor(Integer id_hacedor);
	public List<Hacedor> validarLoginH(String mailH);
}
