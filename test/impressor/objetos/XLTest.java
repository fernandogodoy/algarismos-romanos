package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class XLTest {

	@Test
	public void numeroQuarenta() {
		NumeroDecimal decimalNumber = new NumeroDecimal("40");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XL", algarismo);
	}

	@Test
	public void numeroQuarentaUm() {
		NumeroDecimal decimalNumber = new NumeroDecimal("41");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XLI", algarismo);
	}

	@Test
	public void numeroQuarentaDois() {
		NumeroDecimal decimalNumber = new NumeroDecimal("42");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XLII", algarismo);
	}

	@Test
	public void numeroQuarentaTres() {
		NumeroDecimal decimalNumber = new NumeroDecimal("43");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XLIII", algarismo);
	}

	@Test
	public void numeroQuarentaQuatro() {
		NumeroDecimal decimalNumber = new NumeroDecimal("44");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XLIV", algarismo);
	}

	@Test
	public void numeroQuarentaCinco() {
		NumeroDecimal decimalNumber = new NumeroDecimal("45");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XLV", algarismo);
	}

	@Test
	public void numeroQuarentaSeis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("46");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XLVI", algarismo);
	}

	@Test
	public void numeroQuarentaSete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("47");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XLVII", algarismo);
	}

	@Test
	public void numeroQuarentaOito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("48");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XLVIII", algarismo);
	}

	@Test
	public void numeroQuarentaNove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("49");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XLIX", algarismo);
	}

}
