package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Games;

public interface GamesService {

	//Metodos del CRUD
	public List<Games> listarGames(); //Listar All 
	
	public Games guardarGame(Games game); //Guarda un game CREATE
	
	public Games gameXID(Long id); //Leer datos de un game READ
	
	public List<Games> listarGamesNomnbre(String nombre);//Listar games por campo nombre
	
	public Games actualizarGame(Games game); //Actualiza datos de un game UPDATE
	
	public void eliminarGame(Long id);// Elimina un game DELETE
}
