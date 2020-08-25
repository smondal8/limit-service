package com.soumyadev.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitsConfigurationController {
	@Autowired
	ConfigurationProps configuration;
	@GetMapping("/limits")
	LimitConfiguration retriveLimit() {
		//return new LimitConfiguration(1000,1);
		return new LimitConfiguration(configuration.getMaximum()
				, configuration.getMinimum());
	}
}
