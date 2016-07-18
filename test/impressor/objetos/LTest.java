package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class LTest {

	@Test
	public void numeroCinquenta() {
		NumeroDecimal decimalNumber = new NumeroDecimal("50");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("L", algarismo);
	}

	@Test
	public void numeroCinquentaUm() {
		NumeroDecimal decimalNumber = new NumeroDecimal("51");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LI", algarismo);
	}

	@Test
	public void numeroCinquentaDois() {
		NumeroDecimal decimalNumber = new NumeroDecimal("52");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LII", algarismo);
	}

	@Test
	public void numeroCinquentaTres() {
		NumeroDecimal decimalNumber = new NumeroDecimal("53");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LIII", algarismo);
	}

	@Test
	public void numeroCinquentaQuatro() {
		NumeroDecimal decimalNumber = new NumeroDecimal("54");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LIV", algarismo);
	}

	@Test
	public void numeroCinquentaCinco() {
		NumeroDecimal decimalNumber = new NumeroDecimal("55");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LV", algarismo);
	}

	@Test
	public void numeroCinquentaSeis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("56");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LVI", algarismo);
	}

	@Test
	public void numeroCinquentaSete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("57");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LVII", algarismo);
	}

	@Test
	public void numeroCinquentaOito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("58");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LVIII", algarismo);
	}

	@Test
	public void numeroCinquentaNove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("59");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LIX", algarismo);
	}

}
