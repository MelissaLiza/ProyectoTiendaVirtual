package com.tienda.employee;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="empleado")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nombres")
	private String firstName;
	
	@Column(name="apellidos")
	private String lastName;
	
	private String dni;
	
	@Column(name="createat")
	private LocalDate createAt;
	
	@Column(name="updateat")
	private LocalDate updateAt;
}
