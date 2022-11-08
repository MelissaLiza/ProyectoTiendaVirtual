package com.tienda.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PRODUCTO")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "PROD_NOM")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "PROD_CAT_ID")
	private int categoria;

	@Column(name = "PROD_PREC")
	private double precio;
	
	@Column(name = "PROD_STOCK")
	private int stock;

	@ManyToOne
	@JoinColumn(name = "PROD_PROV_ID")
	private int proveedor;
	
	
}
