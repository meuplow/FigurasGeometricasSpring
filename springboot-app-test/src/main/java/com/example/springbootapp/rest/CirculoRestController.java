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

import com.example.springbootapp.model.Circulo;

/**
 * @author Gabriel
 *
 */

@RestController
@RequestMapping("api/figuras/circulo")
public class CirculoRestController {
	
	/**
	 * Usando RequestParam
	 * localhost:8080/api/figuras/circulo
	 * localhost:8080/api/figuras/circulo/?raio=1
	 * 
	 * @param raio
	 */
	
	@GetMapping(value = "/", produces = "application/json")
	public Circulo getAreaWithParam(@RequestParam(value = "raio", defaultValue = "1") double raio) {
		Circulo c1;
		c1 = new Circulo(raio);
		
		return c1;	
	}
	
	/**
	 * Usando PathVariable
	 * localhost:8080/api/figuras/circulo/1
	 * 
	 * @param raio
	 */
	
	@RequestMapping(value = "/{raio}", method = RequestMethod.GET, produces = "application/json")
	public Circulo getAreaWithPathVariable(@PathVariable double raio) {
		Circulo c1;
		c1 = new Circulo(raio);
		
		return c1;	
	}
	
}
