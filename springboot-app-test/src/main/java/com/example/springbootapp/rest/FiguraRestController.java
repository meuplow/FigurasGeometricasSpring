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
import com.example.springbootapp.model.Figura;
import com.example.springbootapp.model.Quadrado;
import com.example.springbootapp.model.Retangulo;
import com.example.springbootapp.model.Trapezio;
import com.example.springbootapp.model.Triangulo;

/**
 * @author Gabriel 
 *
 */

@RestController
@RequestMapping("api/figuras")
public class FiguraRestController {
	
	/**
	 * Usando RequestParam
	 * localhost:8080/api/figuras/
	 * localhost:8080/api/figuras/?a=1&b=2&c=1
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	
	@GetMapping(value = "/", produces = "application/json")
	public Figura[] getAreaWithParam(@RequestParam(value = "a", defaultValue = "1") double a,
			@RequestParam(value = "b", defaultValue = "2") double b, 
			@RequestParam(value = "c", defaultValue = "1") double c) {
		Figura[] figura;
		
		figura = new Figura[]{ 
				new Triangulo(a, c), 
				new Circulo(c),  
				new Trapezio(a, b, c),
				new Quadrado(b),
				new Retangulo(a, b)
				};
		
		return figura;	
	}
	
	/**
	 * Usando PathVariable
	 * localhost:8080/api/figuras/1&2&1
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	
	@RequestMapping(value = "/{a}&{b}&{c}", method = RequestMethod.GET, produces = "application/json")
	public Figura[] getAreaWithPathVariable(@PathVariable double a, @PathVariable double b, @PathVariable double c) {
		Figura[] figura;
		
		figura = new Figura[]{ 
				new Triangulo(a, c), 
				new Circulo(c),  
				new Trapezio(a, b, c),
				new Quadrado(b),
				new Retangulo(a, b)
				};
		
		return figura;	
	}
}
