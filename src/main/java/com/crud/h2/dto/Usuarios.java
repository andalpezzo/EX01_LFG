package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")//en caso que la tabala sea diferente
public class Usuarios {

	//Atributos de entidad usuarios
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	private String username;
	private String pass;
	private String email;
	private int telefono;
	private String userstream;
	
	@ManyToOne
	@JoinColumn(name="party")
	private Parties party;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Mensajes> mensaje;
	
	//Constructores
	public Usuarios() {
	
	}

	public Usuarios(Long id, String username, String pass, String email, int telefono, String userstream, Parties party) {
		//super();
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.email = email;
		this.telefono = telefono;
		this.userstream = userstream;
		this.party = party;
	}
	
	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getUserstream() {
		return userstream;
	}

	public void setUserstream(String userstream) {
		this.userstream = userstream;
	}

	public Parties getParty() {
		return party;
	}

	public void setParty(Parties party) {
		this.party = party;
	}
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre_usuario=" + username + ", passw=" + pass + ", email=" + email + ", telefono="
				+ telefono + ", usuario_stream=" + userstream + ", party=" + party + "]";
	}
}
