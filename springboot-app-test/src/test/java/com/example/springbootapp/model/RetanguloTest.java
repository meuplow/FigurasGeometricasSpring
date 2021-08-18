package com.example.springbootapp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RetanguloTest {

	@Test
	public void test3And4() {
		Retangulo r1 = new Retangulo(3, 4);
		double expected = 12.0;
		double actual = r1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}