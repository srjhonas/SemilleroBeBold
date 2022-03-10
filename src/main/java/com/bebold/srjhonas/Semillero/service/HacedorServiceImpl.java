package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bebold.srjhonas.Semillero.model.Hacedor;
import com.bebold.srjhonas.Semillero.repository.HacedorRepository;

@Service
public class HacedorServiceImpl implements HacedorService{

	@Autowired
	private HacedorRepository hacedorRepository;
		
	@Override
	@Transactional(readOnly = true)
	public List<Hacedor> getAllHacedores() {
		return hacedorRepository.findAll();
	}

	@Override
	public Hacedor CrearHacedor(Hacedor hacedor) {
		return hacedorRepository.save(hacedor);
	}

	@Override
	public void deleteHacedor(Integer id_hacedor) {
		hacedorRepository.deleteById(id_hacedor);
		
	}

}
