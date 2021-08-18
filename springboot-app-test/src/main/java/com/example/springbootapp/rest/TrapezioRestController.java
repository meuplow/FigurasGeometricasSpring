/**
 * Direitos Autorais, 2021, Gabriel Menin.
 */
package com.example.springbootapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootapp.model.Trapezio;

/**
 * @author Gabriel
 *
 */

@RestController
@RequestMapping("api/figuras/trapezio")
public class TrapezioRestController {

	/**
	 * Usando RequestParam
	 * localhost:8080/api/figuras/trapezio
	 * localhost:8080/api/figuras/trapezio/?baseUm=1&baseDois=2&altura=4
	 * 
	 * @param baseUm
	 * @param baseDois
	 * @param altura
	 */
	
	@GetMapping(value = "/", produces = "application/json")
	public Trapezio getAreaWithParam(@RequestParam(value = "baseUm", defaultValue = "1") double baseUm,
			@RequestParam(value = "baseDois", defaultValue = "2") double baseDois,
			@RequestParam(value = "altura", defaultValue = "4") double altura) {
		Trapezio t1;
		t1 = new Trapezio(baseUm, baseDois, altura);
		
		return t1;	
	}
	
	/**
	 * Usando PathVariable
	 * localhost:8080/api/figuras/trapezio/1&2&4
	 * 
	 * @param baseUm
	 * @param baseDois
	 * @param altura
	 */
	
	@RequestMapping(value = "/{baseUm}&{baseDois}&{altura}", method = RequestMethod.GET, produces = "application/json")
	public Trapezio getAreaWithPathVariable(@PathVariable double baseUm, 
			@PathVariable double baseDois, @PathVariable double altura) {
		Trapezio t1;
		t1 = new Trapezio(baseUm, baseDois, altura);
		
		return t1;		
	}
	
}
