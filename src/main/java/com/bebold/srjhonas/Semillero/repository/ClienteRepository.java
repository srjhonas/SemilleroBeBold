package com.bebold.srjhonas.Semillero.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bebold.srjhonas.Semillero.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	List<Cliente> findByEmailCliente(String emailCliente);
	
}
