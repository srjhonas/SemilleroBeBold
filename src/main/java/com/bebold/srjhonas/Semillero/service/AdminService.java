package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import com.bebold.srjhonas.Semillero.model.Admin;



public interface AdminService {
	public List<Admin> getAllAdmin();
	public Admin CrearAdmin(Admin admin);
	public void deleteAdmin(Integer id_admin);
}
