package com.omgm.servicio.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.omgm.servicio.productos.models.dao.ProductoDao;
import com.omgm.servicio.productos.models.entity.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoDao productoDao;
	
	@Override
	@Transactional
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null);
	}

}
