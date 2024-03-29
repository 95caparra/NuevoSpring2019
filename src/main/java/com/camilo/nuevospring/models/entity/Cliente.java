package com.camilo.nuevospring.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "No puede ser vacio")
	@Size(min=4, max=12, message = "El tamaño debe estar entre 4 y 12")
	@Column(nullable=false)
	private String nombre;
	
	private String apellido;
	
	@NotEmpty(message = "No puede ser vacio")
	@Email(message = "No es una dirección de correo correcta")
	@Column(nullable=false, unique = true)
	private String email;
	
	@NotNull(message = "la fecha no puede estar vacia")
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	private String foto;
	
//	@PrePersist
//	public void prePersist() {
//		createAt = new Date();
//	}
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	

}
