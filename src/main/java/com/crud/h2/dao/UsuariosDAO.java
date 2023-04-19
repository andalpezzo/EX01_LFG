package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Usuarios;

public interface UsuariosDAO extends JpaRepository<Usuarios, Long>{
	
	//Listar Usuarios por campo nombre_usuario
	public List<Usuarios> findByUsername(String username);
	public List<Usuarios> findByPartyNombre(String nombre);
}
