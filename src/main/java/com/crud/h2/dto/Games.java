package com.crud.h2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="games")//en caso que la tabala sea diferente
public class Games {

	//Atributos de entidad usuarios
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	private String nombre;
	private String descripcion;
	private String dificultad;
	
	//Constructores
	public Games() {
	
	}

	public Games(Long id, String nombre, String descripcion, String dificultad) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dificultad = dificultad;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Parties [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", dificultad=" + dificultad + "]";
	}
}
