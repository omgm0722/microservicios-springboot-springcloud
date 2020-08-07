package com.omgm.servicio.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.omgm.servicio.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
