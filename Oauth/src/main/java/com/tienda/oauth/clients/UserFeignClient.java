package com.tienda.oauth.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="service-user")
public interface UserFeignClient {
	

}
