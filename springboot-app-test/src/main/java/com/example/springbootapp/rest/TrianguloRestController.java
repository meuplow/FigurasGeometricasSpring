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

import com.example.springbootapp.model.Triangulo;

/**
 * @author Gabriel
 *
 */

@RestController
@RequestMapping("api/figuras/triangulo")
public class TrianguloRestController {

	/**
	 * Usando RequestParam
	 * localhost:8080/api/figuras/triangulo
	 * localhost:8080/api/figuras/triangulo/?base=1&altura=4
	 * 
	 * @param base
	 * @param altura
	 */
	
	@GetMapping(value = "/", produces = "application/json")
	public Triangulo getAreaWithParam(@RequestParam(value = "base", defaultValue = "1") double base,
			@RequestParam(value = "altura", defaultValue = "4") double altura) {
		Triangulo t1;
		t1 = new Triangulo(base, altura);
		
		return t1;	
	}

	/**
	 * Usando PathVariable
	 * localhost:8080/api/figuras/triangulo/1&4
	 * 
	 * @param baseUm
	 * @param baseDois
	 * @param altura
	 */
	
	@RequestMapping(value = "/{base}&{altura}", method = RequestMethod.GET, produces = "application/json")
	public Triangulo getAreaWithPathVariable(@PathVariable double base, @PathVariable double altura) {
		Triangulo t1;
		t1 = new Triangulo(base, altura);
		
		return t1;		
	}
	
}
