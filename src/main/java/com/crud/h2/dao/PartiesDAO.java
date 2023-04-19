package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Parties;

public interface PartiesDAO extends JpaRepository<Parties, Long>{
	
	//Listar parties por campo nombre
	public List<Parties> findByNombre(String nombre);
	public List<Parties> findByGameNombre(String nombre);
}
