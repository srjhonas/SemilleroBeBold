package com.bebold.srjhonas.Semillero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bebold.srjhonas.Semillero.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
