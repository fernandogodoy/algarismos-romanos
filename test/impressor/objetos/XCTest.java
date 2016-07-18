package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class XCTest {

	@Test
	public void numeroNoventa() {
		NumeroDecimal decimalNumber = new NumeroDecimal("90");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XC", algarismo);
	}

	@Test
	public void numeroNoventaUm() {
		NumeroDecimal decimalNumber = new NumeroDecimal("91");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XCI", algarismo);
	}

	@Test
	public void numeroNoventaDois() {
		NumeroDecimal decimalNumber = new NumeroDecimal("92");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XCII", algarismo);
	}

	@Test
	public void numeroNoventaTres() {
		NumeroDecimal decimalNumber = new NumeroDecimal("93");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XCIII", algarismo);
	}

	@Test
	public void numeroNoventaQuatro() {
		NumeroDecimal decimalNumber = new NumeroDecimal("94");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XCIV", algarismo);
	}

	@Test
	public void numeroNoventaCinco() {
		NumeroDecimal decimalNumber = new NumeroDecimal("95");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XCV", algarismo);
	}

	@Test
	public void numeroNoventaSeis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("96");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XCVI", algarismo);
	}

	@Test
	public void numeroNoventaSete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("97");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XCVII", algarismo);
	}

	@Test
	public void numeroNoventaOito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("98");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XCVIII", algarismo);
	}

	@Test
	public void numeroNoventaNove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("99");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XCIX", algarismo);
	}

}
