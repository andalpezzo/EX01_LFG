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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="parties")//en caso que la tabala sea diferente
public class Parties {

	//Atributos de entidad usuarios
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="game")
	private Games game;
	
	@JsonIgnore
	@OneToMany
	@JoinColumn(name="id")
	private List <Usuarios> usuario;
	
	
	//Constructores
	public Parties() {
	
	}

	public Parties(Long id, String nombre, Games game, List <Usuarios> usuario) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.game = game;
		this.usuario = usuario;
	}
	
	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Games getGame() {
		return game;
	}

	public void setGame(Games game) {
		this.game = game;
	}
	
	public List <Usuarios> getUsuario() {
		return usuario;
	}

	public void setUsuario(List <Usuarios> usuario) {
		this.usuario = usuario;
	}

	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Parties [id=" + id + ", nombre=" + nombre + ", game=" + game + "]";
	}
}
