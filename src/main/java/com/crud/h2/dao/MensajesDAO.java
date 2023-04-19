package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Mensajes;

public interface MensajesDAO extends JpaRepository<Mensajes, Long>{
	
	//Listar clientes or campo nombre
	public List<Mensajes> findByUsuarioUsername(String username);
}
