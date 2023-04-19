package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Mensajes;

public interface MensajesService {

	//Metodos del CRUD
	public List<Mensajes> listarMensajes(); //Listar All 
	
	public Mensajes guardarMensaje(Mensajes mensaje); //Guarda un mensaje CREATE
	
	public Mensajes mensajeXID(Long id); //Leer datos de un mensaje READ
	
	public void eliminarMensaje(Long id);// Elimina un mensaje DELETE
}
