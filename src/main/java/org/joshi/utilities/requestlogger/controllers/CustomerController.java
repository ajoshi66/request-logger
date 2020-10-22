package org.joshi.utilities.requestlogger.controllers;

import org.joshi.utilities.requestlogger.api.CustomerResponse;
import org.joshi.utilities.requestlogger.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping
	public @ResponseBody CustomerResponse getCustomers(@RequestParam String city) {
		log.info("Input city name: {}", city);
		CustomerResponse result = service.getCustomersByCity(city);
		log.info("Output size of customer list: {}", (result.getCustomerList() == null?0:result.getCustomerList().size()));
		return result;
	}

}
