package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.controller.entity.Registration;
import com.user.service.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping("regi")
	public String loadRegistration() {
		return "register";
	}
	@RequestMapping("save")
	public String saveRegistration(@ModelAttribute("registration") Registration registration,ModelMap modelMap) {
		registrationService.saveReg(registration);
		modelMap.addAttribute("msg","registration details saved");
		return "register";
	}

}
