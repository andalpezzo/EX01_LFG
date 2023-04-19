package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.MensajesDAO;
import com.crud.h2.dto.Mensajes;

@Service
public class MensajesServiceImpl implements MensajesService{
	
	//Utilizamos los metodos de la interface MensajesDAO, es como si instaciaramos.
	@Autowired
	MensajesDAO mensajesDAO;
	
	@Override
	public List<Mensajes> listarMensajes() {
		
		return mensajesDAO.findAll();
	}

	@Override
	public Mensajes guardarMensaje(Mensajes mensaje) {
		
		return mensajesDAO.save(mensaje);
	}

	@Override
	public Mensajes mensajeXID(Long id) {
		
		return mensajesDAO.findById(id).get();
	}

	@Override
	public void eliminarMensaje(Long id) {
		
		mensajesDAO.deleteById(id);
		
	}
	
	public List<Mensajes> findByUsuarioUsername(String username) {
		
		return mensajesDAO.findByUsuarioUsername(username);
	}
}
