package com.idat.EC2DiandraRimabaqueBodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2DiandraRimabaqueBodega.model.Bodega;
import com.idat.EC2DiandraRimabaqueBodega.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService{

	@Autowired 
	private BodegaRepository repository;
	
	@Override
	public void guardarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		repository.save(bodega);
	}

	@Override
	public void actualizarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(bodega);
	}

	@Override
	public void eliminarBodega(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Bodega> listarBodega() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Bodega obtenerBodegaId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
