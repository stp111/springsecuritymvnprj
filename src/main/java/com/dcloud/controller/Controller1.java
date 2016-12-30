package com.dcloud.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controller1 {
	
	private Logger logger = LoggerFactory.getLogger(Controller1.class);
	
	
	@RequestMapping(value="/showMessage")
	public String showMessage(Locale local, Model model) {
		logger.info("show message...");
		model.addAttribute("message", "message from spring controller....");
		return "showMessage";
	}
}


