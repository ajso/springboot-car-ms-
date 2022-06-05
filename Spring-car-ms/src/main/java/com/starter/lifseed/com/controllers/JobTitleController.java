package com.starter.lifseed.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {

	@GetMapping("/job_title")
	public String getJobTitle() {
		return "jobTitle";
	}

}
