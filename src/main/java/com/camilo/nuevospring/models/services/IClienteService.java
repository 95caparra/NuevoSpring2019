package com.camilo.nuevospring.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.camilo.nuevospring.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Cliente findById(Long id);
}
