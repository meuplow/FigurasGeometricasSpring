package com.example.springbootapp.rest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class CirculoRestControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testUsingRequestParamWithParam() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/figuras/circulo/")
				.param("raio", "1"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"area\":3.14159}"));
	}
	
	@Test
	public void testUsingRequestParamWithoutParam() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/figuras/circulo/"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"area\":3.14159}"));
	}
	
	@Test
	public void testUsingPathVariable() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/figuras/circulo/1"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"area\":3.14159}"));
	}
}
