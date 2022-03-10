package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import com.bebold.srjhonas.Semillero.model.Rechazo;



public interface RechazoService {
	public List<Rechazo> getAllRechazo();
	public Rechazo CrearRechazo (Rechazo rechazo);
	public void deleteRechazo(Integer id_rechazo);
}
