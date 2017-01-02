package com.dcloud;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这里的错误： spring中约定：组件在com.***.controller、service等包名下。
 * 此controller注解无法生效。
 * @author dcloud
 *
 */
@Controller
public class ExampleController {

	private Logger logger = LoggerFactory.getLogger(ExampleController.class);
	
	
	@RequestMapping(value="/errMsg")
	public String showMessage(Locale local, Model model) {
		logger.info("show message...");
		model.addAttribute("message", "message from spring controller....");
		return "showMessage";
	}
}
