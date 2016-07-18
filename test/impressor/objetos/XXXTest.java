package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class XXXTest {

	@Test
	public void numeroTrinta() {
		NumeroDecimal decimalNumber = new NumeroDecimal("30");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXX", algarismo);
	}

	@Test
	public void numeroTrintaUm() {
		NumeroDecimal decimalNumber = new NumeroDecimal("31");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXI", algarismo);
	}

	@Test
	public void numeroTrintaDois() {
		NumeroDecimal decimalNumber = new NumeroDecimal("32");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXII", algarismo);
	}

	@Test
	public void numeroTrintaTres() {
		NumeroDecimal decimalNumber = new NumeroDecimal("33");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXIII", algarismo);
	}

	@Test
	public void numeroTrintaQuatro() {
		NumeroDecimal decimalNumber = new NumeroDecimal("34");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXIV", algarismo);
	}

	@Test
	public void numeroTrintaCinco() {
		NumeroDecimal decimalNumber = new NumeroDecimal("35");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXV", algarismo);
	}

	@Test
	public void numeroTrintaSeis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("36");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXVI", algarismo);
	}

	@Test
	public void numeroTrintaSete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("37");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXVII", algarismo);
	}

	@Test
	public void numeroTrintaOito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("38");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXVIII", algarismo);
	}

	@Test
	public void numeroTrintaNove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("39");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXIX", algarismo);
	}

}
