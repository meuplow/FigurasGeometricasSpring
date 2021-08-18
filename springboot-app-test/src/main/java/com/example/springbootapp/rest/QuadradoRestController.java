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

import com.example.springbootapp.model.Quadrado;

/**
 * @author Gabriel
 *
 */

@RestController
@RequestMapping("api/figuras/quadrado")
public class QuadradoRestController {
	
	/**
	 * Usando RequestParam
	 * localhost:8080/api/figuras/quadrado
	 * localhost:8080/api/figuras/quadrado/?lado=1
	 * 
	 * @param lado
	 */
	
	@GetMapping(value = "/", produces = "application/json")
	public Quadrado getAreaWithParam(@RequestParam(value = "lado", defaultValue = "1") double lado) {
		Quadrado q1;
		q1 = new Quadrado(lado);
		
		return q1;	
	}
	
	/**
	 * Usando PathVariable
	 * localhost:8080/api/figuras/quadrado/1
	 * 
	 * @param lado
	 */
	
	@RequestMapping(value = "/{raio}", method = RequestMethod.GET, produces = "application/json")
	public Quadrado getAreaWithPathVariable(@PathVariable double lado) {
		Quadrado q1;
		q1 = new Quadrado(lado);
		
		return q1;	
	}
	
}
