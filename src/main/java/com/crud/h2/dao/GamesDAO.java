package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Games;

public interface GamesDAO extends JpaRepository<Games, Long>{
	
	//Listar games por campo nombre
	public List<Games> findByNombre(String nombre);
	
}
