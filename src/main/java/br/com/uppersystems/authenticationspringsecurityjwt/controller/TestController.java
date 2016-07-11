package br.com.uppersystems.authenticationspringsecurityjwt.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Filipe Germano <filipegermano@uppersystems.com>
 */
@RestController	
public class TestController {
	
	@CrossOrigin("*")
	@Secured("ROLE_USUARIO")
	@RequestMapping("/security")
	public String security(Authentication authentication){
		return "Acessando serviço seguro";
	}
	
	@CrossOrigin("*")
	@RequestMapping("/open")
	public String open(Authentication authentication){
		return "Acessando serviço não seguro";
	}
	
}
