package com.galaxy.bank.account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cuentas")
public class AccountController {
	
	@Autowired
	private AccountService service;
	
	@Autowired
	private Environment env;
	
	@Value("${spring.jpa.database}")
	private String typedatabase;
	
	@Value("${spring.datasource.url}")
	private String cnnDB;
	
	@GetMapping("/listar")
	public List<Account> listar(){
		return service.findAll();
	}
	
	@GetMapping("/testvalues")
	public ResponseEntity<Map<String, String>> valoresdeconfiguracion(){
		Map<String, String> map = new HashMap<>();
		map.put("Base de Datos", typedatabase);
		map.put("cadena de conexion", cnnDB);
		map.put("programador", env.getProperty("development.name"));
		map.put("Fecha de inicio", env.getProperty("date.init"));
		
		return new ResponseEntity<Map<String, String>>(map,HttpStatus.OK);
	}
	
}
