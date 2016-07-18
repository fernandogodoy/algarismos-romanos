package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class LXXXTest {

	@Test
	public void numeroOitenta() {
		NumeroDecimal decimalNumber = new NumeroDecimal("80");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXX", algarismo);
	}

	@Test
	public void numeroOitentaUm() {
		NumeroDecimal decimalNumber = new NumeroDecimal("81");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXXI", algarismo);
	}

	@Test
	public void numeroOitentaDois() {
		NumeroDecimal decimalNumber = new NumeroDecimal("82");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXXII", algarismo);
	}

	@Test
	public void numeroOitentaTres() {
		NumeroDecimal decimalNumber = new NumeroDecimal("83");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXXIII", algarismo);
	}

	@Test
	public void numeroOitentaQuatro() {
		NumeroDecimal decimalNumber = new NumeroDecimal("84");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXXIV", algarismo);
	}

	@Test
	public void numeroOitentaCinco() {
		NumeroDecimal decimalNumber = new NumeroDecimal("85");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXXV", algarismo);
	}

	@Test
	public void numeroOitentaSeis() {
		NumeroDecimal decimalNumber = new NumeroDecimal("86");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXXVI", algarismo);
	}

	@Test
	public void numeroOitentaSete() {
		NumeroDecimal decimalNumber = new NumeroDecimal("87");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXXVII", algarismo);
	}

	@Test
	public void numeroOitentaOito() {
		NumeroDecimal decimalNumber = new NumeroDecimal("88");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXXVIII", algarismo);
	}

	@Test
	public void numeroOitentaNove() {
		NumeroDecimal decimalNumber = new NumeroDecimal("89");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("LXXXIX", algarismo);
	}

}
