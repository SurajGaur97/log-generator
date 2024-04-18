package com.logger.log.generator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logger")
public class LoggerController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@GetMapping("/generate/log/{message}")
	public void generateLog(@PathVariable String message) {
		logger.info("Log generated with message: " + message);
	}
	
}
