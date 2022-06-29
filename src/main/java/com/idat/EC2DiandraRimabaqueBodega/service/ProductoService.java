package com.idat.EC2DiandraRimabaqueBodega.service;

import java.util.List;

import com.idat.EC2DiandraRimabaqueBodega.dto.ProductoDTORequest;
import com.idat.EC2DiandraRimabaqueBodega.dto.ProductoDTOResponse;

public interface ProductoService {
	
	void guardarProducto(ProductoDTORequest productos);
	void actualizarProducto(ProductoDTORequest productos);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse> listarProductos();
	ProductoDTOResponse obtenerProductosId(Integer id);

}
