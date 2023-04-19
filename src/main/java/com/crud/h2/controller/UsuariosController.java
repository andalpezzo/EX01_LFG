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

import com.crud.h2.dto.Usuarios;
import com.crud.h2.service.UsuariosServiceImpl;

@RestController
@RequestMapping("/api")
public class UsuariosController {
	
	@Autowired
	UsuariosServiceImpl usuariosServiceImpl;
	
	@GetMapping("/usuarios")
	public List<Usuarios> listarUsuarios(){
		return usuariosServiceImpl.listarUsuarios();
	}
	
	@GetMapping("/usuarios/usuario/{usuario}")
	public List<Usuarios> listarUsuariosPorUsuario(@PathVariable(name="usuario") String usuario) {
	    return usuariosServiceImpl.listarUsuariosPorUsuario(usuario);
	}
	
	@GetMapping("/usuarios/party/{nombre}")
	public List<Usuarios> findByPartyName(@PathVariable(name="nombre") String nombre) {
	    return usuariosServiceImpl.findByPartyNombre(nombre);
	}
	
	
	@PostMapping("/usuarios")
	public Usuarios salvarUsuario(@RequestBody Usuarios usuario) {
		
		return usuariosServiceImpl.guardarUsuario(usuario);
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuarios usuarioXID(@PathVariable(name="id") Long id) {
		
		Usuarios usuario_xid= new Usuarios();
		
		usuario_xid=usuariosServiceImpl.usuarioXID(id);
		
		System.out.println("Usuario x ID: "+usuario_xid);
		
		return usuario_xid;
	}
	
	@PutMapping("/usuarios/{id}")
	public Usuarios actualizarUsuario(@PathVariable(name="id")Long id,@RequestBody Usuarios usuario) {
		
		Usuarios usuario_seleccionado= new Usuarios();
		Usuarios usuario_actualizado= new Usuarios();
		
		usuario_seleccionado= usuariosServiceImpl.usuarioXID(id);
		usuario_seleccionado.setUsername(usuario.getUsername());
		usuario_seleccionado.setPass(usuario.getPass());
		usuario_seleccionado.setEmail(usuario.getEmail());
		usuario_seleccionado.setTelefono(usuario.getTelefono());
		usuario_seleccionado.setUserstream(usuario.getUserstream());
		usuario_seleccionado.setParty(usuario.getParty());
		
		usuario_actualizado = usuariosServiceImpl.actualizarUsuario(usuario_seleccionado);
		
		System.out.println("El usuario actualizado es: "+ usuario_actualizado);
		
		return usuario_actualizado;
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void eleiminarUsuario(@PathVariable(name="id")Long id) {
		usuariosServiceImpl.eliminarUsuario(id);
	}
}
