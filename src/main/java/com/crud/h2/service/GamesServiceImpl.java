package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.GamesDAO;
import com.crud.h2.dto.Games;

@Service
public class GamesServiceImpl implements GamesService{
	
	//Utilizamos los metodos de la interface GamesDAO, es como si instaciaramos.
	@Autowired
	GamesDAO gamesDAO;
	
	@Override
	public List<Games> listarGames() {
		
		return gamesDAO.findAll();
	}

	@Override
	public Games guardarGame(Games game) {
		
		return gamesDAO.save(game);
	}

	@Override
	public Games gameXID(Long id) {
		
		return gamesDAO.findById(id).get();
	}
	
	@Override
	public List<Games> listarGamesNomnbre(String nombre) {
		
		return gamesDAO.findByNombre(nombre);
	}
	
	@Override
	public Games actualizarGame(Games game) {
		
		return gamesDAO.save(game);
	}

	@Override
	public void eliminarGame(Long id) {
		
		gamesDAO.deleteById(id);
		
	}
}
