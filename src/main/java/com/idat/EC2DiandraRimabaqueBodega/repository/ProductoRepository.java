package com.idat.EC2DiandraRimabaqueBodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2DiandraRimabaqueBodega.model.Productos;


@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer>{

}
