package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 3453868290457786097L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String nombre;
	
	public String apellido;
	
	public String email;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	public Date createAt;
}
