package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class LXXTest {

	@Test
	public void numeroSetenta() {
		NumeroDecimal decimalNumber = new NumeroDecimal("70");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXX", algarismo);
	}

	@Test
	public void numeroSetentaUm() {
		NumeroDecimal decimalNumber = new NumeroDecimal("71");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXI", algarismo);
	}

	@Test
	public void numeroSetentaDois() {
		NumeroDecimal decimalNumber = new NumeroDecimal("72");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXII", algarismo);
	}

	@Test
	public void numeroSetentaTres() {
		NumeroDecimal decimalNumber = new NumeroDecimal("73");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXIII", algarismo);
	}

	@Test
	public void numeroSetentaQuatro() {
		NumeroDecimal decimalNumber = new NumeroDecimal("74");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXIV", algarismo);
	}

	@Test
	public void numeroSetentaCinco() {
		NumeroDecimal decimalNumber = new NumeroDecimal("75");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXV", algarismo);
	}

	@Test
	public void numeroSetentaSeis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("76");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXVI", algarismo);
	}

	@Test
	public void numeroSetentaSete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("77");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXVII", algarismo);
	}

	@Test
	public void numeroSetentaOito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("78");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXVIII", algarismo);
	}

	@Test
	public void numeroSetentaNove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("79");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXIX", algarismo);
	}

}
