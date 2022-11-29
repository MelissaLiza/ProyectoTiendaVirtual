package com.tienda.commons.commons.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
@Table(name="roles")

@AllArgsConstructor
@NoArgsConstructor
public class Rol implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2114408347460672451L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String description;

}
