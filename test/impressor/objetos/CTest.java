package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class CTest {

	@Test
	public void numeroCem() {
		NumeroDecimal decimalNumber = new NumeroDecimal("100");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("C", algarismo);
	}

	@Test
	public void numeroCemUm() {
		NumeroDecimal decimalNumber = new NumeroDecimal("101");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("CI", algarismo);
	}

	@Test
	public void numeroCemDois() {
		NumeroDecimal decimalNumber = new NumeroDecimal("102");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("CII", algarismo);
	}

	@Test
	public void numeroCemTres() {
		NumeroDecimal decimalNumber = new NumeroDecimal("103");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("CIII", algarismo);
	}

	@Test
	public void numeroCemQuatro() {
		NumeroDecimal decimalNumber = new NumeroDecimal("104");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("CIV", algarismo);
	}

	@Test
	public void numeroCemCinco() {
		NumeroDecimal decimalNumber = new NumeroDecimal("105");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("CV", algarismo);
	}

	@Test
	public void numeroCemSeis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("106");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("CVI", algarismo);
	}

	@Test
	public void numeroCemSete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("107");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("CVII", algarismo);
	}

	@Test
	public void numeroCemOito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("108");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("CVIII", algarismo);
	}

	@Test
	public void numeroCemNove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("109");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("CIX", algarismo);
	}

}
