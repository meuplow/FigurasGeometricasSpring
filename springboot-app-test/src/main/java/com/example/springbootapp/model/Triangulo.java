/**
 * Direitos Autorais, 2021, Gabriel Menin.
 */
package com.example.springbootapp.model;

/**
 * @author Gabriel
 *
 */
public class Triangulo extends Figura {
	
	private double base;
	private double altura;
	
	/**
	 * Cria um triângulo retângulo com base <code>base</code> e altura <code>altura</code>.
	 * 
	 * @param base a base do novo triângulo
	 * @param altura a altura do novo triângulo
	 * @throws IllegalArgumentException
	 * 			Quando o valor da base ou da altura é menor ou igual a zero.
	 */
	
	public Triangulo(double base, double altura) {
		super();
		if (base <= 0.0) {
			throw new IllegalArgumentException();
		}else if(altura <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @return the area
	 */
	@Override
	public double getArea() {
		return (base*altura)/2;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + " área=" + getArea() + "]";
	}
	

}
