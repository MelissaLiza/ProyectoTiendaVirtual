package com.tienda.user;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.tienda.rol.Rol;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="usuarios")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6819535601160625039L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Column(length = 60)
	private String username;
	
	@Column(length = 60)
	private String password;
	private String firstname;
	private String lastname;
	
	@Column(unique=true, length = 100)
	private String email;
	
	private LocalDate createAt;
	private LocalDate updateAt;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Rol> roles;

}