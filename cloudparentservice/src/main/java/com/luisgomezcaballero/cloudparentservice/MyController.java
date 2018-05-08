package com.luisgomezcaballero.cloudparentservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MyProxy proxy;

	@RequestMapping(value = "/myuri", method = RequestMethod.GET)
	public MyBean myMethod() {

		MyBean response = proxy.myProxyMethod();

		logger.info("{}", response);

		return response;
	}
}
