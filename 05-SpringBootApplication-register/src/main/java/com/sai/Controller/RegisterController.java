package com.sai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
	
	@RequestMapping("/")
	public String GetForm() {
		return "register";
	}

	@RequestMapping("/register")
	public String GetForm(@RequestParam String name,@RequestParam String password,@RequestParam String email,@RequestParam String address,@RequestParam String gender,@RequestParam String state,Model model) {
		model.addAttribute("name", name);
		model.addAttribute("password", password);
		model.addAttribute("email", email);
		model.addAttribute("address", address);
		model.addAttribute("gender", gender);
		model.addAttribute("state", state);
		return "result";
	}

}
