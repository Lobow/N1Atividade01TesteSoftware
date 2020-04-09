package com.projeto.triangulo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TesteTriangulo {


	
	@Test
	public void trianguloEquilatero() {
		assertTrue(new Triangulo(4,4,4).validadorEquilatero());
		assertFalse(new Triangulo(5,2,7).validadorEquilatero());
	}
	
	@Test
	public void trianguloEscaleno() {
		assertFalse(new Triangulo(2,2,2).validadorEscaleno());
		assertTrue(new Triangulo(12,9,6).validadorEscaleno());
	}
	
	@Test
	public void trianguloIsoceles() {
		assertTrue(new Triangulo(5,4,5).validadorIsosceles());
		assertFalse(new Triangulo(8,8,-4).validadorIsosceles());
		assertFalse(new Triangulo(4,4,0).validadorIsosceles());
	}

}
	