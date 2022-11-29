package com.tienda.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	public User findByFirstname(String firstname);

	@RestResource(path = "buscar-username")
	public User findByUsername(@Param("username") String username);
}
