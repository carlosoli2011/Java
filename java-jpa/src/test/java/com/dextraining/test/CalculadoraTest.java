package com.dextraining.test;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {//classe test JUnit
	

	private Calculadora calculadora = new Calculadora();
	
	@Test//anotação para implementação dos metodos testados
	public void testarSoma(){
		
		Double resultado = calculadora.somar(5.0, 5.0);
		Assert.assertEquals(Double.valueOf(10), resultado);
		
	}
	
	@Test
	public void testarSubtracao(){
		
		Double resultado = calculadora.subtrair(10.0, 3.0);
		Assert.assertEquals(Double.valueOf(7.0), resultado);
	}
	
	@Test
	public void testarMultiplicacao(){
		
		Double resultado = calculadora.multiplicar(6.0, 5.0);
		Assert.assertEquals(Double.valueOf(30), resultado);
		
	}

	@Test
	public void Divisao(){
		
		Double resultado = calculadora.divisao(5.0, 2.0);
		Assert.assertEquals(Double.valueOf(2.5), resultado);
		
	}
}
