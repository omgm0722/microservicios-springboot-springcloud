package com.omgm.servicio.items.models.service;

import java.util.List;

import com.omgm.servicio.items.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	
}
