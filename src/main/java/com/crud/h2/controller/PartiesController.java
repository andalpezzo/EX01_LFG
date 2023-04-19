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
import com.crud.h2.dto.Parties;
import com.crud.h2.service.PartiesServiceImpl;

@RestController
@RequestMapping("/api")
public class PartiesController {
	
	@Autowired
	PartiesServiceImpl partiesServiceImpl;
	
	@GetMapping("/parties")
	public List<Parties> listarParties(){
		return partiesServiceImpl.listarParties();
		
	}
	
	@GetMapping("/parties/nombre/{nombre}")
	public List<Parties> listarPartiesNombre(@PathVariable(name="nombre") String nombre) {
	    return partiesServiceImpl.listarPartiesNombre(nombre);
	}
	
	@GetMapping("/parties/juego/{nombre}")
	public List<Parties> findByGameNombre(@PathVariable(name="nombre") String nombre) {
	    return partiesServiceImpl.findByGameNombre(nombre);
	}
	
	@PostMapping("/parties")
	public Parties salvarParty(@RequestBody Parties party) {
		
		return partiesServiceImpl.guardarParty(party);
	}
	
	@GetMapping("/parties/{id}")
	public Parties partyXID(@PathVariable(name="id") Long id) {
		
		Parties party_xid= new Parties();
		
		party_xid=partiesServiceImpl.partyXID(id);
		
		System.out.println("Party x ID: "+party_xid);
		
		return party_xid;
	}
	
	@PutMapping("/parties/{id}")
	public Parties actualizarParty(@PathVariable(name="id")Long id,@RequestBody Parties party) {
		
		Parties party_seleccionado= new Parties();
		Parties party_actualizado= new Parties();
		
		party_seleccionado= partiesServiceImpl.partyXID(id);
		party_seleccionado.setNombre(party.getNombre());
		party_seleccionado.setGame(party.getGame());
		
		party_actualizado = partiesServiceImpl.actualizarParty(party_seleccionado);
		
		System.out.println("El party actualizado es: "+ party_actualizado);
		
		return party_actualizado;
	}
	
	@DeleteMapping("/parties/{id}")
	public void eleiminarParty(@PathVariable(name="id")Long id) {
		partiesServiceImpl.eliminarParty(id);
	}
}
