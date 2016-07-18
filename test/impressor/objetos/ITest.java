package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;

public class ITest {

	@Test
	public void numeroUm() {
		NumeroDecimal decimalNumber = new NumeroDecimal("1");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("I", algarismo);
	}

	@Test
	public void numeroDois() {
		NumeroDecimal decimalNumber = new NumeroDecimal("2");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("II", algarismo);
	}

	@Test
	public void numeroTres() {
		NumeroDecimal decimalNumber = new NumeroDecimal("3");
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("III", algarismo);
	}

	
	

}
