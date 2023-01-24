package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 3453868290457786097L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private LocalDate createAt;
}
