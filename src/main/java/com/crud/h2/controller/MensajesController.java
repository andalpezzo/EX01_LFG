package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Mensajes;
import com.crud.h2.service.MensajesServiceImpl;

@RestController
@RequestMapping("/api")
public class MensajesController {
	
	@Autowired
	MensajesServiceImpl mensajesServiceImpl;
	
	@GetMapping("/mensajes")
	public List<Mensajes> listarMensajes(){
		return mensajesServiceImpl.listarMensajes();
	}
	
	@GetMapping("/mensajes/usuario/{username}")
	public List<Mensajes> findByUsuarioUsername(@PathVariable(name="username") String username) {
	    return mensajesServiceImpl.findByUsuarioUsername(username);
	}
	
	@PostMapping("/mensajes")
	public Mensajes salvarMensaje(@RequestBody Mensajes mensaje) {
		
		return mensajesServiceImpl.guardarMensaje(mensaje);
	}
	
	@GetMapping("/mensajes/{id}")
	public Mensajes mensajeXID(@PathVariable(name="id") Long id) {
		
		Mensajes mensaje_xid= new Mensajes();
		
		mensaje_xid=mensajesServiceImpl.mensajeXID(id);
		
		System.out.println("Mensaje x ID: "+mensaje_xid);
		
		return mensaje_xid;
	}
	
	@DeleteMapping("/mensajes/{id}")
	public void eleiminarMensaje(@PathVariable(name="id")Long id) {
		mensajesServiceImpl.eliminarMensaje(id);
	}
}
