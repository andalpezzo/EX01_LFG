package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Games;
import com.crud.h2.service.GamesServiceImpl;

@RestController
@RequestMapping("/api")
public class GamesController {
	
	@Autowired
	GamesServiceImpl gamesServiceImpl;
	
	@GetMapping("/games")
	public List<Games> listarGames(){
		return gamesServiceImpl.listarGames();
	}
	
	@GetMapping("/games/nombre/{nombre}")
	public List<Games> listarGamesNombre(@PathVariable(name="nombre") String nombre) {
	    return gamesServiceImpl.listarGamesNomnbre(nombre);
	}
	
	
	@PostMapping("/games")
	public Games salvarGame(@RequestBody Games game) {
		
		return gamesServiceImpl.guardarGame(game);
	}
	
	@GetMapping("/games/{id}")
	public Games gameXID(@PathVariable(name="id") Long id) {
		
		Games game_xid= new Games();
		
		game_xid=gamesServiceImpl.gameXID(id);
		
		System.out.println("Game x ID: "+game_xid);
		
		return game_xid;
	}
	
	@PutMapping("/games/{id}")
	public Games actualizarGame(@PathVariable(name="id")Long id,@RequestBody Games game) {
		
		Games game_seleccionado= new Games();
		Games game_actualizado= new Games();
		
		game_seleccionado= gamesServiceImpl.gameXID(id);
		game_seleccionado.setNombre(game.getNombre());
		game_seleccionado.setDescripcion(game.getDescripcion());
		game_seleccionado.setDificultad(game.getDificultad());
		
		game_actualizado = gamesServiceImpl.actualizarGame(game_seleccionado);
		
		System.out.println("El game actualizado es: "+ game_actualizado);
		
		return game_actualizado;
	}
	
	@DeleteMapping("/games/{id}")
	public void eleiminarGame(@PathVariable(name="id")Long id) {
		gamesServiceImpl.eliminarGame(id);
	}
}
