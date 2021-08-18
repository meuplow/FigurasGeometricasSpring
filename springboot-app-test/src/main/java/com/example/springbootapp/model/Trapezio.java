/**
 * Direitos Autorais, 2021, Gabriel Menin.
 */
package com.example.springbootapp.model;

/**
 * 
 * A classe <code>Trapezio<code> representa um trapézio com bases e altura.
 * 
 * @author Gabriel
 *
 */
public class Trapezio extends Figura {
	
	private double baseUm;
	private double baseDois;
	private double altura;
	
	/**
	 * Cria um trapézio com base <code>baseUm</code> base <code>baseDois</code> e altura <code>altura</code>.
	 * 
	 * @param baseUm uma das bases do novo trapézio
	 * @param baseDois uma das bases do novo trapézio
	 * @param altura a altura do novo trapézio
	 * @throws IllegalArgumentException
	 * 			Quando o valor da baseUm é menor ou igual a zero.
	 * 			Quando o valor da baseDois é menor ou igual a zero.
	 * 			Quando o valor da altura é menor ou igual a zero.
	 * 			Quando o valor da baseUm é igual ao da baseDois.
	 */
	
	public Trapezio(double baseUm, double baseDois, double altura) {
		super();
		if (baseUm <= 0.0) {
			throw new IllegalArgumentException();
		}else if(baseDois <= 0.0) {
			throw new IllegalArgumentException();
		}else if(altura <= 0.0) {
			throw new IllegalArgumentException();
		}else if(baseUm == baseDois) {
			throw new IllegalArgumentException();
		}
		this.baseUm = baseUm;
		this.baseDois = baseDois;
		this.altura = altura;
	}

	/**
	 * @return the area
	 */
	@Override
	public double getArea() {
		return ((baseDois+baseUm)*altura)/2;
	}

	@Override
	public String toString() {
		return "Trapezio [baseUm=" + baseUm + ", baseDois=" + baseDois + ", altura=" + altura + " área=" + getArea() + "]";
	}
	
	

}
