package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class XTest {

	@Test
	public void numeroNove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("9");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("IX", algarismo);
	}

	@Test
	public void numeroDez() {
		NumeroDecimal decimalNumber = new NumeroDecimal("10");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("X", algarismo);
	}

	@Test
	public void numeroOnze() {
		NumeroDecimal decimalNumber = new NumeroDecimal("11");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XI", algarismo);
	}

	@Test
	public void numeroDoze() {
		NumeroDecimal decimalNumber = new NumeroDecimal("12");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XII", algarismo);
	}

	@Test
	public void numeroTreze() {
		NumeroDecimal decimalNumber = new NumeroDecimal("13");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XIII", algarismo);
	}

	@Test
	public void numeroQuatorze() {
		NumeroDecimal decimalNumber = new NumeroDecimal("14");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XIV", algarismo);
	}

	@Test
	public void numeroQuize() {
		NumeroDecimal decimalNumber = new NumeroDecimal("15");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XV", algarismo);
	}

	@Test
	public void numeroDezesseis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("16");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XVI", algarismo);
	}

	@Test
	public void numeroDezesete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("17");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XVII", algarismo);
	}

	@Test
	public void numeroDezoito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("18");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XVIII", algarismo);
	}

	@Test
	public void numeroDezenove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("19");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XIX", algarismo);
	}

}
