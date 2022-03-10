package com.bebold.srjhonas.Semillero.service;

import java.util.List;

import com.bebold.srjhonas.Semillero.model.Cliente;

public interface ClienteService {
	public List<Cliente> getAllClientes();
	public Cliente CrearCliente(Cliente cliente);
	public void deleteCliente(Integer id_cliente);
}
