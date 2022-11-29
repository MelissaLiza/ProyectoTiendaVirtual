package com.tienda.oauth.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authorization.AuthorityAuthorizationDecision;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.commons.entity.User;
import com.tienda.oauth.clients.UserFeignClient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UsuarioService implements IUsuarioService, UserDetailsService {

	@Autowired
	private UserFeignClient client;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User usuario = client.findByUsername(username);

		if (usuario == null) {
			log.error("Error en el login, no existe el usuario'" + username + "' en el sistema");
			throw new UsernameNotFoundException(
					"Error en el login, no existe el usuario'" + username + "' en el sistema");
		}

		List<GrantedAuthority> authorities = usuario.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getDescription()))
				.peek(a -> log.info("Role: " + a.getAuthority())).collect(Collectors.toList());
		log.info("Usuario autenticado: " + username);

		return new org.springframework.security.core.userdetails.User(usuario.getUsername(), usuario.getPassword(),
				true, true, true, true, authorities);
	}

	@Override
	public User findByuserName(String username) {
		return client.findByUsername(username);
	}

}























