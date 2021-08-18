package com.example.springbootapp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuadradoTest {

	@Test
	public void test4() {
		Quadrado q1 = new Quadrado(4);
		double expected = 16.0;
		double actual = q1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
