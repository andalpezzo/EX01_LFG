package com.crud.h2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mensajes")//en caso que la tabala sea diferente
public class Mensajes {

	//Atributos de entidad usuarios
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	private String texto;
	
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuarios usuario;
	
	//Constructores
	public Mensajes() {
	
	}

	public Mensajes(Long id, String texto, Usuarios usuario) {
		//super();
		this.id = id;
		this.texto = texto;
		this.usuario = usuario;
	}
	
	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Parties [id=" + id + ", texto=" + texto + ", usuario=" + usuario + "]";
	}
}
