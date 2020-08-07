package com.omgm.servicio.items.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omgm.servicio.items.clients.ProductoClientRest;
import com.omgm.servicio.items.models.Item;

@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {

	@Autowired
	private  ProductoClientRest clientFeign;
	
	@Override
	public List<Item> findAll() {
		return clientFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(clientFeign.detalle(id), cantidad);
	}

}
