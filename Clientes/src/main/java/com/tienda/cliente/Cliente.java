package com.tienda.cliente;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idcliente;
	
	@Column(name="CLIENT_NOM")
	private String nombre;
	
	@Column(name="CLIENT_APE")
	private String apellido;
	
	@Column(name="CLIENT_DNI")
	private int dni;
	
	@Column(name="CLIENT_EDAD")
	private int edad;

	
}
