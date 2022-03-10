package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bebold.srjhonas.Semillero.model.Rechazo;
import com.bebold.srjhonas.Semillero.repository.RechazoRepository;

@Service
public class RechazoServiceImpl implements RechazoService{
	@Autowired
	private RechazoRepository rechazoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Rechazo> getAllRechazo() {
		return rechazoRepository.findAll();
	}

	@Override
	public Rechazo CrearRechazo(Rechazo rechazo) {
		return rechazoRepository.save(rechazo);
	}

	@Override
	public void deleteRechazo(Integer id_rechazo) {
		rechazoRepository.deleteById(id_rechazo);
	}
}
