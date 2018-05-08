package com.luisgomezcaballero.cloudparentservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cloudchildservice")
@RibbonClient(name = "cloudparentservice")
public interface MyProxy {

	@GetMapping("/myuri")
	public MyBean myProxyMethod();

}