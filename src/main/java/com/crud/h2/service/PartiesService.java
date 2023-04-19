package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Parties;

public interface PartiesService {

	//Metodos del CRUD
	public List<Parties> listarParties(); //Listar All 
	
	public Parties guardarParty(Parties party); //Guarda una party CREATE
	
	public Parties partyXID(Long id); //Leer datos de una party READ
	
	public List<Parties> listarPartiesNombre(String nombre);//Listar parties por campo nombre
	
	public Parties actualizarParty(Parties party); //Actualiza datos de una party UPDATE
	
	public void eliminarParty(Long id);// Elimina una party DELETE
}
