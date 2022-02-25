package com.SampleDeployJob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class DeployController {
	@GetMapping("/demo")
	public String display() {
		
		return ("hello deploy ");
	}


}
