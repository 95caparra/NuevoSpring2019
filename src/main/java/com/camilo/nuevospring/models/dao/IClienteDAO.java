package com.camilo.nuevospring.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.camilo.nuevospring.models.entity.Cliente;

public interface IClienteDAO extends JpaRepository<Cliente, Long> {

}
