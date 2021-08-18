package com.example.springbootapp.rest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@SpringBootTest
@AutoConfigureMockMvc
public class TrapezioRestControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testUsingRequestParamWithParam() throws Exception {
		MultiValueMap<String, String> parametros = new LinkedMultiValueMap<>();
		parametros.add("baseUm", "1");
		parametros.add("baseDois", "2");
		parametros.add("altura", "3");
		mvc.perform(MockMvcRequestBuilders.get("/api/figuras/trapezio/")
				.params(parametros))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"area\":4.5}"));
	}
	
	@Test
	public void testUsingRequestParamWithoutParam() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/figuras/trapezio/"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"area\":6.0}"));
	}
	
	@Test
	public void testUsingPathVariable() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/figuras/trapezio/1&2&3"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"area\":4.5}"));
	}
}
