package com.tienda;

import javax.management.relation.Role;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.tienda.commons.commons.entity.User;
import com.tienda.commons.commons.entity.Rol;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
	config.exposeIdsFor(User.class,Role.class);
	}

}
