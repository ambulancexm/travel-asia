package fr.ldnr.thomas.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {

	@RequestMapping("/")
	public String afficherIndex() {
		return "index";
	}

	@RequestMapping("/home")
	public String afficherHome(){
		return "Japon";
	}
	
	@RequestMapping("/contact")
	public String afficherFormulaire(){
		return "contact";
	}
	
	
	@RequestMapping("/envoi")
	public String envoyerFormulaire(@RequestParam("nom") String nom,
			@RequestParam("email") String email,
			@RequestParam("message") String message){
		logger.info("envoi");
		logger.info(nom + " , " + email + " , " + message );
		return "contact";
	}
	
	private final static Logger logger = LoggerFactory.getLogger(ContactController.class);
	
	
}
