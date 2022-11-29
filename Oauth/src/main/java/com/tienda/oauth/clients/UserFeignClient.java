package com.tienda.oauth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.commons.entity.User;


@FeignClient(name="service-user")
public interface UserFeignClient {
	@GetMapping("/user/search/buscar-username")
	public User findByUsername(@RequestParam String username);

}
