package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class LXTest {

	@Test
	public void numeroSessenta() {
		NumeroDecimal decimalNumber = new NumeroDecimal("60");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LX", algarismo);
	}

	@Test
	public void numeroSessentaUm() {
		NumeroDecimal decimalNumber = new NumeroDecimal("61");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXI", algarismo);
	}

	@Test
	public void numeroSessentaDois() {
		NumeroDecimal decimalNumber = new NumeroDecimal("62");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXII", algarismo);
	}

	@Test
	public void numeroSessentaTres() {
		NumeroDecimal decimalNumber = new NumeroDecimal("63");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXIII", algarismo);
	}

	@Test
	public void numeroSessentaQuatro() {
		NumeroDecimal decimalNumber = new NumeroDecimal("64");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXIV", algarismo);
	}

	@Test
	public void numeroSessentaCinco() {
		NumeroDecimal decimalNumber = new NumeroDecimal("65");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXV", algarismo);
	}

	@Test
	public void numeroSessentaSeis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("66");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXVI", algarismo);
	}

	@Test
	public void numeroSessentaSete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("67");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXVII", algarismo);
	}

	@Test
	public void numeroSessentaOito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("68");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXVIII", algarismo);
	}

	@Test
	public void numeroSessentaNove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("69");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXIX", algarismo);
	}

}
