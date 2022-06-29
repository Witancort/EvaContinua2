package com.idat.EC2DiandraRimabaqueBodega.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2DiandraRimabaqueBodega.dto.ProductoDTORequest;
import com.idat.EC2DiandraRimabaqueBodega.dto.ProductoDTOResponse;
import com.idat.EC2DiandraRimabaqueBodega.model.Productos;
import com.idat.EC2DiandraRimabaqueBodega.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public void guardarProducto(ProductoDTORequest productos) {
		// TODO Auto-generated method stub
		Productos p = new Productos();
		p.setProducto(productos.getProducto());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(productos.getPrecioProducto());
		p.setStock(productos.getStockProducto());
		repository.save(p);
	}

	@Override
	public void actualizarProducto(ProductoDTORequest productos) {
		// TODO Auto-generated method stub
		Productos p = new Productos();
		p.setIdProducto(productos.getIdProducto());
		p.setProducto(productos.getProducto());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(productos.getPrecioProducto());
		p.setStock(productos.getStockProducto());
		repository.save(p);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
public List<ProductoDTOResponse> listarProductos() {
		
		List<ProductoDTOResponse> listar = new ArrayList<>();
		ProductoDTOResponse dto = null;
		List<Productos> p = repository.findAll();
		
		for (Productos productos : p) {
			
			dto = new ProductoDTOResponse();
			
			dto.setDescripcionProducto(productos.getDescripcion());
			dto.setProducto(productos.getProducto());
			dto.setPrecioProducto(productos.getPrecio());
			dto.setStockProducto(productos.getStock());
			dto.setIdProducto(productos.getIdProducto());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public ProductoDTOResponse obtenerProductosId(Integer id) {
		
		Productos productos = repository.findById(id).orElse(null);
		ProductoDTOResponse dto = new ProductoDTOResponse();
		
		dto.setDescripcionProducto(productos.getDescripcion());
		dto.setProducto(productos.getProducto());
		dto.setPrecioProducto(productos.getPrecio());
		dto.setStockProducto(productos.getStock());
		dto.setIdProducto(productos.getIdProducto());
		
		return dto;
	}

}
