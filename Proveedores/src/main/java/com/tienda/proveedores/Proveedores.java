package com.tienda.proveedores;

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
@Table(name="PROVEEDORES")
public class Proveedores {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PROV_ID;
	
	@Column(name="PROV_NOM")
	private String PROV_NOM;
	
	@Column(name="PROV_APE")
	private String PROV_APE;
	
	@Column(name="PROV_EMPRE")
	private String PROV_EMPRE;
	
	@Column(name="createat")
	private LocalDate createAt;
	
}