package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class XXTest {

	@Test
	public void numeroVinte() {
		NumeroDecimal decimalNumber = new NumeroDecimal("30");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXX", algarismo);
	}

	@Test
	public void numeroVinteUm() {
		NumeroDecimal decimalNumber = new NumeroDecimal("31");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXI", algarismo);
	}

	@Test
	public void numeroVinteDois() {
		NumeroDecimal decimalNumber = new NumeroDecimal("32");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXII", algarismo);
	}

	@Test
	public void numeroVinteTres() {
		NumeroDecimal decimalNumber = new NumeroDecimal("33");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXIII", algarismo);
	}

	@Test
	public void numeroVinteQuatro() {
		NumeroDecimal decimalNumber = new NumeroDecimal("34");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXIV", algarismo);
	}

	@Test
	public void numeroVinteCinco() {
		NumeroDecimal decimalNumber = new NumeroDecimal("35");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXV", algarismo);
	}

	@Test
	public void numeroVinteSeis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("36");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXVI", algarismo);
	}

	@Test
	public void numeroVinteSete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("37");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXVII", algarismo);
	}

	@Test
	public void numeroVinteOito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("38");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXVIII", algarismo);
	}

	@Test
	public void numeroVinteNove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("39");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XXXIX", algarismo);
	}

}
