package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Usuarios;

public interface UsuariosService {

	//Metodos del CRUD
	public List<Usuarios> listarUsuarios(); //Listar All 
	
	public Usuarios guardarUsuario(Usuarios usuario); //Guarda un usuario CREATE
	
	public Usuarios usuarioXID(Long id); //Leer datos de un usuario READ
	
	public List<Usuarios> listarUsuariosPorUsuario(String usuario);//Listar usuarios por campo nombre
	
	public Usuarios actualizarUsuario(Usuarios usuario); //Actualiza datos del usuario UPDATE
	
	public void eliminarUsuario(Long id);// Elimina el usuario DELETE
}
