package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class VTest {

	@Test
	public void numeroQuatro() {
		NumeroDecimal decimalNumber = new NumeroDecimal("4");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("IV", algarismo);
	}

	@Test
	public void numeroCinco() {
		NumeroDecimal decimalNumber = new NumeroDecimal("5");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("V", algarismo);
	}

	@Test
	public void numeroSeis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("6");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("VI", algarismo);
	}

	@Test
	public void numeroSete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("7");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("VII", algarismo);
	}

	@Test
	public void numeroOito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("8");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("VIII", algarismo);
	}

}
