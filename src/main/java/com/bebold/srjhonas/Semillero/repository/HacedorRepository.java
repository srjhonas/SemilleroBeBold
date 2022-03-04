package com.bebold.srjhonas.Semillero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bebold.srjhonas.Semillero.model.Hacedor;

@Repository
public interface HacedorRepository extends JpaRepository<Hacedor, Integer>{

}
