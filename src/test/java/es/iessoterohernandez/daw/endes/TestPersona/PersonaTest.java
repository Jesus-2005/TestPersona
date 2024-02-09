package es.iessoterohernandez.daw.endes.TestPersona;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



public class PersonaTest {
	
	private static Persona p;
	
	@BeforeEach
	public void init() {
		p = new Persona("Jesus",30,'H',66.32,1.75);
	}
	
	@Test
	public void testCalcularIMC() {

		p.setAltura(1.75);
		p.setPeso(100.32);
		
		assertEquals(Persona.SOBREPESO, p.calcularIMC());
		p.setPeso(30);
		assertEquals(Persona.INFRAPESO, p.calcularIMC());
		p.setPeso(66);
		assertEquals(Persona.PESO_IDEAL, p.calcularIMC());
	}
	
	@Test
	public void testEsMayorEdad() {
		 assertThat(p.esMayorDeEdad(), is(true));
		 p.setEdad(16);
		 assertThat(p.esMayorDeEdad(), is(false));
	}
	
	
	
	@Test
	public void testToString() {
		
		String resultado = "Informacion de la persona:\n"
                + "Nombre: Jesus\n"
                + "Sexo: hombre\n"
                + "Edad: 30 años\n"
                + "DNI: 12345678X\n"
                + "Peso:  66.32 kg\n"
                + "Altura: 1.75 metros\n";
		assertThat(p.toString(), is(resultado));
	}
	
	
	
	
}
