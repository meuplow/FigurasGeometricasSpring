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

import com.example.springbootapp.model.Retangulo;

/**
 * @author Gabriel
 *
 */

@RestController
@RequestMapping("api/figuras/retangulo")
public class RetanguloRestController {

	/**
	 * Usando RequestParam
	 * localhost:8080/api/figuras/retangulo
	 * localhost:8080/api/figuras/retangulo/?ladoA=1&ladoB=2
	 * 
	 * @param ladoA
	 * @param ladoB
	 */
	
	@GetMapping(value = "/", produces = "application/json")
	public Retangulo getAreaWithParam(@RequestParam(value = "ladoA", defaultValue = "1") double ladoA,
			@RequestParam(value = "ladoB", defaultValue = "2") double ladoB) {
		Retangulo r1;
		r1 = new Retangulo(ladoA, ladoB);
		
		return r1;	
	}
	
	/**
	 * Usando PathVariable
	 * localhost:8080/api/figuras/retangulo/1&2
	 * 
	 * @param ladoA
	 * @param ladoB
	 */
	
	@RequestMapping(value = "/{ladoA}&{ladoB}", method = RequestMethod.GET, produces = "application/json")
	public Retangulo getAreaWithPathVariable(@PathVariable double ladoA, @PathVariable double ladoB) {
		Retangulo r1;
		r1 = new Retangulo(ladoA, ladoB);
		
		return r1;	
	}
	
}
