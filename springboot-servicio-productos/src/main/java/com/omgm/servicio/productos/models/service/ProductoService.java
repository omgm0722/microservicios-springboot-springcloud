package com.omgm.servicio.productos.models.service;

import java.util.List;

import com.omgm.servicio.productos.models.entity.Producto;

public interface ProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
	
}
