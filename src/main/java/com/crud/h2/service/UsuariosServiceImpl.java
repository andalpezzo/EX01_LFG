package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.UsuariosDAO;
import com.crud.h2.dto.Usuarios;

@Service
public class UsuariosServiceImpl implements UsuariosService{
	
	//Utilizamos los metodos de la interface UsuariosDAO, es como si instaciaramos.
	@Autowired
	UsuariosDAO usuariosDAO;
	
	@Override
	public List<Usuarios> listarUsuarios() {
		
		return usuariosDAO.findAll();
	}

	@Override
	public Usuarios guardarUsuario(Usuarios usuario) {
		
		return usuariosDAO.save(usuario);
	}

	@Override
	public Usuarios usuarioXID(Long id) {
		
		return usuariosDAO.findById(id).get();
	}
	
	@Override
	public List<Usuarios> listarUsuariosPorUsuario(String username) {
		
		return usuariosDAO.findByUsername(username);
	}
	
	@Override
	public Usuarios actualizarUsuario(Usuarios usuario) {
		
		return usuariosDAO.save(usuario);
	}

	@Override
	public void eliminarUsuario(Long id) {
		
		usuariosDAO.deleteById(id);
		
	}
	
	public List<Usuarios> findByPartyNombre(String nombre) {
		
		return usuariosDAO.findByPartyNombre(nombre);
	}
}
