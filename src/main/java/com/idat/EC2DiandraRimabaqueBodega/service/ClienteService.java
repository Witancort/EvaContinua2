package com.idat.EC2DiandraRimabaqueBodega.service;

import java.util.List;

import com.idat.EC2DiandraRimabaqueBodega.model.Cliente;

public interface ClienteService {
	
	void guardarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	List<Cliente> listarCliente();
	Cliente obtenerClienteId(Integer id);
}
